package ehealth.external;

import javax.ws.rs.client.*;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;

import org.json.simple.*;

public class GetForismatic {

	public static void main(String args[]){
		GetForismatic object = new GetForismatic();
		object.getquote();
	}
	public Forismatic getquote(){
		Client client = ClientBuilder.newClient();
		WebTarget resource = client
				.target("http://api.forismatic.com/api/1.0/")
				.queryParam("method", "getQuote").queryParam("lang", "en")
				.queryParam("format", "json");

		Builder req = resource.request().accept(MediaType.APPLICATION_JSON);

		Response response = req.post(null);

		if (response.getStatusInfo().getFamily() == Family.SUCCESSFUL) {

			try {
				String jsonRes = response.readEntity(String.class);

				Object jsonObj = JSONValue.parse(jsonRes);

				JSONObject rootObj = (JSONObject) jsonObj;

				Forismatic quoteObj = new Forismatic();

				quoteObj.quote = rootObj.get("quoteText").toString();
				quoteObj.Author = rootObj.get("quoteAuthor").toString();
				quoteObj.Link = rootObj.get("quoteLink").toString();

				System.out.println("Quote: " + quoteObj.quote);

				return quoteObj;

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("ERROR! " + response.getStatus());
			System.out.println(response.toString());
		}
		return null;
	}
}
