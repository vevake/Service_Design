package ehealth.ws;

import java.util.List;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.*;

import ehealth.model.MeasureDefinition;
import ehealth.model.UserProfile;
import ehealth.model.Goal;
import ehealth.model.LifeStatus;

@WebService(name="LifeCoach")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface LifestyleCoach {

	/*
	 * Validates login credentials for the user
	 */
	@WebMethod(operationName = "login")
	@WebResult(name = "login")
	public String login(@WebParam(name="username") String username, @WebParam(name="password") String password);
	
	/*
	 * Check if a user is logged-on
	 */
	@WebMethod(operationName = "loginCheck")
	@WebResult(name = "loginCheck")
	public int loginCheck(@WebParam(name="username") String username, @WebParam(name="key") String key);
	
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
	 * Update a userProfile
	 */
	@WebMethod(operationName="updateUser")
	@WebResult(name="updateUser")
	public int updateUser(@WebParam(name="user") UserProfile u,@WebParam(name="username") String username, @WebParam(name="key") String key);
	
	/*
	 * Get Measures Definition
	 */
	@WebMethod(operationName="getMeasuresDefinition")
	@WebResult(name="Measures")
	public List<MeasureDefinition> getMeasuresDefinition();
	
	/*
	 * add current lifeStatus of the user
	 */
	@WebMethod(operationName="addLifeStatus")
	@WebResult(name="LifeStatus")
	public LifeStatus addLifeStatus(@WebParam(name = "username") String username,@WebParam(name = "key") String key,@WebParam(name = "value") Double value,@WebParam(name = "measureType") String mType);
	
	/*
	 * Retrieve the current LifeStatus
	 */
	@WebMethod(operationName="viewLifeStatus")
	@WebResult(name="viewLifeStatus")
	public List<LifeStatus> viewLifeStatus(@WebParam(name="username") String username, @WebParam(name = "key") String key);
	
	/*
	 *Check for the current Goal 
	 */
	@WebMethod(operationName="getCurrentGoal")
	@WebResult(name="CurrentGoal")
	public List<Goal> getCurrentGoal(@WebParam(name="username") String user,@WebParam(name="key") String key);
	
	/*
	 * Set a goal for a user
	 */
	@WebMethod(operationName="setGoal")
	@WebResult(name="setGoal")
	public Goal setGoal(@WebParam(name="GoalId") Goal g, @WebParam(name="username") String user, @WebParam(name="key") String key );
	
	/*
	 * Delete a goal
	 */
	@WebMethod(operationName="deleteGoal")
	@WebResult(name="deleteGoal")
	public String deleteGoal(@WebParam(name="Goalid") int Goalid, @WebParam(name="username") String user, @WebParam(name="key") String key );
	
	/*
	 * Update an existing goal
	 */
	@WebMethod(operationName="GoalUpdate")
	@WebResult(name="GoalUpdate")
	public Goal GoalUpdate(@WebParam(name="goal") Goal g, @WebParam(name="username") String user, @WebParam(name="key") String key );
	
	/*
	 * Get motivation
	 */
	@WebMethod(operationName="GetMotivation")
	@WebResult(name="Motivation")
	public String getMotivation();
	//public String getMotivation(@WebParam(name="username") String user, @WebParam(name="key") String key);
	
	/*
	 * Get push notifications
	 */
	@WebMethod(operationName="GetPushMessage")
	@WebResult(name="PushMessage")
	public Goal getPushMessage(@WebParam(name="username") String user, @WebParam(name="key") String key);
}
