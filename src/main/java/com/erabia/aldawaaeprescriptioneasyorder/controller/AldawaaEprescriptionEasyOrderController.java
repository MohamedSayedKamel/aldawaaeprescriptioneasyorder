package com.erabia.aldawaaeprescriptioneasyorder.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
import com.erabia.aldawaaeprescriptioneasyorder.bean.request.RequestEasyOrderItems;
import com.erabia.aldawaaeprescriptioneasyorder.bean.request.SaveRequestCashBean;
import com.erabia.aldawaaeprescriptioneasyorder.bean.request.SaveRequestEasyOrderRequest;
import com.erabia.aldawaaeprescriptioneasyorder.bean.request.SaveRequestHealthRequest;
import com.erabia.aldawaaeprescriptioneasyorder.bean.request.SaveRequestInsuranceRequest;
import com.erabia.aldawaaeprescriptioneasyorder.bean.request.SaveRequestWasfatyRequest;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.CheckWasfatyValidatiorResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.CustomerCashRequestResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.CustomerEasyOrderRequestResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.CustomerHealthRequestResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.CustomerInsuranceRequestResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.CustomerWasfatyRequestResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.DeliveryDistrictsResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.DeliverySlotsResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.InsuranceCompanyResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.InsuranceMembersListResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.LastMemberDataForInsuranceResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.PickUpCityResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.PickUpDistrictsResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.PickUpStoresResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.SaveInsuranceMembersResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.SaveRequestCashResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.SaveRequestEasyOrderResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.SaveRequestHealthResponse;
import com.erabia.aldawaaeprescriptioneasyorder.bean.response.SaveRequestWasfatyResponse;
import com.erabia.aldawaaeprescriptioneasyorder.dto.error.ErrorDTO;
import com.erabia.aldawaaeprescriptioneasyorder.dto.error.ErrorListDTO;
import com.erabia.aldawaaeprescriptioneasyorder.exception.AldawaaEprescriptionEasyOrderException;
import com.erabia.aldawaaeprescriptioneasyorder.exception.enums.RequestType;
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
	public InsuranceCompanyResponse getDeliveryCitiesList(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret) throws AldawaaEprescriptionEasyOrderException {
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<InsuranceCompanyResponse>  deliveryCities= aldawaaEprescriptionEasyOrderService.getDeliveryCitiesList(configBean);
		return deliveryCities.isPresent() ? deliveryCities.get() : null;
	}
	
	@GetMapping(path = "/PickUpCities")
	public PickUpCityResponse getPickUpCitiesList(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret) throws AldawaaEprescriptionEasyOrderException {
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<PickUpCityResponse>  pickUpCity= aldawaaEprescriptionEasyOrderService.getPickUpCitiesList(configBean);
		return pickUpCity.isPresent() ? pickUpCity.get() : null;
	}
	
	
	@GetMapping(path = "/DeliveryDistricts")
	public DeliveryDistrictsResponse getDeliveryDistrictsList(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestParam(required = true) String cityId) throws AldawaaEprescriptionEasyOrderException {
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<DeliveryDistrictsResponse>  deliveryDistricts= aldawaaEprescriptionEasyOrderService.getDeliveryDistrictsList(configBean,cityId);
		return deliveryDistricts.isPresent() ? deliveryDistricts.get() : null;
	}
	
	@GetMapping(path = "/PickUpDistricts")
	public PickUpDistrictsResponse getPickUpDistrictsList(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestParam(required = true) String cityEN) throws AldawaaEprescriptionEasyOrderException {
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<PickUpDistrictsResponse>  pickUpDistricts= aldawaaEprescriptionEasyOrderService.getPickUpDistrictsList(configBean,cityEN);
		return pickUpDistricts.isPresent() ? pickUpDistricts.get() : null;
	}
	
	@GetMapping(path = "/PickUpStores")
	public PickUpStoresResponse getPickUpStoresList(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestParam (required = false) String cityEN,@RequestParam (required = false) String districtEN,@RequestParam (required = false)String gps) throws AldawaaEprescriptionEasyOrderException {
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<PickUpStoresResponse>  pickUpStores= aldawaaEprescriptionEasyOrderService.getPickUpStoresList(configBean,cityEN,districtEN,gps);
		return pickUpStores.isPresent() ? pickUpStores.get() : null;
	}
	
	@GetMapping(path = "/DeliverySlots")
	public DeliverySlotsResponse getDeliverySlotsList(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestParam(required = true) String storeCode,
			@RequestParam(required = true) String city,
			@RequestParam(required = true) String distrct,
			@RequestParam(required = true) RequestType requestType) throws AldawaaEprescriptionEasyOrderException {
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<DeliverySlotsResponse>  deliverySlots =  aldawaaEprescriptionEasyOrderService.getDeliverySlotsList(configBean,storeCode,city,distrct,requestType);
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
	
	
	@PostMapping(path = "/RequestInsurance")
	public SaveInsuranceMembersResponse saveRequestInsurance(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestBody SaveRequestInsuranceRequest requestBody) throws AldawaaEprescriptionEasyOrderException {
		
		CustomerRequestBean customerRequestBean = new CustomerRequestBean(requestBody.getCustomer().getExternalId(), requestBody.getCustomer().getName(), requestBody.getCustomer().getMobileNumber(), requestBody.getCustomer().getEmail(), requestBody.getCustomer().getGender());
		AddressRequestBean addressRequestBean = new AddressRequestBean(requestBody.getAddress().getExternalId(),
				requestBody.getAddress().getAddressTitle(), requestBody.getAddress().getCityId(),
				requestBody.getAddress().getDistrectId(), requestBody.getAddress().getStreet(),
				requestBody.getAddress().getBuildingNumber(), requestBody.getAddress().getApartmentNumber(),
				requestBody.getAddress().getMobileNumber());
		MemberRequestBean   memberRequestBean =new MemberRequestBean(requestBody.getMember().getName(), requestBody.getMember().getnId(), requestBody.getMember().getInsuranceCompanyId());
		
		SaveRequestInsuranceRequest request = new SaveRequestInsuranceRequest(customerRequestBean, addressRequestBean,memberRequestBean,requestBody.getPaymentMethod(),
				requestBody.getAttachment1(),requestBody.getAttachment2(),requestBody.getAttachment3(),requestBody.getAttachment4(),
				requestBody.getTitle(),requestBody.getDeliveryMethod(),requestBody.getDeliverySlotDate(),requestBody.getDeliverySlotTime(),requestBody.getRequestComments(),
				requestBody.getStoreCode(),requestBody.getMobileNumber());
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<SaveInsuranceMembersResponse>  saveRequestInsurance =  aldawaaEprescriptionEasyOrderService.saveRequestInsurance(configBean,request);
		return saveRequestInsurance.isPresent() ? saveRequestInsurance.get() : null;
	}
	
	@PostMapping(path = "/RequestCash")
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
				
		SaveRequestCashBean request = new SaveRequestCashBean(customerRequestBean, addressRequestBean,requestBody.getPaymentMethod(), requestBody.getAttachment1(), requestBody.getAttachment2(),
				requestBody.getAttachment3(), requestBody.getTitle(), requestBody.getDeliveryMethod(),
				requestBody.getDeliverySlotDate(), requestBody.getDeliverySlotTime(), requestBody.getRequestComments(),
				requestBody.getStoreCode(), requestBody.getMobileNumber());
		
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl,clientCode, clientSecret);
		
		Optional<SaveRequestCashResponse> saveRequestCash = aldawaaEprescriptionEasyOrderService.saveRequestCash(configBean, request);
		return saveRequestCash.isPresent() ? saveRequestCash.get() : null;
	}
	
	
	@PostMapping(path = "/RequestHealth")
	public SaveRequestHealthResponse saveRequestHealth(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestBody SaveRequestHealthRequest requestBody) throws AldawaaEprescriptionEasyOrderException {
		
		CustomerRequestBean customerRequestBean = new CustomerRequestBean(requestBody.getCustomer().getExternalId(),
				requestBody.getCustomer().getName(), requestBody.getCustomer().getMobileNumber(),
				requestBody.getCustomer().getEmail(), requestBody.getCustomer().getGender());
		
		AddressRequestBean addressRequestBean = new AddressRequestBean(requestBody.getAddress().getExternalId(),
				requestBody.getAddress().getAddressTitle(), requestBody.getAddress().getCityId(),
				requestBody.getAddress().getDistrectId(), requestBody.getAddress().getStreet(),
				requestBody.getAddress().getBuildingNumber(), requestBody.getAddress().getApartmentNumber(),
				requestBody.getAddress().getMobileNumber());
		
		SaveRequestHealthRequest request = new SaveRequestHealthRequest(customerRequestBean, addressRequestBean,
				 requestBody.getnId(), requestBody.getPrescriptionId(),
				requestBody.getDeliveryMethod(), requestBody.getDeliverySlotDate(), requestBody.getDeliverySlotTime(),
				requestBody.getRequestComments(), requestBody.getStoreCode(), requestBody.getMobileNumber());
		
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl,clientCode, clientSecret);
		
		Optional<SaveRequestHealthResponse> saveRequestHealth = aldawaaEprescriptionEasyOrderService.saveRequestHealth(configBean, request);
		return saveRequestHealth.isPresent() ? saveRequestHealth.get() : null;
	}
	
	@PostMapping(path = "/RequestWasfaty")
	public SaveRequestWasfatyResponse saveRequestWasfaty(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestBody SaveRequestHealthRequest requestBody) throws AldawaaEprescriptionEasyOrderException {
		
		CustomerRequestBean customerRequestBean = new CustomerRequestBean(requestBody.getCustomer().getExternalId(),
				requestBody.getCustomer().getName(), requestBody.getCustomer().getMobileNumber(),
				requestBody.getCustomer().getEmail(), requestBody.getCustomer().getGender());
		
		AddressRequestBean addressRequestBean = new AddressRequestBean(requestBody.getAddress().getExternalId(),
				requestBody.getAddress().getAddressTitle(), requestBody.getAddress().getCityId(),
				requestBody.getAddress().getDistrectId(), requestBody.getAddress().getStreet(),
				requestBody.getAddress().getBuildingNumber(), requestBody.getAddress().getApartmentNumber(),
				requestBody.getAddress().getMobileNumber());
		
		SaveRequestWasfatyRequest request = new SaveRequestWasfatyRequest(customerRequestBean, addressRequestBean,
				 requestBody.getnId(), requestBody.getPrescriptionId(),
				requestBody.getDeliveryMethod(), requestBody.getDeliverySlotDate(), requestBody.getDeliverySlotTime(),
				requestBody.getRequestComments(), requestBody.getStoreCode(), requestBody.getMobileNumber());
		
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl,clientCode, clientSecret);
		
		Optional<SaveRequestWasfatyResponse> saveRequestWasfaty = aldawaaEprescriptionEasyOrderService.saveRequestWasfaty(configBean, request);
		return saveRequestWasfaty.isPresent() ? saveRequestWasfaty.get() : null;
	}
	@PostMapping(path = "/RequestWasfaty/Inquiry")
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
	
	@PostMapping(path = "/RequestEasyOrder")
	public SaveRequestEasyOrderResponse saveRequestEasyOrder(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestBody(required = true) SaveRequestEasyOrderRequest requestBody) throws AldawaaEprescriptionEasyOrderException {
		
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
	
		CustomerRequestBean customerRequestBean = new CustomerRequestBean(requestBody.getCustomer().getExternalId(),
				requestBody.getCustomer().getName(), requestBody.getCustomer().getMobileNumber(),
				requestBody.getCustomer().getEmail(), requestBody.getCustomer().getGender());
		
		AddressRequestBean addressRequestBean = new AddressRequestBean(requestBody.getAddress().getExternalId(),
				requestBody.getAddress().getAddressTitle(), requestBody.getAddress().getCityId(),
				requestBody.getAddress().getDistrectId(), requestBody.getAddress().getStreet(),
				requestBody.getAddress().getBuildingNumber(), requestBody.getAddress().getApartmentNumber(),
				requestBody.getAddress().getMobileNumber());
		
		List<RequestEasyOrderItems> items = new ArrayList<>();
		
		for (RequestEasyOrderItems requestEasyOrderItems : requestBody.getItems()) 
			items.add(new RequestEasyOrderItems(requestEasyOrderItems.getTitle(),requestEasyOrderItems.getDesc(),requestEasyOrderItems.getPhoto(),requestEasyOrderItems.getQty()));	
		
		SaveRequestEasyOrderRequest request = new SaveRequestEasyOrderRequest(customerRequestBean, addressRequestBean,items,requestBody.getDeliveryMethod(),requestBody.getDeliverySlotDate()
				,requestBody.getDeliverySlotTime(),requestBody.getRequestComments(),requestBody.getStoreCode(),requestBody.getMobileNumber());
		
		
		Optional<SaveRequestEasyOrderResponse>  saveRequestEasyOrder= aldawaaEprescriptionEasyOrderService.saveRequestEasyOrder(configBean,request);
		return saveRequestEasyOrder.isPresent() ? saveRequestEasyOrder.get() : null;
	}
	
	@GetMapping(path = "/RequestInsuranceLastMember")
	public LastMemberDataForInsuranceResponse getLastMemberDataForInsuranceRequest(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestParam(required = true) String customerExternalId) throws AldawaaEprescriptionEasyOrderException {
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<LastMemberDataForInsuranceResponse>  lastMemberDataForInsuranceRequest =  aldawaaEprescriptionEasyOrderService.getLastMemberDataForInsuranceRequest(configBean,customerExternalId);
		return lastMemberDataForInsuranceRequest.isPresent() ? lastMemberDataForInsuranceRequest.get() : null;
	}
	
	@GetMapping(path = "/RequestCashList")
	public CustomerCashRequestResponse getCustomerCashRequest(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestParam(required = true) String customerExternalId,
			@RequestParam(required = true) String page) throws AldawaaEprescriptionEasyOrderException {
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<CustomerCashRequestResponse>  customerCashRequest =  aldawaaEprescriptionEasyOrderService.getCustomerCashRequest(configBean,customerExternalId,page);
		return customerCashRequest.isPresent() ? customerCashRequest.get() : null;
	}
	@GetMapping(path = "/RequestInsuranceList")
	public CustomerInsuranceRequestResponse getCustomerInsuranceRequest(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestParam(required = true) String customerExternalId,
			@RequestParam(required = true) String page) throws AldawaaEprescriptionEasyOrderException {
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<CustomerInsuranceRequestResponse>  customerInsuranceRequest =  aldawaaEprescriptionEasyOrderService.getCustomerInsuranceRequest(configBean,customerExternalId,page);
		return customerInsuranceRequest.isPresent() ? customerInsuranceRequest.get() : null;
	}
	
	@GetMapping(path = "/RequestHealthList")
	public CustomerHealthRequestResponse getCustomerHealthRequest(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestParam(required = true) String customerExternalId,
			@RequestParam(required = true) String page) throws AldawaaEprescriptionEasyOrderException {
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<CustomerHealthRequestResponse>  customerHealthRequest =  aldawaaEprescriptionEasyOrderService.getCustomerHealthRequest(configBean,customerExternalId,page);
		return customerHealthRequest.isPresent() ? customerHealthRequest.get() : null;
	}
	@GetMapping(path = "/RequestWasfatyList")
	public CustomerWasfatyRequestResponse getCustomerWasfatyRequest(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestParam(required = true) String customerExternalId,
			@RequestParam(required = true) String page) throws AldawaaEprescriptionEasyOrderException {
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<CustomerWasfatyRequestResponse>  customerWasfatyRequest =  aldawaaEprescriptionEasyOrderService.getCustomerWasfatyRequest(configBean,customerExternalId,page);
		return customerWasfatyRequest.isPresent() ? customerWasfatyRequest.get() : null;
	}
	@GetMapping(path = "/RequestEasyOrderList")
	public CustomerEasyOrderRequestResponse getCustomerEasyOrderRequest(
			@RequestParam(defaultValue = BASE_URL, required = true) String baseUrl,
			@RequestParam(defaultValue = CLIENT_CODE, required = true) String clientCode,
			@RequestParam(defaultValue = CLIENT_SECRET, required = true) String clientSecret,
			@RequestParam(required = true) String customerExternalId,
			@RequestParam(required = true) String page) throws AldawaaEprescriptionEasyOrderException {
		AldawaaEprescriptionEasyOrderConfigBean configBean = new AldawaaEprescriptionEasyOrderConfigBean(baseUrl, clientCode, clientSecret);
		Optional<CustomerEasyOrderRequestResponse>  customerEasyOrderRequest =  aldawaaEprescriptionEasyOrderService.getCustomerEasyOrderRequest(configBean,customerExternalId,page);
		return customerEasyOrderRequest.isPresent() ? customerEasyOrderRequest.get() : null;
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
