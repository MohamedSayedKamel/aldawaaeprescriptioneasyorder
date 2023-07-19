package com.erabia.aldawaaeprescriptioneasyorder.controller;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.erabia.aldawaaeprescriptioneasyorder.bean.AldawaaEprescriptionEasyOrderConfigBean;
import com.erabia.aldawaaeprescriptioneasyorder.bean.request.AddressRequestBean;
import com.erabia.aldawaaeprescriptioneasyorder.bean.request.CheckWasfatyValidatiorRequest;
import com.erabia.aldawaaeprescriptioneasyorder.bean.request.CustomerRequestBean;
import com.erabia.aldawaaeprescriptioneasyorder.bean.request.MemberRequestBean;
import com.erabia.aldawaaeprescriptioneasyorder.bean.request.SaveInsuranceMembersResquest;
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
import com.erabia.aldawaaeprescriptioneasyorder.dto.error.ErrorDTO;
import com.erabia.aldawaaeprescriptioneasyorder.dto.error.ErrorListDTO;
import com.erabia.aldawaaeprescriptioneasyorder.exception.AldawaaEprescriptionEasyOrderException;
import com.erabia.aldawaaeprescriptioneasyorder.service.AldawaaEprescriptionEasyOrderService;

@RestController
@RequestMapping(path = "/aldawaaEprescriptionEasyOrder")
public class AldawaaEprescriptionEasyOrderController {
    private static final String  BASE_URL = "https://webservices.al-dawaa.com/InsuranceApi";
	private static final String  CLIENT_CODE = "ECOMMERCE";
	private static final String  CLIENT_SECRET = "S5RhkakGxUb5qTU647mNUKxDfXdYgqsvwotJvMMNgQIkQhisE5n4mWHoU";
	@Autowired
	private AldawaaEprescriptionEasyOrderService aldawaaEprescriptionEasyOrderService;	

	@GetMapping(path = "/InsuranceCompanies")
	public InsuranceCompanyResponse getInsuranceCompanies(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret) throws AldawaaEprescriptionEasyOrderException {
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<InsuranceCompanyResponse>  insuranceCompanies= aldawaaEprescriptionEasyOrderService.getInsuranceCompanies(configBean);
		return insuranceCompanies.isPresent() ? insuranceCompanies.get() : null;
	}
	
	@GetMapping(path = "/DeliveryCities")
	public InsuranceCompanyResponse getDeliveryCities(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret) throws AldawaaEprescriptionEasyOrderException {
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<InsuranceCompanyResponse>  deliveryCities= aldawaaEprescriptionEasyOrderService.getDeliveryCities(configBean);
		return deliveryCities.isPresent() ? deliveryCities.get() : null;
	}
	
	@GetMapping(path = "/PickUpCities")
	public PickUpCityResponse getPickUpCities(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret) throws AldawaaEprescriptionEasyOrderException {
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<PickUpCityResponse>  pickUpCity= aldawaaEprescriptionEasyOrderService.getPickUpCities(configBean);
		return pickUpCity.isPresent() ? pickUpCity.get() : null;
	}
	
	
	@GetMapping(path = "/DeliveryDistricts")
	public DeliveryDistrictsResponse getDeliveryDistricts(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestParam(required = true) String cityId) throws AldawaaEprescriptionEasyOrderException {
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<DeliveryDistrictsResponse>  deliveryDistricts= aldawaaEprescriptionEasyOrderService.getDeliveryDistricts(configBean,cityId);
		return deliveryDistricts.isPresent() ? deliveryDistricts.get() : null;
	}
	
	@GetMapping(path = "/PickUpDistricts")
	public PickUpDistrictsResponse getPickUpDistricts(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestParam(required = true) String cityEN) throws AldawaaEprescriptionEasyOrderException {
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<PickUpDistrictsResponse>  pickUpDistricts= aldawaaEprescriptionEasyOrderService.getPickUpDistricts(configBean,cityEN);
		return pickUpDistricts.isPresent() ? pickUpDistricts.get() : null;
	}
	
	@GetMapping(path = "/PickUpStores")
	public PickUpStoresResponse getPickUpStores(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestParam (required = false) String cityEN,@RequestParam (required = false) String districtEN,@RequestParam (required = false)String gps) throws AldawaaEprescriptionEasyOrderException {
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<PickUpStoresResponse>  pickUpStores= aldawaaEprescriptionEasyOrderService.getPickUpStores(configBean,cityEN,districtEN,gps);
		return pickUpStores.isPresent() ? pickUpStores.get() : null;
	}
	
	@GetMapping(path = "/DeliverySlots")
	public DeliverySlotsResponse getDeliverySlots(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestParam(required = true) String storeCode,
			@RequestParam(required = true) String city,
			@RequestParam(required = true) String distrct) throws AldawaaEprescriptionEasyOrderException {
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<DeliverySlotsResponse>  deliverySlots =  aldawaaEprescriptionEasyOrderService.getDeliverySlots(configBean,storeCode,city,distrct);
		return deliverySlots.isPresent() ? deliverySlots.get() : null;
	}
	@GetMapping(path = "/InsuranceMembersList")
	public InsuranceMembersListResponse getInsuranceMembersList(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestParam(required = true) String customerExternalId) throws AldawaaEprescriptionEasyOrderException {
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<InsuranceMembersListResponse>  insuranceMembersList =  aldawaaEprescriptionEasyOrderService.getInsuranceMembersList(configBean,customerExternalId);
		return insuranceMembersList.isPresent() ? insuranceMembersList.get() : null;
	}
	
	
	@PostMapping(path = "/InsuranceMembers")
	public SaveInsuranceMembersResponse saveInsuranceMembers(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestBody SaveInsuranceMembersResquest requestBody) throws AldawaaEprescriptionEasyOrderException {
		
		CustomerRequestBean customerRequestBean = new CustomerRequestBean(requestBody.getCustomer().getExternalId(), requestBody.getCustomer().getName(), requestBody.getCustomer().getMobileNumber(), requestBody.getCustomer().getEmail(), requestBody.getCustomer().getGender());
		MemberRequestBean   memberRequestBean =new MemberRequestBean(requestBody.getMember().getName(), requestBody.getMember().getnId(), requestBody.getMember().getInsuranceCompanyId());
		SaveRequestInsuranceMemberRequest request = new SaveRequestInsuranceMemberRequest(customerRequestBean, memberRequestBean);
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<SaveInsuranceMembersResponse>  saveInsuranceMembers =  aldawaaEprescriptionEasyOrderService.saveInsuranceMembers(configBean,request);
		return saveInsuranceMembers.isPresent() ? saveInsuranceMembers.get() : null;
	}
	
	@PostMapping(path = "/RequestInsurance")
	public SaveRequestCashResponse saveRequestCash(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestBody SaveRequestCashBean requestBody) throws AldawaaEprescriptionEasyOrderException {
		
		CustomerRequestBean customerRequestBean = new CustomerRequestBean(requestBody.getCustomer().getExternalId(),
				requestBody.getCustomer().getName(), requestBody.getCustomer().getMobileNumber(),
				requestBody.getCustomer().getEmail(), requestBody.getCustomer().getGender());
		
		AddressRequestBean addressRequestBean = new AddressRequestBean(requestBody.getAddress().getExternalId(),
				requestBody.getAddress().getAddressTitle(), requestBody.getAddress().getCityId(),
				requestBody.getAddress().getDistrectId(), requestBody.getAddress().getStreet(),
				requestBody.getAddress().getBuildingNumber(), requestBody.getAddress().getApartmentNumber(),
				requestBody.getAddress().getMobileNumber());
		
		MemberRequestBean memberRequestBean = new MemberRequestBean(requestBody.getMember().getName(),
				requestBody.getMember().getnId(), requestBody.getMember().getInsuranceCompanyId());
		
		SaveRequestCashBean request = new SaveRequestCashBean(customerRequestBean, addressRequestBean,
				memberRequestBean, requestBody.getAttachment1(), requestBody.getAttachment2(),
				requestBody.getAttachment3(), requestBody.getTitle(), requestBody.getDeliveryMethod(),
				requestBody.getDeliverySlotDate(), requestBody.getDeliverySlotTime(), requestBody.getRequestComments(),
				requestBody.getStoreCode(), requestBody.getMobileNumber());
		
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl,clientCode, clientSecret);
		
		Optional<SaveRequestCashResponse> saveRequestCash = aldawaaEprescriptionEasyOrderService.saveRequestCash(configBean, request);
		return saveRequestCash.isPresent() ? saveRequestCash.get() : null;
	}
	
	@PostMapping(path = "/RequestWasfaty")
	public CheckWasfatyValidatiorResponse checkWasfatyValidatior(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestBody CheckWasfatyValidatiorRequest requestBody) throws AldawaaEprescriptionEasyOrderException {
		
		AddressRequestBean addressRequestBean = new AddressRequestBean(requestBody.getAddress().getExternalId(),
				requestBody.getAddress().getAddressTitle(), requestBody.getAddress().getCityId(),
				requestBody.getAddress().getDistrectId(), requestBody.getAddress().getStreet(),
				requestBody.getAddress().getBuildingNumber(), requestBody.getAddress().getApartmentNumber(),
				requestBody.getAddress().getMobileNumber());
		
		
		CheckWasfatyValidatiorRequest request = new CheckWasfatyValidatiorRequest(addressRequestBean,requestBody.getnId(),requestBody.getPrescriptionId(),requestBody.getCity(),requestBody.getDistrict(),requestBody.getDeliveryMethod());
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<CheckWasfatyValidatiorResponse>  saveInsuranceMembers =  aldawaaEprescriptionEasyOrderService.checkWasfatyValidatior(configBean,request);
		return saveInsuranceMembers.isPresent() ? saveInsuranceMembers.get() : null;
	}
	
	@PostMapping(path = "/saveRequestEasyOrder")
	public SaveRequestEasyOrderResponse saveRequestEasyOrder(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestParam(required = true) String customerExternalId) throws AldawaaEprescriptionEasyOrderException {
		
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<SaveRequestEasyOrderResponse>  saveRequestEasyOrder= aldawaaEprescriptionEasyOrderService.saveRequestEasyOrder(configBean,customerExternalId);
		return saveRequestEasyOrder.isPresent() ? saveRequestEasyOrder.get() : null;
	}
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	@ExceptionHandler({ AldawaaEprescriptionEasyOrderException.class })
	public ErrorListDTO handleAldawaaEprescriptionEasyOrderException(final AldawaaEprescriptionEasyOrderException ex){
		ErrorListDTO errorListDTO=new ErrorListDTO();
		ErrorDTO errorDTO=new ErrorDTO();
		
		errorDTO.setErrorCode(ex.getType().getErrorCode());
		errorDTO.setExceptionMessage(ex.getMessage());
		errorDTO.setReason(ex.getType().getErrorMessage());
		errorDTO.setType(ex.getType().toString());
		errorListDTO.setErrors(Arrays.asList(errorDTO));
		
		return errorListDTO;
	}
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	@ExceptionHandler({ IllegalArgumentException.class })
	public ErrorListDTO handleIllegalArgumentException(final IllegalArgumentException ex){
		ErrorListDTO errorListDTO=new ErrorListDTO();
		ErrorDTO errorDTO=new ErrorDTO();
		
		errorDTO.setErrorCode(HttpStatus.BAD_REQUEST.toString());
		errorDTO.setExceptionMessage(ex.getMessage());
		errorDTO.setReason(ex.getMessage());
		errorDTO.setType("IllegalArgumentException");
		errorListDTO.setErrors(Arrays.asList(errorDTO));
		
		return errorListDTO;
	}
}
