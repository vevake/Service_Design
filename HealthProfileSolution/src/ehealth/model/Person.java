package ehealth.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import ehealth.dao.LifestyleCoachDAO;;

public class Person {
	
	/*
	 * Retrieves the UserProfile matching the username from database
	 * 
	 */
	public static UserProfile getUserByUsername(String username){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		try{	
			System.out.println(username);
			UserProfile user=em.createQuery("SELECT u from UserProfile u where u.username='"+username+"'",UserProfile.class).getSingleResult();
			return user;
		}
		finally{
		LifestyleCoachDAO.instance.closeConnections(em);
		}		
	}
	
	/*
	 * Retrieves the UserProfile matching the username from database
	 * 
	 */
	public static UserProfile getUserByUserId(int Uid){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		try{
		UserProfile user=em.createQuery("SELECT u from UserProfile where Uid='"+Uid+"'",UserProfile.class).getSingleResult();
		return user;
		}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
			}
	}
	
	/*
	 * Saves the UUID in the DB
	 */
	public static String savekey(String username, String uuidString){
		UserProfile u=getUserByUsername(username);
		u.setKey(uuidString);
		u=updatePerson(u);
		return u.getKey();
	}
	
	/*
	 * Create new user 
	 */
	public static UserProfile createUser(UserProfile u){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		try{
		EntityTransaction tx= em.getTransaction();
		tx.begin();
		em.persist(u);
		tx.commit();
		return u;
		}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
			}
	}
	
	/*
	 * Delete a User Profile
	 */
	public static void deleteUser(int Uid){
		UserProfile u=getUserByUserId(Uid);
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		try{
		EntityTransaction tx= em.getTransaction();
		tx.begin();
		u=em.merge(u);
		em.remove(u);
		tx.commit();
		}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
			}
	}
	
	/*
	 * Updates UserProfile
	 */
	public static UserProfile updatePerson(UserProfile u){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		EntityTransaction tx= em.getTransaction();
		try{
		tx.begin();
		u=em.merge(u);
		tx.commit();
		return u;
		}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
			}
	}
	
	/*
	 * Retrieves the details of all users
	 */
	public static List<UserProfile> getAllUsers(){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		try{
		List<UserProfile> list =em.createNamedQuery("UserProfile.findAll", UserProfile.class).getResultList();
		return list;
		}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
			}
	}
	
	/*
	 * Retrieves the Recent LifeStatus by matching the UserID
	 */
	public static List<LifeStatus> getLifeStatusbyUserId(int Uid){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		try{
		List<LifeStatus> l=em.createNativeQuery("SELECT * from LifeStatus WHERE Uid="+Uid, LifeStatus.class).getResultList();
		return l;
		}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
			}
	}
	
	/*
	 * Retrieves all the Recent LifeStatus of Users
	 */
	public static List<LifeStatus> getAllLifeStatus(){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		try{
		List<LifeStatus> l= em.createNativeQuery("SELECT * from LifeStatus", LifeStatus.class).getResultList();
		return l;
		}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
			}
	}
	
	/*
	 * Retrieves the Recent LifeStatus of User for specific measure
	 */
	public static LifeStatus getLifeStatusbyUserIdAndMeasureId(int Uid, int Mid ){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		try{
		LifeStatus l=(LifeStatus)em.createNativeQuery("SELECT * from LifeStatus WHERE Uid="+Uid+" AND Mid="+Mid, LifeStatus.class).getResultList();
		return l;
		}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
			}
	}
	
	/*
	 * Delete a LifeStatus
	 */
	public static int deleteLifeStatus(LifeStatus ls){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		try{
			EntityTransaction tx= em.getTransaction();
			tx.begin();
			ls=em.merge(ls);
			em.remove(ls);
			tx.commit();
			return 1;
		}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
		}
	}
	
	/*
	 * Save a LifeStatus
	 */
	public static LifeStatus saveLifeStatus(LifeStatus ls){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		try{
			EntityTransaction tx= em.getTransaction();
			tx.begin();
			em.persist(ls);
			tx.commit();
			return ls;
		}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
		}
	}
	
	/*
	 * Retrieves the HealthMeasureHistory of User
	 */
	public static HealthMeasureHistory getHealthHistorybyUserId(int Uid){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		try{
		HealthMeasureHistory h=em.find(HealthMeasureHistory.class, Uid);
		return h;
		}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
			}
	}
	
	/*
	 * Retrieves the HealthMeasureHistory of all user
	 */
	public static List<HealthMeasureHistory> getHealthHistory(){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		try{
		List<HealthMeasureHistory> h=em.createNativeQuery("SELECT * FROM HealthMeasureHistory", HealthMeasureHistory.class).getResultList();
		return h;
		}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
			}
	}
	
	/*
	 * Save HealthMeasureHistory
	 */
	public static void saveHealthMeasureHistory(HealthMeasureHistory hm){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		EntityTransaction tx= em.getTransaction();
		try{
			tx.begin();
			em.persist(hm);
			tx.commit();
		}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
		}
	}
	
	/*
	 * Get All Measures Definition
	 */
	public static List<MeasureDefinition> getAllMeasureDefinition(){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		try{
		List<MeasureDefinition> list=em.createNamedQuery("MeasureDefinition.findAll", MeasureDefinition.class).getResultList();
		return list;
		}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
			}
	}
	/*
	 * Get Measures Definition for a measure name
	 */
	public static MeasureDefinition getMeasureDefinition(String mName){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		try{
		MeasureDefinition md=(MeasureDefinition)em.createNativeQuery("SELECT m from MeasureDefinition WHERE measureName='"+mName+"'", MeasureDefinition.class).getSingleResult();
		return md;
		}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
			}
	}
	
	/*
	 * Retrieve the current goal of the user
	 */
	public static List<Goal> getGoalbyUserId(int Uid){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		try{
			System.out.println("qwerty");
			List<Goal> g=em.createNativeQuery("SELECT * from Goal WHERE Uid="+Uid+" AND Progress='complete'", LifeStatus.class).getResultList();
			return g;
		}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
		}
		
	}
	
	/*
	 * Retrieve goal by GoalID
	 */
	public static Goal getGoalbyId(int goalId){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		try{
			Goal g = em.find(Goal.class, goalId);
			return g;
		}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
		}
	}
	
	/*
	 * Set Goal for a user
	 */
	public static Goal SaveGoal(Goal g){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		EntityTransaction tx= em.getTransaction();
		try{
			tx.begin();
			em.persist(g);
			tx.commit();
			return g;
		}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
		}
	}
	
	/*
	 * Update an existing Goal
	 */
	public static Goal GoalUpdate(Goal g){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		EntityTransaction tx= em.getTransaction();
		try{
			tx.begin();
			g=em.merge(g);
			tx.commit();
			return g;
		}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
		}		
	}
	
	/*
	 * Delete a goal
	 */
	public static int RemoveGoal(Goal goal){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		try{
			EntityTransaction tx= em.getTransaction();
			tx.begin();
			goal=em.merge(goal);
			em.remove(goal);
			tx.commit();
			return 1;
			}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
		}
	}
	
	/*
	 * Return the Motivational advice for the user 
	 */
	public static String getAdvice(int Uid){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		try{
			String advice = (String)em.createNativeQuery("SELECT Advice from Advice WHERE Uid="+Uid+", Advice.class").getSingleResult();
			return advice;
		}
		finally{
			LifestyleCoachDAO.instance.closeConnections(em);
		}
	}
}
