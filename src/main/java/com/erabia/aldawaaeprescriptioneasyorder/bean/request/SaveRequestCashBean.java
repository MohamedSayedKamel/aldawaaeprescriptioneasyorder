package com.erabia.aldawaaeprescriptioneasyorder.bean.request;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SaveRequestCashBean {
	@Expose
	@SerializedName("customer")
	private CustomerRequestBean customer;
	@Expose
	@SerializedName("address")
	private AddressRequestBean address;
	@Expose
	@SerializedName("member")
	private  MemberRequestBean member;
	
	@Expose
	@SerializedName("attachment1")
	private String attachment1;
	@Expose
	@SerializedName("attachment2")
	private String attachment2;
	@Expose
	@SerializedName("attachment3")
	private String attachment3;
	@Expose
	@SerializedName("title")
	private String title;
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
	
	
	public SaveRequestCashBean(CustomerRequestBean customer, AddressRequestBean address, MemberRequestBean member,
			String attachment1, String attachment2, String attachment3, String title, String deliveryMethod,
			String deliverySlotDate, String deliverySlotTime, String requestComments, String storeCode,
			String mobileNumber) {
		super();
		this.customer = customer;
		this.address = address;
		this.member = member;
		this.attachment1 = attachment1;
		this.attachment2 = attachment2;
		this.attachment3 = attachment3;
		this.title = title;
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
	
	public MemberRequestBean getMember() {
		return member;
	}
	public void setMember(MemberRequestBean member) {
		this.member = member;
	}
	public String getAttachment1() {
		return attachment1;
	}
	public void setAttachment1(String attachment1) {
		this.attachment1 = attachment1;
	}
	public String getAttachment2() {
		return attachment2;
	}
	public void setAttachment2(String attachment2) {
		this.attachment2 = attachment2;
	}
	public String getAttachment3() {
		return attachment3;
	}
	public void setAttachment3(String attachment3) {
		this.attachment3 = attachment3;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
