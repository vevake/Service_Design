package ehealth.client;

import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class client {
	private static final String TEST_username = "vvek";
	private static final String TEST_key = "c1c53056-081e-4a15-a716-32d4eed35a23";
	
	public static void main(String[] args) {
	
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		
		WebResource service = client.resource(getBaseURI());
		
		//Retrieve a selected UserProfile
		testUserProfile(service);
		
		//Retrieve all user Profile
		testAllUserProfile(service);
	}
	
	private static URI getBaseURI() {
		return UriBuilder.fromUri(
				"http://localhost:8000/rest/healthsolutions/").build();
	}
	
	public static void testUserProfile(WebResource service){
		System.out.println("\nGET /rest/profile/"+TEST_username+" [Accept: xml]");
		try{
			System.out.println(service.path("rest/profile/?username"+TEST_username).accept(MediaType.APPLICATION_XML).get(String.class));
		}
		catch (UniformInterfaceException e){
			System.out.println(e.getMessage());}
		System.out.println("\nGET /rest/profile/?username"+TEST_username+" [Accept: json]");
		try{
		System.out.println(service.path("rest/profile/?username"+TEST_username).accept(MediaType.APPLICATION_JSON).get(String.class));}
		catch (UniformInterfaceException e){
			System.out.println(e.getMessage());}
	}
	public static void testAllUserProfile(WebResource service){
		System.out.println("\nGET /rest/Allprofile/ [Accept: xml]");
		try{
			System.out.println(service.path("rest/Allprofile/").accept(MediaType.APPLICATION_XML).get(String.class));
		}
		catch (UniformInterfaceException e){
			System.out.println(e.getMessage());}
		System.out.println("\nGET /rest/Allprofile/ [Accept: json]");
		try{
		System.out.println(service.path("rest/Allprofile/").accept(MediaType.APPLICATION_JSON).get(String.class));}
		catch (UniformInterfaceException e){
			System.out.println(e.getMessage());}
	}
}
