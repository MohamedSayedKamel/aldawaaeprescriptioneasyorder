package com.erabia.aldawaaeprescriptioneasyorder.bean.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomerRequestBean {
	@Expose
	@SerializedName("externalId")
	private long externalId;
	@Expose
	@SerializedName("name")
	private String name;
	@Expose
	@SerializedName("mobileNumber")
	private String mobileNumber;
	@Expose
	@SerializedName("email")
	private String email;
	@Expose
	@SerializedName("gender")
	private String gender;
	
	
	
	public CustomerRequestBean(long externalId, String name, String mobileNumber, String email, String gender) {
		super();
		this.externalId = externalId;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.gender = gender;
	}
	public long getExternalId() {
		return externalId;
	}
	public void setExternalId(long externalId) {
		this.externalId = externalId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
