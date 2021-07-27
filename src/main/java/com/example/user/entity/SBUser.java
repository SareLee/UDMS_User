package com.example.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SBUser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String fName;
	private String lName;
	private String email;
	private Long deptId;
	public SBUser(Long id, String fName, String lName, String email, Long deptId) {
		super();
		this.userId = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.deptId = deptId;
	}
	public SBUser() {
		super();
	}
	public Long getId() {
		return userId;
	}
	public void setId(Long id) {
		this.userId = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "SBUser [id=" + userId + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", deptId=" + deptId
				+ "]";
	}
	
	
}
