package ehealth.endpoint;

import ehealth.ws.*;
import javax.xml.ws.Endpoint;

public class LifeCoachPublisher {

	public static String SERVER_URL = "http://localhost";
	public static String PORT = "8000";
	public static String BASE_URL = "/ehealth/LifestyleCoach";

	public static String getEndpointURL() {
		return SERVER_URL+":"+PORT+BASE_URL;
	}

	public static void main(String[] args) {
		String endpointUrl = getEndpointURL();
		System.out.println("Starting LifeCoach Service...");
		System.out.println("--> Published at = "+endpointUrl);
		Endpoint.publish(endpointUrl, new LifestyleCoachImpl());
	}
}
