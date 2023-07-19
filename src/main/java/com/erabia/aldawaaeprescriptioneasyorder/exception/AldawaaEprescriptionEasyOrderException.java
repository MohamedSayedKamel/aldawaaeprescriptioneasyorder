package com.erabia.aldawaaeprescriptioneasyorder.exception;

import com.erabia.aldawaaeprescriptioneasyorder.exception.enums.AldawaaEprescriptionEasyOrderExceptionType;

public class AldawaaEprescriptionEasyOrderException extends Exception {

	private static final long serialVersionUID = 1L;
	
	
	private final AldawaaEprescriptionEasyOrderExceptionType type;
	private final String requestData;
	private final String responseData;
	private final String headers;
	private final String baseURL;
	private final String messageAR;
	private final String messageEN;

	public AldawaaEprescriptionEasyOrderException(final AldawaaEprescriptionEasyOrderExceptionType type, final String message, final String requestData,
			final String responseData, final String headers, final String baseURL,final String messageAR,final String messageEN) {
		super(message);
		this.type = type;
		this.responseData = responseData;
		this.requestData = requestData;
		this.headers = headers;
		this.baseURL = baseURL;
		this.messageAR=messageAR;
		this.messageEN = messageEN;

	}
	

	public AldawaaEprescriptionEasyOrderExceptionType getType() {
		return type;
	}

	public String getRequestData() {
		return requestData;
	}

	public String getResponseData() {
		return responseData;

	}

	public final String getHeaders() {
		return headers;
	}

	public final String getBaseURL() {
		return baseURL;
	}


	public String getMessageAR() {
		return messageAR;
	}

	public String getMessageEN() {
		return messageEN;
	}

}
