package ehealth.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="Goal")
@NamedQuery(name="Goal.findAll", query="SELECT g FROM Gaol g")
public class Goal implements Serializable{

	private static final long serialVersionUID = 1L;
	public Goal(){}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int GoalId;
	public int getGoalId() {
		return this.GoalId;
	}
	public void setGoalId(int goalId) {
		this.GoalId = goalId;
	}
	
	@Column(length=45)
	private String Goal;
	public String getGoal() {
		return this.Goal;
	}
	public void setGoal(String goal) {
		this.Goal = goal;
	}
	
	private int byCareGiver;
	public int getByCareGiver() {
		return this.byCareGiver;
	}
	public void setByCareGiver(int byCareGiver) {
		this.byCareGiver = byCareGiver;
	}
	
	private int byUserProfile;
	public int getByUserProfile() {
		return this.byUserProfile;
	}
	public void setByUserProfile(int byUserProfile) {
		this.byUserProfile = byUserProfile;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date scheduleDateTime;
	public Date getScheduleDateTime() {
		return this.scheduleDateTime;
	}
	public void setScheduleDateTime(Date scheduleDateTime) {
		this.scheduleDateTime = scheduleDateTime;
	}
	
	@Column(length=45)
	private String Progress;
	public String getProgress() {
		return this.Progress;
	}
	public void setProgress(String progress) {
		this.Progress = progress;
	}
	
	//bi-directional many-to-one association to Userprofile
	@ManyToOne
	@JoinColumn(name="Uid", nullable=false)
	private UserProfile userprofile;
	public UserProfile getUserprofile() {
		return this.userprofile;
	}
	public void setUserProfile(UserProfile userprofile) {
		this.userprofile = userprofile;
	}
}
