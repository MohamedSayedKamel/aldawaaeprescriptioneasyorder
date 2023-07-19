package com.erabia.aldawaaeprescriptioneasyorder.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PickUpDistrictsBean{
	@Expose
	@SerializedName("value")
	private String value;
	@Expose
	@SerializedName("cityEN")
	private String cityEN;
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
	public String getCityEN() {
		return cityEN;
	}
	public void setCityEN(String cityEN) {
		this.cityEN = cityEN;
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
