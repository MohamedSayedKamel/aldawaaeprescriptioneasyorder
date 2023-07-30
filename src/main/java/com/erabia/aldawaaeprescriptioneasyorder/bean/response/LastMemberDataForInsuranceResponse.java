package com.erabia.aldawaaeprescriptioneasyorder.bean.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LastMemberDataForInsuranceResponse {
	@Expose
	@SerializedName("status")
	private boolean status;
	@Expose
	@SerializedName("memberName")
    private String memberName;
	@Expose
	@SerializedName("memberNationalId")
    private String memberNationalId;
	@Expose
	@SerializedName("insuranceCompanyId")
    private String insuranceCompanyId;
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberNationalId() {
		return memberNationalId;
	}
	public void setMemberNationalId(String memberNationalId) {
		this.memberNationalId = memberNationalId;
	}
	public String getInsuranceCompanyId() {
		return insuranceCompanyId;
	}
	public void setInsuranceCompanyId(String insuranceCompanyId) {
		this.insuranceCompanyId = insuranceCompanyId;
	}
	
}
