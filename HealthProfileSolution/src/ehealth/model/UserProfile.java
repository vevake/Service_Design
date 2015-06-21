package ehealth.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name="UserProfile")
public class UserProfile implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public UserProfile(){}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int Uid;
	public int getUid() {
		return this.Uid;
	}
	public void setUid(int Uid) {
		this.Uid = Uid;
	}
	
	@Column(nullable=false, length=20)
	private String fname;
	public String getFname() {
		return this.fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	@Column(nullable=false, length=20)
	private String lname;
	public String getLname() {
		return this.lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	@Column(nullable=false, length=20)
	private String username;
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(nullable=false, length=20)
	private String password;
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(nullable=false, length=20)
	private String key;
	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}	
	
	//bi-directional many-to-one association to LifeStatus
	@OneToMany(mappedBy="UserProfile")
	private List<LifeStatus> LifeStatus;
	@XmlTransient
	public List<LifeStatus> getLifeStatus() {
		return this.LifeStatus;
	}

	public void setLifeStatus(List<LifeStatus> LifeStatus) {
		this.LifeStatus = LifeStatus;
	}
	
	//bi-directional many-to-one association to Goal
	@OneToMany(mappedBy="UserProfile")
	private List<Goal> Goal;
	@XmlTransient
	public List<Goal> getGoal() {
		return this.Goal;
	}

	public void setGoal(List<Goal> Goal) {
		this.Goal = Goal;
	}
		
	//bi-directional many-to-one association to HealthMeasureHistory
	@OneToMany(mappedBy="UserProfile")
	private List<HealthMeasureHistory> HealthMeasureHistory;
	@XmlTransient
	public List<HealthMeasureHistory> getHealthMeasureHistory() {
		return this.HealthMeasureHistory;
	}

	public void setHealthMeasureHistory(List<HealthMeasureHistory> HealthMeasureHistory) {
		this.HealthMeasureHistory = HealthMeasureHistory;
	}

	
	//bi-directional many-to-one association to CareGiver
	@OneToMany(mappedBy="UserProfile")
	private List<Caregiver> Caregiver;
	@XmlTransient
	public List<Caregiver> getCaregiver() {
		return this.Caregiver;
	}

	public void setCaregiver(List<Caregiver> Caregiver) {
		this.Caregiver = Caregiver;
	}
	
	//bi-directional many-to-one association to Advice
	@OneToMany(mappedBy="UserProfile")
	private List<Advice> advice;
	@XmlTransient
	public List<Advice> getAdvice() {
		return this.advice;
	}

	public void setAdvice(List<Advice> advice) {
		this.advice = advice;
	}
			
}
