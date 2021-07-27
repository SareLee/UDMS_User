package com.example.user.entity;

public class Department {
	
	private Long deptId;
	private String deptNm;
	private String deptAdd;
	private String deptCd;
	public Department() {
		super();
	}
	public Department(Long deptId, String deptNm, String deptAdd, String deptCd) {
		super();
		this.deptId = deptId;
		this.deptNm = deptNm;
		this.deptAdd = deptAdd;
		this.deptCd = deptCd;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptNm=" + deptNm + ", deptAdd=" + deptAdd + ", deptCd=" + deptCd
				+ "]";
	}
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public String getDeptNm() {
		return deptNm;
	}
	public void setDeptNm(String deptNm) {
		this.deptNm = deptNm;
	}
	public String getDeptAdd() {
		return deptAdd;
	}
	public void setDeptAdd(String deptAdd) {
		this.deptAdd = deptAdd;
	}
	public String getDeptCd() {
		return deptCd;
	}
	public void setDeptCd(String deptCd) {
		this.deptCd = deptCd;
	}
	
	
	
}
