package com.erabia.aldawaaeprescriptioneasyorder.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InsuranceCompanyBean {
	@Expose
	@SerializedName("_id")
	private String _id;
	@Expose
	@SerializedName("titleAR")
	private String titleAR;
	@Expose
	@SerializedName("titleEN")
	private String titleEN;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
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
