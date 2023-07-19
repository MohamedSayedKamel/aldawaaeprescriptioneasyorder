package com.erabia.aldawaaeprescriptioneasyorder.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InsuranceMembersListBean {
	@Expose
	@SerializedName("value")
	private String value;
	@Expose
	@SerializedName("name")
	private String name;
	@Expose
	@SerializedName("nId")
	private String nId;
	@Expose
	@SerializedName("insuranceCompanyId")
	private String insuranceCompanyId;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
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
	public String getInsuranceCompanyId() {
		return insuranceCompanyId;
	}
	public void setInsuranceCompanyId(String insuranceCompanyId) {
		this.insuranceCompanyId = insuranceCompanyId;
	}
	
	
}
