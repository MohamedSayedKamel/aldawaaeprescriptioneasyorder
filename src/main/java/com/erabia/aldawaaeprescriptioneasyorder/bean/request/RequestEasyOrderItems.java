package com.erabia.aldawaaeprescriptioneasyorder.bean.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestEasyOrderItems {
	@Expose
	@SerializedName("title")
	private String title;
	@Expose
	@SerializedName("desc")
	private String desc;
	@Expose
	@SerializedName("photo")
	private String photo;
	@Expose
	@SerializedName("qty")
	private long qty;
	
	public RequestEasyOrderItems(String title, String desc, String photo, long qty) {
		super();
		this.title = title;
		this.desc = desc;
		this.photo = photo;
		this.qty = qty;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public long getQty() {
		return qty;
	}
	public void setQty(long qty) {
		this.qty = qty;
	}
	
}
