package com.erabia.aldawaaeprescriptioneasyorder.bean.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CheckWasfatyValidatiorRequest {
	@Expose
	@SerializedName("address")
	private AddressRequestBean address;
	@Expose
	@SerializedName("nId")
	private String nId;
	@Expose
	@SerializedName("prescriptionId")
	private String prescriptionId;
	@Expose
	@SerializedName("city")
	private String city;
	@Expose
	@SerializedName("district")
	private String district;
	@Expose
	@SerializedName("deliveryMethod")
	private String deliveryMethod;
	public CheckWasfatyValidatiorRequest(AddressRequestBean addressRequestBean, String nId, String prescriptionId, String city,
			String district, String deliveryMethod) {
		super();
		this.address = addressRequestBean;
		this.nId = nId;
		this.prescriptionId = prescriptionId;
		this.city = city;
		this.district = district;
		this.deliveryMethod = deliveryMethod;
	}
	public AddressRequestBean getAddress() {
		return address;
	}
	public void setAddress(AddressRequestBean address) {
		this.address = address;
	}
	public String getnId() {
		return nId;
	}
	public void setnId(String nId) {
		this.nId = nId;
	}
	public String getPrescriptionId() {
		return prescriptionId;
	}
	public void setPrescriptionId(String prescriptionId) {
		this.prescriptionId = prescriptionId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getDeliveryMethod() {
		return deliveryMethod;
	}
	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}
	
	

}
