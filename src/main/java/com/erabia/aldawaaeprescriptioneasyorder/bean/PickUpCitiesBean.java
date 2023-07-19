package com.erabia.aldawaaeprescriptioneasyorder.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PickUpCitiesBean {
	@Expose
	@SerializedName("value")
	private String value;
	@Expose
	@SerializedName("titleAR")
	private String titleAR;
	@Expose
	@SerializedName("titleEN")
	private String titleEN;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getTitleAR() {
		return titleAR;
	}
	public void setTitleAR(String titleAR) {
		this.titleAR = titleAR;
	}
	public String getTitleEN() {
		return titleEN;
	}
	public void setTitleEN(String titleEN) {
		this.titleEN = titleEN;
	}
	
	
}
