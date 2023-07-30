package com.erabia.aldawaaeprescriptioneasyorder.bean.response;

import java.util.List;

public class AbstractCustomerResponse<T> {
	private boolean status;
	private long total;
	private long pages;
	private List<T> response;
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public long getPages() {
		return pages;
	}
	public void setPages(long pages) {
		this.pages = pages;
	}
	public List<T> getResponse() {
		return response;
	}
	public void setResponse(List<T> response) {
		this.response = response;
	}
	
}
