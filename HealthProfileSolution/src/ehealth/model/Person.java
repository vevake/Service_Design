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
		UserProfile user=em.createQuery("SELECT u from UserProfile where username='"+username+"'",UserProfile.class).getSingleResult();
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
	public static LifeStatus getLifeStatusbyUserId(int Uid){
		EntityManager em=LifestyleCoachDAO.instance.createEntityManager();
		try{
		LifeStatus l=em.find(LifeStatus.class, Uid);
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
	
}
