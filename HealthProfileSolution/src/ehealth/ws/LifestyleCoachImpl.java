package ehealth.ws;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.jws.WebService;

import org.apache.tools.ant.taskdefs.Exit;

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
	 *Update an existing user 
	 */
	public int updateUser(UserProfile u, String user, String key){
		if(loginCheck(user,key) ==1){
			Person.updatePerson(u);
			return u.getUid();
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
	
	/*
	 * Add the current Lifestatus
	 */
	public LifeStatus addLifeStatus(String username, String key, Double value, String mType){
		if(loginCheck(username, key) == 1) {
			try {
				UserProfile u =Person.getUserByUsername(username);
				LifeStatus ls = new LifeStatus();
				HealthMeasureHistory hm = new HealthMeasureHistory();
				for (LifeStatus lifestatus : u.getLifeStatus()) {
					if (lifestatus.getMeasureDefinition().getMeasureName().equals(mType)) {
						hm.setDateTime(lifestatus.getDateTime());
						hm.setMeasureDefinition(lifestatus.getMeasureDefinition());
						hm.setUserProfile(u);
						hm.setValue(lifestatus.getValue());
						Person.deleteLifeStatus(lifestatus);
						Person.saveHealthMeasureHistory(hm);
						ls.setMeasureDefinition(lifestatus.getMeasureDefinition());
					}
				}
				ls.setUserProfile(u);
				ls.setValue(value);
				ls.setDateTime(new Date());
				LifeStatus l = Person.saveLifeStatus(ls);
				return l;				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/*
	 *Get the current Goal 
	 */
	@Override
	public List<Goal> getCurrentGoal(String user, String key){
		if (loginCheck(user, key) == 1) {
			try {
				UserProfile u = Person
						.getUserByUsername(user);
				List<Goal> g = Person.getGoalbyUserId(u.getUid());
				return g;
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/*
	 * Set Goal for a user
	 */
	@Override
	public Goal setGoal(Goal g, String username, String key) {
		if (loginCheck(username, key) == 1) {
			try {
				UserProfile u = Person
						.getUserByUsername(username);
				Goal g1 = Person.SaveGoal(g);
				return g;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/*
	 * Delete a user goal
	 */
	@Override
	public String deleteGoal(int GoalId,String username, String key){
		if (loginCheck(username, key) == 1) {
			try {
				Goal g =Person.getGoalbyId(GoalId);
				if(g!=null){
					int r=Person.RemoveGoal(g);
					return "Goal deleted";
				}
				else
					return "Goal not found";				
			}
			catch (Exception e) {
				return "Error. Try again";
			}
		}
		return "Login to continue";
	}
	
	/*
	 * Set a current goal as complete
	 */
	public Goal GoalUpdate(Goal g, String username, String key){
		if (loginCheck(username, key) == 1) {
			try {
				Goal g1= Person.GoalUpdate(g);
				return g1;
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/*
	 * Get Motivation quotes
	 */
	public String getMotivation(String username, String key){
		if (loginCheck(username, key) == 1) {
			try {
				UserProfile u= Person.getUserByUsername(username);
				String Advice= Person.getAdvice(u.getUid());
				return Advice;
			}
			catch (Exception e) {
				return "Error.Please try again";
				
			}
		}
		else 
			return "Please log-in";
	}	
	
	/*
	 * Get push notifications for Goals
	 */
	public Goal getPushMessage(String username, String key){
		if (loginCheck(username, key) == 1) {
			try {
					UserProfile u = Person.getUserByUsername(username);
					List<Goal> g = Person.getGoalbyUserId(u.getUid());
					Date date= new Date();
					for(int i=0; i<=g.size(); i++)
					{
						Goal g1 = g.get(i);
						Date goalDate = g1.getScheduleDateTime();
						if(date.after(goalDate)){
							if(g1.getProgress().equals("current")){
								return g1;
							}
						}
					}						
				}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
