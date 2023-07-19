package com.erabia.aldawaaeprescriptioneasyorder.bean.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MemberRequestBean {

	@Expose
	@SerializedName("name")
	private String name;
	@Expose
	@SerializedName("nId")
	private String nId;		
	@Expose
	@SerializedName("insuranceCompanyId")
	private long insuranceCompanyId;
	
	
	public MemberRequestBean(String name, String nId, long insuranceCompanyId) {
		super();
		this.name = name;
		this.nId = nId;
		this.insuranceCompanyId = insuranceCompanyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getnId() {
		return nId;
	}
	public void setnId(String nId) {
		this.nId = nId;
	}
	public long getInsuranceCompanyId() {
		return insuranceCompanyId;
	}
	public void setInsuranceCompanyId(long insuranceCompanyId) {
		this.insuranceCompanyId = insuranceCompanyId;
	}
	
	
}
