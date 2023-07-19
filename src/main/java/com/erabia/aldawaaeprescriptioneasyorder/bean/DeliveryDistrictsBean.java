package com.erabia.aldawaaeprescriptioneasyorder.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeliveryDistrictsBean {
	@Expose
	@SerializedName("_id")
	private String _id;
	@Expose
	@SerializedName("cityId")
	private String cityId;
	@Expose
	@SerializedName("titleAR")
	private String titleAR;
	@Expose
	@SerializedName("titleEN")
	private String titleEN;
	@Expose
	@SerializedName("storeCode")
	private String storeCode;
	
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
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
	public String getStoreCode() {
		return storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	
}
