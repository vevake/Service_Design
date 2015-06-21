package ehealth.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="CareGiver")
@NamedQuery(name="CareGiver.findAll", query="SELECT c FROM CareGiver c")
public class Caregiver implements Serializable{

	private static final long serialVersionUID = 1L;
	public Caregiver() {}
	
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
	
	//bi-directional many-to-one association to UserProfile
	@ManyToOne
	@JoinColumn(name="Care_UPid", nullable=false)
	private UserProfile userprofile;
	public UserProfile getUserprofile() {
		return this.userprofile;
	}
	public void setUserprofile(UserProfile userprofile) {
		this.userprofile = userprofile;
	}
}
