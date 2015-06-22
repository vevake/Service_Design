package ehealth.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="MeasureDefinition")
@NamedQuery(name="MeasureDefinition.findAll", query="SELECT m FROM MeasureDefinition m")
public class MeasureDefinition implements Serializable{

	private static final long serialVersionUID = 1L;
	public MeasureDefinition(){
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Mid",unique=true, nullable=false)
	private int Mid;
	public int getMid(){
		return Mid;
	}
	public void setMid(int Mid){
		this.Mid=Mid;
		
	}
	
	@Column(nullable=false, length=20)
	private String measureName;
	public String getMeasureName(){
		return measureName;
	}
	public void setMeasureName(String measureName){
		this.measureName=measureName;
	}
	
	@Column(nullable=false, length=20)
	private String measureType;
	public String getMeasureType(){
		return measureType;
	}
	public void setMeasureType(String measureType){
		this.measureType=measureType;
	}
	
}
