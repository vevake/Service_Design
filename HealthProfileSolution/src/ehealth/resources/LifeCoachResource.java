package ehealth.resources;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import ehealth.model.UserProfile;
import ehealth.model.Person;

@Stateless
@LocalBean
@Path("/rest")
public class LifeCoachResource {
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	
	/*
	 * Retrieves UserProfile by passing username
	 */
	@GET
	@Path("profile")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public UserProfile getUserProfile(@QueryParam("username") String username) {
		UserProfile user = Person.getUserByUsername(username);
		System.out.println(user.getLname());
		return user;
	}
	
	@GET
	@Path("AllProfile")
	@Produces({ MediaType.TEXT_XML, MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML })
	@Consumes({ MediaType.TEXT_XML, MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML })
	public List<UserProfile> getUserProfile() {
		List<UserProfile> user = Person.getAllUsers();
		return user;
	}
}
