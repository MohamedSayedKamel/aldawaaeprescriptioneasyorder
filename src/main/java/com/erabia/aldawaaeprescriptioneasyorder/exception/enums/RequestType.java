package com.erabia.aldawaaeprescriptioneasyorder.exception.enums;

public enum RequestType {

	CASH("cash"),
	INSURANCE("insurance"),
	WASFATY("wasfaty"),
	HEALTH("health"),
	EASYORDER("easyorder");

	private String code;

	private RequestType(String code) {

		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
