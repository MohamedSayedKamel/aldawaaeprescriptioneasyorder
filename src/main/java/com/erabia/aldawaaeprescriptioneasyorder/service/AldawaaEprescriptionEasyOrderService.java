package com.erabia.aldawaaeprescriptioneasyorder.service;

import java.util.Optional;

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

public interface AldawaaEprescriptionEasyOrderService {

	public Optional<InsuranceCompanyResponse> getInsuranceCompanies(AldawaaEprescriptionEasyOrderConfigBean configBean)
			throws AldawaaEprescriptionEasyOrderException;

	public Optional<InsuranceCompanyResponse> getDeliveryCities(AldawaaEprescriptionEasyOrderConfigBean configBean)
			throws AldawaaEprescriptionEasyOrderException;

	public Optional<PickUpCityResponse> getPickUpCities(AldawaaEprescriptionEasyOrderConfigBean configBean)
			throws AldawaaEprescriptionEasyOrderException;

	public Optional<DeliveryDistrictsResponse> getDeliveryDistricts(AldawaaEprescriptionEasyOrderConfigBean configBean,
			String cityId) throws AldawaaEprescriptionEasyOrderException;

	public Optional<PickUpDistrictsResponse> getPickUpDistricts(AldawaaEprescriptionEasyOrderConfigBean configBean,
			String cityEN) throws AldawaaEprescriptionEasyOrderException;

	public Optional<PickUpStoresResponse> getPickUpStores(AldawaaEprescriptionEasyOrderConfigBean configBean,
			String cityEN, String districtEN, String gps) throws AldawaaEprescriptionEasyOrderException;

	public Optional<DeliverySlotsResponse> getDeliverySlots(AldawaaEprescriptionEasyOrderConfigBean configBean,
			String storeCode, String city, String distrct) throws AldawaaEprescriptionEasyOrderException;

	public Optional<InsuranceMembersListResponse> getInsuranceMembersList(AldawaaEprescriptionEasyOrderConfigBean configBean,
			String customerExternalId)throws AldawaaEprescriptionEasyOrderException;

	public Optional<SaveInsuranceMembersResponse> saveInsuranceMembers(AldawaaEprescriptionEasyOrderConfigBean configBean,
			SaveRequestInsuranceMemberRequest request)throws AldawaaEprescriptionEasyOrderException;

	public Optional<SaveRequestCashResponse> saveRequestCash(AldawaaEprescriptionEasyOrderConfigBean configBean,
			SaveRequestCashBean request) throws AldawaaEprescriptionEasyOrderException;

	public Optional<CheckWasfatyValidatiorResponse> checkWasfatyValidatior(AldawaaEprescriptionEasyOrderConfigBean configBean,
			CheckWasfatyValidatiorRequest request)throws AldawaaEprescriptionEasyOrderException;
	
	public Optional<SaveRequestEasyOrderResponse> saveRequestEasyOrder(AldawaaEprescriptionEasyOrderConfigBean configBean , 
			String customerExternalId)throws AldawaaEprescriptionEasyOrderException;
	
}
