
package com.erabia.aldawaaeprescriptioneasyorder.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.apache.logging.log4j.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.erabia.aldawaaeprescriptioneasyorder.bean.AldawaaEprescriptionEasyOrderConfigBean;
import com.erabia.aldawaaeprescriptioneasyorder.bean.request.CheckWasfatyValidatiorRequest;
import com.erabia.aldawaaeprescriptioneasyorder.bean.request.SaveRequestCashBean;
import com.erabia.aldawaaeprescriptioneasyorder.bean.request.SaveRequestInsuranceMemberRequest;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.CheckWasfatyValidatiorResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.DeliveryDistrictsResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.DeliverySlotsResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.InsuranceCompanyResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.InsuranceMembersListResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.PickUpCityResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.PickUpDistrictsResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.PickUpStoresResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.SaveInsuranceMembersResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.SaveRequestCashResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.SaveRequestEasyOrderResponse;
import com.erabia.aldawaaeprescriptioneasyorder.exception.AldawaaEprescriptionEasyOrderException;
import com.erabia.aldawaaeprescriptioneasyorder.exception.WebServiceApiUnirestException;
import com.erabia.aldawaaeprescriptioneasyorder.exception.enums.AldawaaEprescriptionEasyOrderExceptionType;
import com.erabia.aldawaaeprescriptioneasyorder.service.AldawaaEprescriptionEasyOrderService;
import com.erabia.aldawaaeprescriptioneasyorder.util.WebServiceApiUnirestUtil;
import com.google.common.base.Preconditions;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
@Service("aldawaaEprescriptionEasyOrderService")
public class DefaultAldawaaEprescriptionEasyOrderService  implements AldawaaEprescriptionEasyOrderService{
	private static final String CONTENT_TYPE = "Content-Type";
	private static final String CONTENT_TYPE_OTHER = "application/x-www-form-urlencoded";
	private static final String CONTENT_TYPE_JSON = "application/json";
	private static final String CONFIG_BEAN_IS_NULL ="Aldawaa SMS Config Bean is null";
	private static final String BASEURL_IS_NULL ="base url is null";
	private static final String CLIENTID_IS_NULL ="client id is null";
	private static final String CLIENT_SECRET_IS_NULL ="client secret is null";
	private static final Gson GSON = (new GsonBuilder().setPrettyPrinting()).create();
	private static final Logger LOG = LoggerFactory.getLogger(DefaultAldawaaEprescriptionEasyOrderService.class);

	@Override
	public Optional<InsuranceCompanyResponse> getInsuranceCompanies(AldawaaEprescriptionEasyOrderConfigBean configBean) throws AldawaaEprescriptionEasyOrderException {
		validatAldawaaEprescriptionEasyOrderConfigBean(configBean);
		final Map<String, String> header = setHeader(configBean);
		header.put(CONTENT_TYPE, CONTENT_TYPE_OTHER);
		String baseURL = new StringBuilder().append(configBean.getBaseURL()).append("/InsuranceCompanies/").toString();
		InsuranceCompanyResponse response =null;
		try
		{
			LOG.info("get Insurance Companies --> sending request");
			response= WebServiceApiUnirestUtil.get(baseURL, header, "",InsuranceCompanyResponse.class);

		}catch (WebServiceApiUnirestException e) {
			throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST, e.getMessage(), e.getRequestData(), e.getResponseData(),e.getHeaders(),e.getBaseURL(), null, null);
		}
		
		
		if(response.getStatus())
		{
			LOG.info("get Insurance Companies  status --> success");
			return Optional.ofNullable(response);
		}
		LOG.info("get Delivery Cities--> bad request");
		throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST,null, null,  GSON.toJson(response),GSON.toJson(header),baseURL, null, null);
		
	}

	

	@Override
	public Optional<InsuranceCompanyResponse> getDeliveryCities(AldawaaEprescriptionEasyOrderConfigBean configBean) throws AldawaaEprescriptionEasyOrderException {
		validatAldawaaEprescriptionEasyOrderConfigBean(configBean);
		final Map<String, String> header = setHeader(configBean);
		header.put(CONTENT_TYPE, CONTENT_TYPE_OTHER);
		String baseURL = new StringBuilder().append(configBean.getBaseURL()).append("/DeliveryCities/").toString();
		InsuranceCompanyResponse response =null;
		try
		{
			LOG.info("get Delivery Cities--> sending request");
			response= WebServiceApiUnirestUtil.get(baseURL, header, "",InsuranceCompanyResponse.class);

		}catch (WebServiceApiUnirestException e) {
			throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST, e.getMessage(), e.getRequestData(), e.getResponseData(),e.getHeaders(),e.getBaseURL(), null, null);
		}
		
		if(response.getStatus())
		{
			LOG.info("get Delivery Cities status --> success");
			return Optional.ofNullable(response);
		}
		LOG.info("get Delivery Cities--> bad request");
		throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST,null, null,  GSON.toJson(response),GSON.toJson(header),baseURL, null, null);
	}

	@Override
	public Optional<PickUpCityResponse> getPickUpCities(AldawaaEprescriptionEasyOrderConfigBean configBean) throws AldawaaEprescriptionEasyOrderException {
		validatAldawaaEprescriptionEasyOrderConfigBean(configBean);
		final Map<String, String> header = setHeader(configBean);
		header.put(CONTENT_TYPE, CONTENT_TYPE_OTHER);
		String baseURL = new StringBuilder().append(configBean.getBaseURL()).append("/PickUpCities/").toString();
		PickUpCityResponse response =null;
		try
		{
			LOG.info("get PickUp Cities--> sending request");
			response= WebServiceApiUnirestUtil.get(baseURL, header,"",PickUpCityResponse.class);

		}catch (WebServiceApiUnirestException e) {
			throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST, e.getMessage(), e.getRequestData(), e.getResponseData(),e.getHeaders(),e.getBaseURL(), null, null);
		}
		
		if(response.getStatus())
		{
			LOG.info("get PickUp Cities status --> success");
			return Optional.ofNullable(response);
		}
		LOG.info("get PickUp Cities--> bad request");
		throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST,null, null,  GSON.toJson(response),GSON.toJson(header),baseURL, null, null);
	}

	@Override
	public Optional<DeliveryDistrictsResponse> getDeliveryDistricts(AldawaaEprescriptionEasyOrderConfigBean configBean, String cityId)throws AldawaaEprescriptionEasyOrderException {
		validatAldawaaEprescriptionEasyOrderConfigBean(configBean);
		final Map<String, String> header = setHeader(configBean);
		header.put(CONTENT_TYPE, CONTENT_TYPE_JSON);
		String baseURL = new StringBuilder().append(configBean.getBaseURL()).append("/DeliveryDistricts/").toString();
		
		final Map<String, Object> parameter = new HashMap<>();
		parameter.put("cityId", cityId);
		
		DeliveryDistrictsResponse response =null;
		
		try
		{
			LOG.info("get Delivery Districts--> sending request");
			response= WebServiceApiUnirestUtil.get(baseURL, header, parameter,DeliveryDistrictsResponse.class);

		}catch (WebServiceApiUnirestException e) {
			throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST, e.getMessage(), e.getRequestData(), e.getResponseData(),e.getHeaders(),e.getBaseURL(), null, null);
		}
		
		if(response.getStatus())
		{
			LOG.info("get Delivery Districts status --> success");
			return Optional.ofNullable(response);
		}
		LOG.info("get Delivery Districts--> bad request");
		throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST,null, GSON.toJson(parameter),  GSON.toJson(response),GSON.toJson(header),baseURL, null, null);
	}

	@Override
	public Optional<PickUpDistrictsResponse> getPickUpDistricts(AldawaaEprescriptionEasyOrderConfigBean configBean, String cityEN)
			throws AldawaaEprescriptionEasyOrderException {
		validatAldawaaEprescriptionEasyOrderConfigBean(configBean);
		final Map<String, String> header = setHeader(configBean);
		header.put(CONTENT_TYPE, CONTENT_TYPE_JSON);
		String baseURL = new StringBuilder().append(configBean.getBaseURL()).append("/PickUpDistricts/").toString();
		
		final Map<String, Object> parameter = new HashMap<>();
		parameter.put("cityEN", cityEN);
		PickUpDistrictsResponse response =null;
		try
		{
			LOG.info("get PickUp Districts--> sending request");
			response= WebServiceApiUnirestUtil.get(baseURL, header, parameter,PickUpDistrictsResponse.class);

		}catch (WebServiceApiUnirestException e) {
			throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST, e.getMessage(), e.getRequestData(), e.getResponseData(),e.getHeaders(),e.getBaseURL(), null, null);
		}
		
		if(response.getStatus())
		{
			LOG.info("get PickUp Districts status --> success");
			return Optional.ofNullable(response);
		}
		LOG.info("get PickUp Districts--> bad request");
		throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST,null, GSON.toJson(parameter),  GSON.toJson(response),GSON.toJson(header),baseURL, null, null);
	}

	@Override
	public Optional<PickUpStoresResponse> getPickUpStores(AldawaaEprescriptionEasyOrderConfigBean configBean, String cityEN, String districtEN, String gps)
			throws AldawaaEprescriptionEasyOrderException {
		validatAldawaaEprescriptionEasyOrderConfigBean(configBean);
		final Map<String, String> header = setHeader(configBean);
		header.put(CONTENT_TYPE, CONTENT_TYPE_JSON);
		String baseURL = new StringBuilder().append(configBean.getBaseURL()).append("/PickUpStores/").toString();
		final Map<String, Object> parameter = new HashMap<>();
		parameter.put("cityEN", cityEN);
		parameter.put("districtEN", districtEN);
		parameter.put("gps", gps);
		PickUpStoresResponse response =null;
		try
		{
			LOG.info("get PickUp Stores--> sending request");
			response= WebServiceApiUnirestUtil.get(baseURL, header, parameter,PickUpStoresResponse.class);

		}catch (WebServiceApiUnirestException e) {
			throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST, e.getMessage(), e.getRequestData(), e.getResponseData(),e.getHeaders(),e.getBaseURL(), null, null);
		}
		
		if(response.getStatus())
		{
			LOG.info("get PickUp Stores status --> success");
			return Optional.ofNullable(response);
		}
		LOG.info("get PickUp Stores--> bad request");
		throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST,null, GSON.toJson(parameter),  GSON.toJson(response),GSON.toJson(header),baseURL, null, null);
	}
	
	@Override
	public Optional<DeliverySlotsResponse> getDeliverySlots(AldawaaEprescriptionEasyOrderConfigBean configBean,
			String storeCode,String city,String distrct) throws AldawaaEprescriptionEasyOrderException {
		validatAldawaaEprescriptionEasyOrderConfigBean(configBean);
		final Map<String, String> header = setHeader(configBean);
		header.put(CONTENT_TYPE, CONTENT_TYPE_JSON);
		String baseURL = new StringBuilder().append(configBean.getBaseURL()).append("/DeliverySlots/").toString();
		
		final Map<String, Object> parameter = new HashMap<>();
		parameter.put("storeCode", storeCode);
		parameter.put("city", city);
		parameter.put("distrct", distrct);
		
		
		DeliverySlotsResponse response =null;
		
		try
		{
			LOG.info("get Delivery Slots--> sending request");
			response= WebServiceApiUnirestUtil.get(baseURL, header, parameter,DeliverySlotsResponse.class);

		}catch (WebServiceApiUnirestException e) {
			throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST, e.getMessage(), e.getRequestData(), e.getResponseData(),e.getHeaders(),e.getBaseURL(), null, null);
		}
		
		if(response.getStatus())
		{
			LOG.info("get Delivery Slots status --> success");
			return Optional.ofNullable(response);
		}
		LOG.info("get Delivery Slots--> bad request");
		throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST,null, GSON.toJson(parameter),  GSON.toJson(response),GSON.toJson(header),baseURL, null, null);
	}
	@Override
	public Optional<InsuranceMembersListResponse> getInsuranceMembersList(
			AldawaaEprescriptionEasyOrderConfigBean configBean, String customerExternalId)
					throws AldawaaEprescriptionEasyOrderException {
		validatAldawaaEprescriptionEasyOrderConfigBean(configBean);
		final Map<String, String> header = setHeader(configBean);
		header.put(CONTENT_TYPE, CONTENT_TYPE_JSON);
		String baseURL = new StringBuilder().append(configBean.getBaseURL()).append("/InsuranceMembersList/").toString();
		
		final Map<String, Object> parameter = new HashMap<>();
		parameter.put("customerExternalId", customerExternalId);
		
		InsuranceMembersListResponse response =null;
		
		try
		{
			LOG.info("get Insurance Members List--> sending request");
			response= WebServiceApiUnirestUtil.get(baseURL, header, parameter,InsuranceMembersListResponse.class);

		}catch (WebServiceApiUnirestException e) {
			throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST, e.getMessage(), e.getRequestData(), e.getResponseData(),e.getHeaders(),e.getBaseURL(), null, null);
		}
		
		if(response.getStatus())
		{
			LOG.info("get Insurance Members List status --> success");
			return Optional.ofNullable(response);
		}
		LOG.info("get Insurance Members List--> bad request");
		throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST,null, GSON.toJson(parameter),  GSON.toJson(response),GSON.toJson(header),baseURL, null, null);
	}
	




	@Override
	public Optional<SaveInsuranceMembersResponse> saveInsuranceMembers(
			AldawaaEprescriptionEasyOrderConfigBean configBean, SaveRequestInsuranceMemberRequest request)
			throws AldawaaEprescriptionEasyOrderException {
		validatAldawaaEprescriptionEasyOrderConfigBean(configBean);
		final Map<String, String> header = setHeader(configBean);
		header.put(CONTENT_TYPE, CONTENT_TYPE_JSON);
		String baseURL = new StringBuilder().append(configBean.getBaseURL()).append("/InsuranceMembers/").toString();
		
		SaveInsuranceMembersResponse response = null;
		
		try
		{
			LOG.info("save Insurance Members --> sending request");
			response= WebServiceApiUnirestUtil.post(baseURL, header, GSON.toJson(request),SaveInsuranceMembersResponse.class);

		}catch (WebServiceApiUnirestException e) {
			throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST, e.getMessage(), e.getRequestData(), e.getResponseData(),e.getHeaders(),e.getBaseURL(), null, null);
		}
		
		if(response.getStatus())
		{
			LOG.info("save Insurance Members  status --> success");
			return Optional.ofNullable(response);
		}
		LOG.info("save Insurance Members --> bad request");
		throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST,null, GSON.toJson(request),  GSON.toJson(response),GSON.toJson(header),baseURL, null, null);
		
		
	}
	private Map<String, String> setHeader(AldawaaEprescriptionEasyOrderConfigBean configBean) {
		final Map<String, String> header = new HashMap<>();
		header.put("ClientCode", configBean.getClientCode());
		header.put("ClientSecret", configBean.getClientSecret());
		return header;
	}

	private void validatAldawaaEprescriptionEasyOrderConfigBean(AldawaaEprescriptionEasyOrderConfigBean configBean) {
		Preconditions.checkArgument(configBean!=null, CONFIG_BEAN_IS_NULL);
		Preconditions.checkArgument(!Strings.isBlank(configBean.getBaseURL()), BASEURL_IS_NULL);
		Preconditions.checkArgument(!Strings.isBlank(configBean.getClientCode()),CLIENTID_IS_NULL);
		Preconditions.checkArgument(!Strings.isBlank(configBean.getClientSecret()), CLIENT_SECRET_IS_NULL);
		
	}



	@Override
	public Optional<SaveRequestCashResponse> saveRequestCash(AldawaaEprescriptionEasyOrderConfigBean configBean,
			SaveRequestCashBean request) throws AldawaaEprescriptionEasyOrderException {
		validatAldawaaEprescriptionEasyOrderConfigBean(configBean);
		final Map<String, String> header = setHeader(configBean);
		header.put(CONTENT_TYPE, CONTENT_TYPE_JSON);
		String baseURL = new StringBuilder().append(configBean.getBaseURL()).append("/RequestInsurance/").toString();

		SaveRequestCashResponse response = null;
		try
		{
			LOG.info("save Request Insurance --> sending request");
			response= WebServiceApiUnirestUtil.post(baseURL, header, GSON.toJson(request),SaveRequestCashResponse.class);

		}catch (WebServiceApiUnirestException e) {
			throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST, e.getMessage(), e.getRequestData(), e.getResponseData(),e.getHeaders(),e.getBaseURL(), null, null);
		}
		
		if(response.getStatus())
		{
			LOG.info("save Request Insurance  status --> success");
			return Optional.ofNullable(response);
		}
		LOG.info("save Request Insurance --> bad request");
		throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST,null, GSON.toJson(request),  GSON.toJson(response),GSON.toJson(header),baseURL, null, null);
	}



	@Override
	public Optional<CheckWasfatyValidatiorResponse> checkWasfatyValidatior(
			AldawaaEprescriptionEasyOrderConfigBean configBean, CheckWasfatyValidatiorRequest request)
			throws AldawaaEprescriptionEasyOrderException {
		validatAldawaaEprescriptionEasyOrderConfigBean(configBean);
		final Map<String, String> header = setHeader(configBean);
		header.put(CONTENT_TYPE, CONTENT_TYPE_JSON);
		String baseURL = new StringBuilder().append(configBean.getBaseURL()).append("/RequestWasfaty/Inquiry.php").toString();
		CheckWasfatyValidatiorResponse response = null;
		try
		{
			LOG.info("Check Wasfaty Validatior--> sending request");
			response= WebServiceApiUnirestUtil.post(baseURL, header, GSON.toJson(request),CheckWasfatyValidatiorResponse.class);

		}catch (WebServiceApiUnirestException e) {
			throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST, e.getMessage(), e.getRequestData(), e.getResponseData(),e.getHeaders(),e.getBaseURL(), null, null);
		}
		
		if(response.getStatus())
		{
			LOG.info("Check Wasfaty Validatior  status --> success");
			return Optional.ofNullable(response);
		}
		LOG.info("Check Wasfaty Validatior --> bad request");
		throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST,null, GSON.toJson(request),  GSON.toJson(response),GSON.toJson(header),baseURL, null, null);
	}



	@Override
	public Optional<SaveRequestEasyOrderResponse> saveRequestEasyOrder(
			AldawaaEprescriptionEasyOrderConfigBean configBean,String customerExternalId) throws AldawaaEprescriptionEasyOrderException {
		final Map<String, String> header = setHeader(configBean);
		header.put(CONTENT_TYPE, CONTENT_TYPE_JSON);
		String baseURL = new StringBuilder().append(configBean.getBaseURL()).append("/InsuranceMembersList/").toString();
		
		final Map<String, Object> parameter = new HashMap<>();
		parameter.put("customerExternalId", customerExternalId);
		SaveRequestEasyOrderResponse response =null;
		try
		{
			LOG.info("get Request Easy Order --> sending request");
			response= WebServiceApiUnirestUtil.get(baseURL, header, parameter,SaveRequestEasyOrderResponse.class);

		}catch (WebServiceApiUnirestException e) {
			throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST, e.getMessage(), e.getRequestData(), e.getResponseData(),e.getHeaders(),e.getBaseURL(), null, null);
		}
		
		if(response.getStatus())
		{
			LOG.info("get  Request Easy Order status --> success");
			return Optional.ofNullable(response);
		}
		LOG.info("get  Request Easy Order--> bad request");
		throw new AldawaaEprescriptionEasyOrderException(AldawaaEprescriptionEasyOrderExceptionType.BAD_REQUEST,null, GSON.toJson(parameter),  GSON.toJson(response),GSON.toJson(header),baseURL, null, null);
	}




}
