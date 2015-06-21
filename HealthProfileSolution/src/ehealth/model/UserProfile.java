package ehealth.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	
}
