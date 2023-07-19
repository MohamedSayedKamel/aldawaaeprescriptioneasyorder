package com.erabia.aldawaaeprescriptioneasyorder.bean.response;

import java.util.List;

public class AbstractResponse<T> {
	
	private boolean status;
	
	private List<T> response;
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public List<T> getResponse() {
		return response;
	}
	public void setResponse(List<T> response) {
		this.response = response;
	}
	
	
	
	
}
