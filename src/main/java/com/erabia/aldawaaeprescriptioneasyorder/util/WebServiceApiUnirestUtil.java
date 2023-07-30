package com.erabia.aldawaaeprescriptioneasyorder.util;

import java.lang.reflect.Type;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.erabia.aldawaaeprescriptioneasyorder.exception.WebServiceApiUnirestException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import kong.unirest.Body;
import kong.unirest.GetRequest;
import kong.unirest.Header;
import kong.unirest.HttpRequest;
import kong.unirest.HttpResponse;
import kong.unirest.RequestBodyEntity;
import kong.unirest.Unirest;

public class WebServiceApiUnirestUtil {
	private static final Logger LOG = LoggerFactory.getLogger(WebServiceApiUnirestUtil.class);
	private static final Gson GSON = (new GsonBuilder().setPrettyPrinting()).create();
	private WebServiceApiUnirestUtil() {

	}

	private static String convertRequestToString(HttpRequest<?> request) {
		StringBuilder sb = new StringBuilder();
		sb.append(request.getHttpMethod().toString());
		sb.append(" ");
		sb.append(request.getUrl());
		sb.append("\n");

		for (Header a : request.getHeaders().all()) {
			sb.append(a.getName() + ":" + a.getValue() + "\n");
		}

		Object body = request.getBody().orElse(null);
		if (body instanceof Body) {

			Body body2 = (Body) body;
			sb.append(body2.uniPart().getValue());
		}
		return sb.toString();
	}

	public static <T> T get(final String URL, final Map<String, String> headers, final String body, Type clazz)
			throws WebServiceApiUnirestException {
		GetRequest request = Unirest.get(URL + "{body}").headers(headers).routeParam("body", null);

		HttpResponse<String> response = null;

		try {
			response = request.asString();
		} catch (Exception e) {
			throw new WebServiceApiUnirestException(e.getMessage(), request.toString(), null, GSON.toJson(headers), URL);
		}

		if (response.isSuccess()) 
			return GSON.fromJson(response.getBody(), clazz);
		
		LOG.info(response.getBody());

		throw new WebServiceApiUnirestException(response.getStatusText(), request.toString(), response.getBody(),GSON.toJson(headers), URL);
	}

	public static <T> T get(final String URL, final Map<String, String> headers, final Map<String, Object> body,
			Type clazz) throws WebServiceApiUnirestException {
		GetRequest request = Unirest.get(URL).headers(headers).queryString(body);

		HttpResponse<String> response = null;
		String requestJSON = convertRequestToString(request);

		try {
			response = request.asString();
		} catch (Exception e) {
			throw new WebServiceApiUnirestException(e.getMessage(), requestJSON, null, GSON.toJson(headers), URL);
		}

		if (response.isSuccess()) 
			return GSON.fromJson(response.getBody(), clazz);

		LOG.info(response.getBody());
		throw new WebServiceApiUnirestException(response.getStatusText(), requestJSON, response.getBody(),GSON.toJson(headers), URL);
	}

	public static <T> T post(final String URL, final Map<String, String> headers, final String body, Type clazz)
			throws WebServiceApiUnirestException {

		RequestBodyEntity request = Unirest.post(URL).headers(headers).body(body);

		HttpResponse<String> response = null;
		String requestJSON = convertRequestToString(request);
		try {
			response = request.asString();
		} catch (Exception e) {
			throw new WebServiceApiUnirestException(e.getMessage(), requestJSON, null, GSON.toJson(headers), URL);
		}
		if (response.isSuccess())
			return GSON.fromJson(response.getBody(), clazz);
		LOG.info(response.getBody());
		throw new WebServiceApiUnirestException(response.getStatusText(), requestJSON, response.getBody(),GSON.toJson(headers), URL);
	}

	public static <T> T put(final String URL, final Map<String, String> headers, final String body, Type clazz)
			throws WebServiceApiUnirestException {
		RequestBodyEntity request = Unirest.put(URL).headers(headers).body(body);

		HttpResponse<String> response = null;
		String requestJSON = convertRequestToString(request);

		try {
			response = request.asString();
		} catch (Exception e) {
			throw new WebServiceApiUnirestException(e.getMessage(), requestJSON, null, GSON.toJson(headers), URL);
		}

		if (response.isSuccess()) 
			return GSON.fromJson(response.getBody(), clazz);

		LOG.info(response.getBody());

		throw new WebServiceApiUnirestException(response.getStatusText(), requestJSON, response.getBody(),GSON.toJson(headers), URL);
	}

}
