package ehealth.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="MeasureDefaultRange")
@NamedQuery(name="MeasureDefaultRange.findAll", query="SELECT m FROM MeasureDefaultRange m")
public class MeasureDefaultRange implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public MeasureDefaultRange(){}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int MRid;
	public int getMRId() {
		return this.MRid;
	}
	public void setMRid(int mRid) {
		this.MRid = mRid;
	}

	@Column(nullable=false, length=45)
	private String rangeName;
	public String getRangeName() {
		return this.rangeName;
	}
	public void setRangeName(String rangeName) {
		this.rangeName = rangeName;
	}
	
	@Column(nullable=false)
	private double startValue;
	public double getStartValue() {
		return this.startValue;
	}
	public void setStartValue(double startValue) {
		this.startValue = startValue;
	}
	
	@Column(nullable=false)
	private double endValue;
	public double getEndValue() {
		return this.endValue;
	}
	public void setEndValue(double endValue) {
		this.endValue = endValue;
	}
	
	private int alarmLevel;
	public int getAlarmLevel() {
		return this.alarmLevel;
	}
	public void setAlarmLevel(int alarmLevel) {
		this.alarmLevel = alarmLevel;
	}
	
	//bi-directional many-to-one association to MeasureDefinition
	@ManyToOne
	@JoinColumn(name="Mid", nullable=false)
	private MeasureDefinition measuredefinition;
	public MeasureDefinition getMeasureDefinition() {
		return this.measuredefinition;
	}
	public void setMeasureDefinition(MeasureDefinition measuredefinition) {
		this.measuredefinition = measuredefinition;
	}
}
