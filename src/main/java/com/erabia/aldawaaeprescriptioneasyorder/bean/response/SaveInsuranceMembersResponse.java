package com.erabia.aldawaaeprescriptioneasyorder.bean.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SaveInsuranceMembersResponse {
	@Expose
	@SerializedName("status")
	private boolean status;
	@Expose
	@SerializedName("requestId")
    private String requestId;
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	
}
