package com.erabia.aldawaaeprescriptioneasyorder.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeliverySlotsBean {
	@Expose
	@SerializedName("storeCode")
	private String storeCode;
	@Expose
	@SerializedName("date")
	private String date;
	@Expose
	@SerializedName("from")
	private String from;
	@Expose
	@SerializedName("to")
	private String to;
	@Expose
	@SerializedName("max")
	private String max;
	public String getStoreCode() {
		return storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getMax() {
		return max;
	}
	public void setMax(String max) {
		this.max = max;
	}
	
}
