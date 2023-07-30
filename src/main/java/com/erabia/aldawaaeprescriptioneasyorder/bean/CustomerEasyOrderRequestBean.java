package com.erabia.aldawaaeprescriptioneasyorder.bean;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomerEasyOrderRequestBean {
	
	@Expose
	@SerializedName("_id")
	private String _id;
	@Expose
	@SerializedName("mobile")
	private String mobile;
	@Expose
	@SerializedName("items")
	private List<CustomerEasyOrderData> items;
	@Expose
	@SerializedName("addDate")
	private String addDate;
	@Expose
	@SerializedName("status")
	private String status;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public List<CustomerEasyOrderData> getItems() {
		return items;
	}
	public void setItems(List<CustomerEasyOrderData> items) {
		this.items = items;
	}
	public String getAddDate() {
		return addDate;
	}
	public void setAddDate(String addDate) {
		this.addDate = addDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
