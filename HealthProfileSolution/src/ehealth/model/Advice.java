package ehealth.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import ehealth.model.UserProfile;

@Entity
@Table(name="Advice")
@NamedQuery(name="Advice.findAll", query="SELECT a FROM Advice a")
@XmlRootElement
public class Advice implements Serializable{
	private static final long serialVersionUID = 1L;
	public Advice() {}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int AId;
	public int getAId() {
		return this.AId;
	}
	public void setAId(int aid) {
		this.AId = aid;
	}
	
	
	@Column(length=500)
	private String Advice;
	public String getAdvice() {
		return this.Advice;
	}
	public void setAdvice(String advice) {
		this.Advice = advice;
	}

	//bi-directional many-to-one association to UserProfile
	@ManyToOne
	@JoinColumn(name="Uid", nullable=false)
	private UserProfile userprofile;
	public UserProfile getUserProfile() {
		return this.userprofile;
	}
	public void setUserProfile(UserProfile userprofile) {
		this.userprofile = userprofile;
	}
	
	//bi-directional many-to-one association to Measuredefinition
	@ManyToOne
	@JoinColumn(name="MedicId", nullable=false)
	private Medic medic;
	@XmlTransient
	public Medic getMedic() {
		return this.medic;
	}
	public void setMedic(Medic medic) {
		this.medic = medic;
	}
	

}
