package ehealth.ws;

import java.util.*;

import javax.jws.WebService;

import ehealth.model.*;

@WebService(endpointInterface = "ehealth.ws.LifestyleCoach",serviceName="HealthProfile")
public class LifestyleCoachImpl implements LifestyleCoach {

	/*
	 * Implementation of login 
	 * (non-Javadoc)
	 * @see ehealth.ws.LifestyleCoach#login(java.lang.String, java.lang.String)
	 */
	@Override
	public String login(String username, String password) {
		if(!username.isEmpty()){
			UserProfile user = Person.getUserByUsername(username);
			if(user.getPassword()==password){
				UUID uid=UUID.randomUUID();
				String uuidString=uid.toString();
				String key=Person.savekey(username,uuidString);
				return key;
			}
			else{
				return "Invalid login";
			}
		}
		else{
			return "Enter username";	
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see ehealth.ws.LifestyleCoach#logout(java.lang.String, java.lang.String)
	 */
	@Override
	public String logout(String username, String key) {
		UserProfile u=Person.getUserByUsername(username);
		u.setKey(null);
		Person.updatePerson(u);
		return "Logout Successful";
	}
	
	/*
	 * Retrieve user profile by username
	 * (non-Javadoc)
	 * @see ehealth.ws.LifestyleCoach#getUserProfile(java.lang.String)
	 */
	@Override
	public UserProfile getUserProfile(String username, String key) {
		if(loginCheck(username,key) ==1){
			UserProfile user=Person.getUserByUsername(username);
			return user;
		}			
		else
			return null;
	}
	
	/*
	 * Retrieves all users
	 */
	@Override
	public List<UserProfile> getAllUsers(){
		List<UserProfile> list=Person.getAllUsers();
		return list;
	}
	
	/*Create New User
	 * (non-Javadoc)
	 * @see ehealth.ws.LifestyleCoach#createNewUser(ehealth.model.UserProfile)
	 */
	@Override
	public int createNewUser(UserProfile u) {
		Person.createUser(u);
		return u.getUid();
	}
	
	/*
	 * Delete New User
	 * (non-Javadoc)
	 * @see ehealth.ws.LifestyleCoach#deleteUser(int)
	 */
	@Override
	public int deleteUser(int Uid) {
		Person.deleteUser(Uid);
		return 1;
	}

	/*
	 * Perform login check
	 */
	public int loginCheck(String username, String key){
		if(!username.isEmpty()){	
			UserProfile u= Person.getUserByUsername(username);
			if(u.getKey().equals(key)){
				return 1;
			}
		}
		return 0;
	}

	/*
	 * Get all measures Definition
	 * (non-Javadoc)
	 * @see ehealth.ws.LifestyleCoach#getMeasuresDefinition()
	 */
	@Override
	public List<MeasureDefinition> getMeasuresDefinition() {
		List<MeasureDefinition> list= Person.getAllMeasureDefinition();
		return list;
	}	
}	
