package com.erabia.aldawaaeprescriptioneasyorder.exception.enums;

public enum AldawaaEprescriptionEasyOrderExceptionType {
	
	BAD_REQUEST("BAD_REQUEST","Bad Request"),
	WORNG_CLIENT_SECRET_OR_CLIENT_CODE("E-X01","wrong client secret or client code "),
	WORNG_DLEIVEY_METHOD("E-X02","wrong dleivey method");

	private String errorCode;
	private String errorMessage;

	private AldawaaEprescriptionEasyOrderExceptionType(String errorCode, String message) {
		this.errorCode = errorCode;
		this.errorMessage = message;
	}

	private AldawaaEprescriptionEasyOrderExceptionType() {
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
