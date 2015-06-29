package ehealth.external;

import java.awt.Desktop;
import java.io.*;
import java.net.*;
import java.util.Properties;

import twitter4j.*;
import twitter4j.auth.*;

public class UpdateStatus {
Twitter twitter = new TwitterFactory().getInstance();
	
	private void loginTwitter(){
		File file = new File("twitter4j.properties");
		Properties prop = new Properties();
		InputStream is = null;
		OutputStream os = null;
		try {
			if (file.exists()) {
				is = new FileInputStream(file);
				prop.load(is);
			}
			prop.setProperty("oauth.consumerKey", "Cbhya9VRO12gzQg5Bsyaz9o4e");
			prop.setProperty("oauth.consumerSecret",
					"fnJujPPnhVECH2VA5bXqaWAxUj0nCvI4g0Pfq8As0hwV34eI16");
			os = new FileOutputStream("twitter4j.properties");
			prop.store(os, "twitter4j.properties");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException ignore) {
				}
			}
			if (os != null) {
				try {
					os.close();
				} catch (IOException ignore) {
				}
			}
		}
		try {

			try {
				RequestToken requestToken = twitter.getOAuthRequestToken();
				System.out.println("Got request token.");
				System.out.println("Request token: " + requestToken.getToken());
				System.out.println("Request token secret: "
						+ requestToken.getTokenSecret());
				AccessToken accessToken = null;

				BufferedReader br = new BufferedReader(new InputStreamReader(
						System.in));
				while (null == accessToken) {
					System.out
							.println("Open the following URL and grant access to your account:");
					System.out.println(requestToken.getAuthorizationURL());
					try {
						Desktop.getDesktop().browse(
								new URI(requestToken.getAuthorizationURL()));
					} catch (UnsupportedOperationException ignore) {
					} catch (IOException ignore) {
					} catch (URISyntaxException e) {
						throw new AssertionError(e);
					}
					System.out
							.print("Enter the PIN(if available) and hit enter after you granted access.[PIN]:");
					String pin = br.readLine();
					try {
						if (pin.length() > 0) {
							accessToken = twitter.getOAuthAccessToken(
									requestToken, pin);
						} else {
							accessToken = twitter
									.getOAuthAccessToken(requestToken);
						}
					} catch (TwitterException te) {
						if (401 == te.getStatusCode()) {
							System.out
									.println("Unable to get the access token.");
						} else {
							te.printStackTrace();
						}
					}
				}
				System.out.println("Got access token.");
				System.out.println("Access token: " + accessToken.getToken());
				System.out.println("Access token secret: "
						+ accessToken.getTokenSecret());

				try {
					prop.setProperty("oauth.accessToken",
							accessToken.getToken());
					prop.setProperty("oauth.accessTokenSecret",
							accessToken.getTokenSecret());
					os = new FileOutputStream(file);
					prop.store(os, "twitter4j.properties");
					os.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
					System.exit(-1);
				} finally {
					if (os != null) {
						try {
							os.close();
						} catch (IOException ignore) {
						}
					}
				}
			} catch (IllegalStateException ie) {
				if (!twitter.getAuthorization().isEnabled()) {
					System.out.println("OAuth consumer key/secret is not set.");
				}
			}
			
		} catch (TwitterException te) {
			te.printStackTrace();
			System.out.println("Failed to get timeline: " + te.getMessage());
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println("Failed to read the system input.");
		} catch (Exception e) {

		}
	}

	public int postTwitterStatus(String tweet) {

		try {
			
			loginTwitter();

			Status status = twitter.updateStatus(tweet);
			System.out.println("Successfully updated the status to ["
					+ status.getText() + "].");
			return 1;
		} catch (TwitterException te) {
			te.printStackTrace();
			System.out.println("Failed to get timeline: " + te.getMessage());
		} catch (Exception e) {

		}
		return 0;
	}

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out
					.println("Usage: java twitter4j.examples.tweets.UpdateStatus [text]");
			System.exit(-1);
		}
		UpdateStatus obj = new UpdateStatus();
		obj.postTwitterStatus(args[0]);
	}
}
