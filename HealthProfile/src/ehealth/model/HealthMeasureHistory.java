package ehealth.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="HealthMeasureHistory")
public class HealthMeasureHistory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public HealthMeasureHistory(){
		
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int HMid;
	public int getHMid(){
		return HMid;	
	}
	public void setHMid(int HMid){
		this.HMid=HMid;
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
	
	@Column(nullable=false)
	private double value;
	public double getValue(){
		return value;
	}
	public void setValue(Double value){
		this.value=value;
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
