package ehealth.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="LifeStatus")
public class LifeStatus implements Serializable{

	private static final long serialVersionUID = 1L;
	public LifeStatus(){
		
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int LSid;
	public int getLSid(){
		return LSid;
	}
	public void setLSid(int LSid){
		this.LSid=LSid;
	}

	@Column(nullable=false)
	private double value;
	public double getValue(){
		return value;
	}
	public void setValue(double value){
		this.value=value;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date DateTime;
	public Date getDateTime(){
		return DateTime;
	}
	public void setDateTime(Date DateTime){
		this.DateTime=DateTime;
	}
	
	//Many-to-one association to MeasureDefinition
	@ManyToOne
	@JoinColumn(name="Mid", nullable=false)
	private MeasureDefinition measureDefinition;
	public MeasureDefinition getMeasureDefinition(){
		return measureDefinition;
	}
	public void setMeasureDefinition(MeasureDefinition measureDefinition){
		this.measureDefinition=measureDefinition;
	}
	
	//Many-to-one association to UserProfile
	@ManyToOne
	@JoinColumn(name="Uid", nullable=false)
	private UserProfile userProfile;
	public UserProfile getUserProfile(){
		return userProfile;
	}
	public void setUserProfile(UserProfile userProfile){
		this.userProfile=userProfile;
	}
	
}
