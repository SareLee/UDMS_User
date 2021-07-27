package com.example.user.VO;

import com.example.user.entity.Department;
import com.example.user.entity.SBUser;

public class ResponseTemplateVO {
	private SBUser user;
	private Department department;
	public ResponseTemplateVO(SBUser user, Department department) {
		super();
		this.user = user;
		this.department = department;
	}
	
	public ResponseTemplateVO() {
		super();
	}

	public SBUser getUser() {
		return user;
	}
	public void setUser(SBUser user) {
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
