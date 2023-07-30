package com.erabia.aldawaaeprescriptioneasyorder.bean.request;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SaveRequestEasyOrderRequest {
	@Expose
	@SerializedName("Customer")
	private CustomerRequestBean customer;
	@Expose
	@SerializedName("Address")
	private AddressRequestBean address;
	@Expose
	@SerializedName("Items")
	private List<RequestEasyOrderItems> items;
	@Expose
	@SerializedName("deliveryMethod")
	private String deliveryMethod;
	@Expose
	@SerializedName("deliverySlotDate")
	private String deliverySlotDate;
	@Expose
	@SerializedName("deliverySlotTime")
	private String deliverySlotTime;
	@Expose
	@SerializedName("requestComments")
	private String requestComments;
	@Expose
	@SerializedName("storeCode")
	private String storeCode;
	@Expose
	@SerializedName("mobileNumber")
	private String mobileNumber;
	public SaveRequestEasyOrderRequest(CustomerRequestBean customer, AddressRequestBean address,
			List<RequestEasyOrderItems> items, String deliveryMethod, String deliverySlotDate, String deliverySlotTime,
			String requestComments, String storeCode, String mobileNumber) {
		super();
		this.customer = customer;
		this.address = address;
		this.items = items;
		this.deliveryMethod = deliveryMethod;
		this.deliverySlotDate = deliverySlotDate;
		this.deliverySlotTime = deliverySlotTime;
		this.requestComments = requestComments;
		this.storeCode = storeCode;
		this.mobileNumber = mobileNumber;
	}
	public CustomerRequestBean getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerRequestBean customer) {
		this.customer = customer;
	}
	public AddressRequestBean getAddress() {
		return address;
	}
	public void setAddress(AddressRequestBean address) {
		this.address = address;
	}
	public List<RequestEasyOrderItems> getItems() {
		return items;
	}
	public void setItems(List<RequestEasyOrderItems> items) {
		this.items = items;
	}
	public String getDeliveryMethod() {
		return deliveryMethod;
	}
	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}
	public String getDeliverySlotDate() {
		return deliverySlotDate;
	}
	public void setDeliverySlotDate(String deliverySlotDate) {
		this.deliverySlotDate = deliverySlotDate;
	}
	public String getDeliverySlotTime() {
		return deliverySlotTime;
	}
	public void setDeliverySlotTime(String deliverySlotTime) {
		this.deliverySlotTime = deliverySlotTime;
	}
	public String getRequestComments() {
		return requestComments;
	}
	public void setRequestComments(String requestComments) {
		this.requestComments = requestComments;
	}
	public String getStoreCode() {
		return storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
}
