package com.erabia.aldawaaeprescriptioneasyorder.bean.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SaveRequestCashResponse {
	@Expose
	@SerializedName("status")
	private boolean status;
	@Expose
	@SerializedName("requestId")
	private long requestId;
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public long getRequestId() {
		return requestId;
	}
	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}
	
	

}
