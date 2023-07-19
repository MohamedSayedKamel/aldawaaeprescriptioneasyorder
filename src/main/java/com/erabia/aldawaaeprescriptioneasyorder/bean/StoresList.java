package com.erabia.aldawaaeprescriptioneasyorder.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StoresList {
	@Expose
	@SerializedName("value")
	 private String value;
	@Expose
	@SerializedName("storeCode")
	 private String storeCode;
	@Expose
	@SerializedName("cityEN")
	 private String cityEN;
	@Expose
	@SerializedName("cityAR")
	 private String cityAR;
	@Expose
	@SerializedName("districtEN")
	 private String districtEN;
	@Expose
	@SerializedName("districtAR")
	 private String districtAR;
	@Expose
	@SerializedName("addressEN")
	 private String addressEN;
	@Expose
	@SerializedName("addressAR")
	 private String addressAR;
	@Expose
	@SerializedName("gps")
	 private String gps;
	@Expose
	@SerializedName("distance")
	 private String distance;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getStoreCode() {
		return storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}
	public String getCityEN() {
		return cityEN;
	}
	public void setCityEN(String cityEN) {
		this.cityEN = cityEN;
	}
	public String getCityAR() {
		return cityAR;
	}
	public void setCityAR(String cityAR) {
		this.cityAR = cityAR;
	}
	public String getDistrictEN() {
		return districtEN;
	}
	public void setDistrictEN(String districtEN) {
		this.districtEN = districtEN;
	}
	public String getDistrictAR() {
		return districtAR;
	}
	public void setDistrictAR(String districtAR) {
		this.districtAR = districtAR;
	}
	public String getAddressEN() {
		return addressEN;
	}
	public void setAddressEN(String addressEN) {
		this.addressEN = addressEN;
	}
	public String getAddressAR() {
		return addressAR;
	}
	public void setAddressAR(String addressAR) {
		this.addressAR = addressAR;
	}
	public String getGps() {
		return gps;
	}
	public void setGps(String gps) {
		this.gps = gps;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	
	

}
