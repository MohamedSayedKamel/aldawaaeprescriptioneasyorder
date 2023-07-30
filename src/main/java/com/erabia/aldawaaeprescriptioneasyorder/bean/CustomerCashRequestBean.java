package com.erabia.aldawaaeprescriptioneasyorder.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomerCashRequestBean {
	@Expose
	@SerializedName("_id")
	private String _id;
	@Expose
	@SerializedName("title")
	private String title;
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
	@SerializedName("addDate")
	private String addDate;
	@Expose
	@SerializedName("status")
	private String status;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getAddDate() {
		return addDate;
	}
	public void setAddDate(String addDate) {
		this.addDate = addDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
