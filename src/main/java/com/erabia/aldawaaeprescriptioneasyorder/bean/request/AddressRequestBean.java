package com.erabia.aldawaaeprescriptioneasyorder.bean.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddressRequestBean {
	@Expose
	@SerializedName("externalId")
	private long externalId; 
	@Expose
	@SerializedName("addressTitle")
	private String addressTitle;
	@Expose
	@SerializedName("cityId")
	private String cityId;
	@Expose
	@SerializedName("distrectId")
	private String distrectId;
	@Expose
	@SerializedName("street")
	private String street;
	@Expose
	@SerializedName("buildingNumber")
	private String buildingNumber;
	@Expose
	@SerializedName("apartmentNumber")
	private String apartmentNumber;
	@Expose
	@SerializedName("mobileNumber")
	private String mobileNumber;
	
	
	public AddressRequestBean(long externalId, String addressTitle, String cityId, String distrectId, String street,
			String buildingNumber, String apartmentNumber, String mobileNumber) {
		super();
		this.externalId = externalId;
		this.addressTitle = addressTitle;
		this.cityId = cityId;
		this.distrectId = distrectId;
		this.street = street;
		this.buildingNumber = buildingNumber;
		this.apartmentNumber = apartmentNumber;
		this.mobileNumber = mobileNumber;
	}
	public long getExternalId() {
		return externalId;
	}
	public void setExternalId(long externalId) {
		this.externalId = externalId;
	}
	public String getAddressTitle() {
		return addressTitle;
	}
	public void setAddressTitle(String addressTitle) {
		this.addressTitle = addressTitle;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getDistrectId() {
		return distrectId;
	}
	public void setDistrectId(String distrectId) {
		this.distrectId = distrectId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getBuildingNumber() {
		return buildingNumber;
	}
	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}
	public String getApartmentNumber() {
		return apartmentNumber;
	}
	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}
