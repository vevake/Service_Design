package ehealth.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="CareGiver")
@NamedQuery(name="CareGiver.findAll", query="SELECT c FROM CareGiver c")
public class CareGiver implements Serializable{

	private static final long serialVersionUID = 1L;
	public CareGiver() {}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int CGid;
	public int getCGid() {
		return this.CGid;
	}
	public void setCGid(int CGid) {
		this.CGid = CGid;
	}
	
	@Column(length=45)
	private String CGName;
	public String getCGName() {
		return this.CGName;
	}
	public void setCGName(String CGName) {
		this.CGName = CGName;
	}
	
	//bi-directional many-to-one association to UserProfile
	@ManyToOne
	@JoinColumn(name="care_Uid", nullable=false)
	private UserProfile UserProfile1;
	public UserProfile getUserprofile1() {
		return this.UserProfile1;
	}
	public void setUserprofile1(UserProfile userprofile1) {
		this.UserProfile1 = userprofile1;
	}
	
	//bi-directional many-to-one association to UserProfile
	@ManyToOne
	@JoinColumn(name="UPid", nullable=false)
	private UserProfile UserProfile2;
	public UserProfile getUserprofile2() {
		return this.UserProfile2;
	}
	public void setUserprofile2(UserProfile userprofile2) {
		this.UserProfile2 = userprofile2;
	}
}
