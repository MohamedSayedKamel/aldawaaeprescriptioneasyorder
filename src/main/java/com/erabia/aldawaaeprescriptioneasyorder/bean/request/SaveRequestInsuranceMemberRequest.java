package com.erabia.aldawaaeprescriptioneasyorder.bean.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SaveRequestInsuranceMemberRequest {
	
	@Expose
	@SerializedName("Customer")
	private CustomerRequestBean customer;
	
	@Expose
	@SerializedName("Member")
	private MemberRequestBean member;

	public SaveRequestInsuranceMemberRequest(CustomerRequestBean customer, MemberRequestBean member) {
		super();
		this.customer = customer;
		this.member = member;
	}

	public CustomerRequestBean getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerRequestBean customer) {
		this.customer = customer;
	}

	public MemberRequestBean getMember() {
		return member;
	}

	public void setMember(MemberRequestBean member) {
		this.member = member;
	}
	
	
	

}
