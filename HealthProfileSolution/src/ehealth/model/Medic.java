package ehealth.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="Medic")
@NamedQuery(name="Medic.findAll", query="SELECT m FROM Medic m")
public class Medic implements Serializable{

	private static final long serialVersionUID = 1L;
	public Medic(){}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int MedicId;
	public int getMedicId() {
		return this.MedicId;
	}
	public void setMedicId(int medicId) {
		this.MedicId = medicId;
	}
	
	@Column(length=45)
	private String MedicName;
	public String getMedicName() {
		return this.MedicName;
	}
	public void setMedicName(String medicName) {
		this.MedicName = medicName;
	}
}
