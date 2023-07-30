package com.erabia.aldawaaeprescriptioneasyorder.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomerHealthRequestBean {
	@Expose
	@SerializedName("_id")
	private String _id;
	@Expose
	@SerializedName("nationalId")
	private String nationalId;
	@Expose
	@SerializedName("prescriptionId")
	private String prescriptionId;
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
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public String getPrescriptionId() {
		return prescriptionId;
	}
	public void setPrescriptionId(String prescriptionId) {
		this.prescriptionId = prescriptionId;
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
