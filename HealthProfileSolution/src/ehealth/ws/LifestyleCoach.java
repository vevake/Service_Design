package ehealth.ws;

import java.util.List;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.*;

import ehealth.model.MeasureDefinition;
import ehealth.model.UserProfile;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface LifestyleCoach {

	/*
	 * Validates login credentials for the user
	 */
	@WebMethod(operationName = "login")
	@WebResult(name = "login")
	public String login(@WebParam(name="username") String username, @WebParam(name="password") String password);
	
	/*
	 *logs out the user from the system 
	 */
	@WebMethod(operationName="logout")
	@WebResult(name="logout")
	public String logout(@WebParam(name="username") String username, @WebParam(name="Key") String key);
	
	/*
	 * Retrieves UserProfile matching the username
	 */
	@WebMethod(operationName = "getUserProfile")
	@WebResult(name = "profile")
	public UserProfile getUserProfile(@WebParam(name="username") String username, @WebParam(name="key") String key);
	
	/*
	 * Retrieve details of all users
	 */
	@WebMethod(operationName="getAllUsers")
	@WebResult(name="Users")
	public List<UserProfile> getAllUsers();
	
	/*
	 * Create new User
	 */
	@WebMethod(operationName="createUser")
	@WebResult(name="NewUser")
	public int createNewUser(@WebParam(name="user") UserProfile u);
	
	/*
	 * Delete User PRofile
	 */
	@WebMethod(operationName="deleteUser")
	@WebResult(name="deleteUser")
	public int deleteUser(@WebParam(name="Uid") int Uid);
	
	/*
	 * Get Measures Definition
	 */
	@WebMethod(operationName="getMeasuresDefinition")
	@WebResult(name="Measures")
	public List<MeasureDefinition> getMeasuresDefinition();
}
