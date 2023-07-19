package com.erabia.aldawaaeprescriptioneasyorder.bean.response;

import java.util.List;

import com.erabia.aldawaaeprescriptioneasyorder.bean.ItemsList;
import com.erabia.aldawaaeprescriptioneasyorder.bean.StoresList;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CheckWasfatyValidatiorResponse {
	@Expose
	@SerializedName("status")
	private boolean status;
	@Expose
	@SerializedName("messageEN")
	private String messageEN;
	@Expose
	@SerializedName("messageAR")
	private String messageAR;
	@Expose
	@SerializedName("items")
	private List <ItemsList> items;
	@Expose
	@SerializedName("stores")
	private List<StoresList> stores;
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMessageEN() {
		return messageEN;
	}
	public void setMessageEN(String messageEN) {
		this.messageEN = messageEN;
	}
	public String getMessageAR() {
		return messageAR;
	}
	public void setMessageAR(String messageAR) {
		this.messageAR = messageAR;
	}
	public List<ItemsList> getItems() {
		return items;
	}
	public void setItems(List<ItemsList> items) {
		this.items = items;
	}
	public List<StoresList> getStores() {
		return stores;
	}
	public void setStores(List<StoresList> stores) {
		this.stores = stores;
	}
	
}
