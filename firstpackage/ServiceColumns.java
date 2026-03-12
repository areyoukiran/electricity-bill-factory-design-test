package firstpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ServiceColumns {

	public static final String MACHINE_DATE_FORMAT = "ddMMyyyy";
	public static final String MACHINE_TIME_FORMAT = "HH:mm";
	public static final String MACHINE_DATE_TIME_FORMAT = MACHINE_DATE_FORMAT + " " + MACHINE_TIME_FORMAT;
	public static final String READABLE_DATE_FORMAT = "dd/MM/yyyy";
	public static final String EXPORT_DATE_FORMAT = "ddMMyyyy";
	public static final String SERVICE_TYPE_NORMAL = ""; // value is blank for normal records.

	public static final String _ID = "_ID";
	public static final String CIRCLE_NAME = "CIRCLE_NAME";
	public static final String BILL_NUMBER = "BILL_NUMBER";
	// header columnsf
	public static final String ERO_NAME = "ERO_NAME";
	public static final String ERO_CODE = "ERO_CODE";
	public static final String ERO_PHONE = "ERO_PHONE";
	public static final String AE_PHONE = "AE_PHONE";
	public static final String AAO_PHONE = "AAO_PHONE";
	public static final String NO_OF_SERVICES = "NO_OF_SERVICES";
	public static final String TOLL_FREE_NO = "tollfreeNo";
	public static final String FY = "fy";
	public static final String DATA_TYPE = "dataType";
	public static final String HEADER1 = "header1";
	public static final String HEADER2 = "header2";
	public static final String HEADER3 = "header3";
	public static final String AAO_MOBILE_PHONE = "aaoMobileNo";
	public static final String AE_MOBILE_PHONE = "aeMobileNo";
	public static final String NO_OF_SCS = "noofScs";

	// public static final String DATA_FLAG = "DATA_FLAG";
	public static final String READER_NAME = "READER_NAME";
	public static final String FSA_MSG1 = "FSA_MSG1";
	public static final String FSA_MSG2 = "FSA_MSG2";
	public static final String FSA_MSG3 = "FSA_MSG3";
	public static final String FYEAR1 = "FYEAR1";
	public static final String FYEAR2 = "FYEAR2";
	public static final String CIN = "CIN";
	public static final String FILE_NAME = "FILE_NAME";
//end of header columns
	public static final String SECTION_NAME = "SECTION_NAME";
	public static final String SECTION_CODE = "SECTION_CODE";
	public static final String DIST_OR_ZONE_NAME = "DIST_OR_ZONE_NAME";
	public static final String DIST_OR_AREA_CODE = "DIST_OR_AREA_CODE";
	public static final String AREA_CODE = "AREA_CODE";
	public static final String SUB_DIVISION_CODE = "SUB_DIVISION_CODE";
	public static final String SERVICE_NUMBER = "SERVICE_NUMBER";
	public static final String MACHINE_CODE = "MACHINE_CODE";
	public static final String USC_CODE = "USC_CODE";
	public static final String USC_NUMBER = "USC_NUMBER";
	public static final String TRANSFORMER_CODE = "TRANSFORMER_CODE";

	public static final String CONSUMER_NAME = "CONSUMER_NAME";
	public static final String NAME = "NAME";
	public static final String ADDRESS = "ADDRESS";
	public static final String ADDRESS1 = "ADDRESS1";
	public static final String ADDRESS2 = "ADDRESS2";
	public static final String ADDRESS3 = "ADDRESS3";
	public static final String CATEGORY = "CATEGORY";
	public static final String SUB_CATEGORY = "SUB_CATEGORY"; // Added on 2016July
	public static final String GROUP_IMPORT = "GROUP_IMPORT"; // Added on 2016July
	public static final String GROUP_EXPORT = "GROUP_EXPORT";
	public static final String GROUP_CODE = "GROUP_CODE";
	// public static final String GROUP_X = "GROUP_X";
	public static final String CONTRACTED_LOAD = "CONTRACTED_LOAD";
	public static final String CONNECTED_LOAD = "CONNECTED_LOAD";
	public static final String PHASE = "PHASE";
	public static final String METER_PHASE = "METER_PHASE";
	public static final String PHASE_DEFECT = "PHASE_DEFECT"; // Added on 2016July
	public static final String METER_NUMBER = "METER_NUMBER";
	public static final String METER_TYPE = "METER_TYPE"; // E / M / I
	public static final String METER_LOCATION = "METER_LOCATION";
	public static final String METER_POSITION_FLAG = "METER_POSITION_FLAG"; // I / O
	public static final String LT_METER_LOAD = "LT_METER_LOAD";
	public static final String TC_SEAL_NO = "TC_SEAL_NO";
	public static final String TC_SEAL_NUMBER = "TC_SEAL_NUMBER";
	public static final String STRUCTURE_CODE = "STRUCTURE_CODE";
	public static final String POLE_NUMBER = "POLE_NUMBER";
	public static final String CYCLE = "CYCLE";
	public static final String METER_MAKE = "METER_MAKE";
	public static final String METER_CAPACITY = "METER_CAPACITY";
	public static final String DATE_OF_REPLACEMENT = "DATE_OF_REPLACEMENT";
	public static final String OLD_MTR_STATUS = "OLD_MTR_STATUS";
	public static final String OLD_MTR_READING = "OLD_MTR_READING";
	public static final String OLD_METER_READING_KVAH = "OLD_METER_READING_KVAH"; // Added on 2016July
	public static final String OLD_MTR_DATE = "OLD_MTR_DATE";
	public static final String OLD_AVERAGE = "OLD_AVERAGE";
	public static final String OLD_ARREARS = "OLD_ARREARS";
	// public static final String EXPORT_OLD_ARREARS = "EXPORT_OLD_ARREARS";
	public static final String NEW_ARREARS = "NEW_ARREARS";
	// public static final String EXPORT_NEW_ARREARS = "EXPORT_NEW_ARREARS";
	public static final String CC_ARREARS = "CC_ARREARS";
	public static final String ROUNDING_AMOUNT = "ROUNDING_AMOUNT";
	public static final String NET_TOTAL_AMOUNT = "NET_TOTAL_AMOUNT";
	public static final String ED_INTEREST = "ED_INTEREST";
	public static final String ADDITIONAL_ED_INTEREST = "ADDITIONAL_ED_INTEREST";
	public static final String FSA = "FSA";
	public static final String ASURCHG = "ASURCHG";
	public static final String ADDITIONAL_SUR_CHARGE = "ADDITIONAL_SUR_CHARGE";
	// public static final String EXPORT_ADDITIONAL_SUR_CHARGE =
	// "EXPORT_ADDITIONAL_SUR_CHARGE";
	public static final String PROVISIONAL_AMOUNT = "PROVISIONAL_AMOUNT";
	public static final String PROVISIONAL_ED_CHARGES = "PROVISIONAL_ED_CHARGES";
	public static final String PROVISIONAL_CC_AMOUNT = "PROVISIONAL_CC_AMOUNT";
	public static final String PROVISIONAL_ED_AMOUNT = "PROVISIONAL_ED_AMOUNT";
	public static final String BILLING_DAYS = "BILLING_DAYS";
	public static final String ACD_DUE_AMOUNT = "ACD_DUE_AMOUNT";
	public static final String ACD_AMOUNT = "ACD_AMOUNT";
	public static final String ACD_SUR_CHARGE = "ACD_SUR_CHARGE";
	public static final String TCS_AMOUNT = "TCS_AMOUNT";
	public static final String GOVT_SUBSIDY = "GOVT_SUBSIDY";
	public static final String INSTALLMENT_DUE_AMOUNT = "INSTALLMENT_DUE_AMOUNT";
	public static final String DWEL_NUMBER = "DWEL_NUMBER";
	public static final String AGREEMENT_AMOUNT = "AGREEMENT_AMOUNT";
	public static final String EROPHNO = "EROPHNO";
	public static final String LAST_PAYMENT = "LAST_PAYMENT";
	public static final String LAST_PAYMENT_DATE = "LAST_PAYMENT_DATE"; // Added on 2016July
	public static final String LAST_PAID_DATE = "LAST_PAID_DATE"; // Added on 2016July
	public static final String LAST_PAID_AMOUNT = "LAST_PAID_AMOUNT";
	public static final String REMARKS_1 = "REMARKS_1";
	public static final String REMARKS1 = "REMARKS1";
	public static final String REMARKS2 = "REMARKS2";
	public static final String REMARKS3 = "REMARKS3";
	public static final String REMARKS4 = "REMARKS4";
	public static final String REMARKS_2 = "REMARKS_2";
	public static final String REMARKS2_AMOUNT = "REMARKS2_AMOUNT";
	public static final String REMARKS3_AMOUNT = "REMARKS3_AMOUNT";
	public static final String REMARKS4_AMOUNT = "REMARKS4_AMOUNT";
	public static final String MF = "MF";
	public static final String PAMOUNT = "PAMOUNT";
	public static final String PEDCHG = "PEDCHG";
	public static final String AGL_DEMAND = "AGL_DEMAND";
	public static final String AGL1_SCNO = "AGL1_SCNO";
	public static final String AGL1_ARREARS = "AGL1_ARREARS";
	public static final String AGL2_SCNO = "AGL2_SCNO";
	public static final String AGL2_ARREARS = "AGL2_ARREARS";
	public static final String DOOR_NUMBER_FLAG = "DOOR_NUMBER_FLAG";
	public static final String DOOR_NUMBER = "DOOR_NUMBER";
	public static final String CHK_KWH_READING = "CHK_KWH_READING"; // Added on 2016July
	public static final String CHK_KVAH_READING = "CHK_KVAH_READING"; // Added on 2016July
	public static final String LAST_MONTH_UNITS = "LAST_MONTH_UNITS"; // Added on 2016July
	public static final String METER_MECH_OR_ELECTR_OR_CT_ELECT = "METER_MECH_OR_ELECTR_OR_CT_ELECT";
	public static final String CUMULATEDUNITS = "CUMULATEDUNITS";
	public static final String CUMULATIVE_UNITS = "CUMULATIVE_UNITS";
	public static final String SOLAR_NET_METER_CF_UNITS = "SOLAR_NET_METER_CF_UNITS";
	public static final String SOLAR_NET_METER_PRESENT_CF_UNITS = "SOLAR_NET_METER_PRESENT_CF_UNITS";
	public static final String SOLAR_METER_FLAG = "SOLAR_METER_FLAG";
	public static final String SOLAR_KWH_METER_READING = "SOLAR_KWH_METER_READING";
	public static final String SOLAR_KVAH_METER_READING = "SOLAR_KVAH_METER_READING";
	public static final String RAPDRP_POLE_NUMBER_FLAG = "RAPDRP_POLE_NUMBER_FLAG";
	public static final String RAPDRP_POLE_NUMBER = "RAPDRP_POLE_NUMBER";
	public static final String ADD_OR_SUB_PERCENTAGE = "ADD_OR_SUB_PERCENTAGE";
	public static final String RMDMF = "RMDMF";
	public static final String SEASSIONAL_FLAG = "SEASSIONAL_FLAG"; // funny spelling
	public static final String CAPACITER_FLAG = "CAPACITER_FLAG"; // funny spelling
	public static final String CAPACITOR_FLAG = "CAPACITOR_FLAG";
	public static final String CAPACITOR_SUR_CHARGE = "CAPACITOR_SUR_CHARGE";
	public static final String EXEMPT_ED_FLAG = "EXEMPT_ED_FLAG";
	public static final String AMG_AMOUNT = "AMG_AMOUNT";
	public static final String AMT_SUBSIDY = "AMT_SUBSIDY";
	public static final String PER_SUBSIDY = "PER_SUBSIDY";
	public static final String SUBSIDY_FLAG = "SUBSIDY_FLAG";
	public static final String SUBSIDI_FLAG = "SUBSIDI_FLAG";
	public static final String TRI_VECTOR_METER_FLAG = "TRI_VECTOR_METER_FLAG";
	public static final String SD_AMOUNT_AVAILABLE = "SD_AMOUNT_AVAILABLE";
	public static final String EDFLAG = "EDFLAG";
	public static final String NO_OF_STREET_LIGHT_POINTS = "NO_OF_STREET_LIGHT_POINTS";
	public static final String CT_CONNECTED_POINTS = "CT_CONNECTED_POINTS";
	public static final String CT_CMD = "CT_CMD";
	public static final String FORCE_HT_BILL = "FORCE_HT_BILL";
	public static final String HT_FLAG = "HT_FLAG";
	public static final String HT_UNITS = "HT_UNITS";
	public static final String EXTRA_COL1 = "EXTRA_COL1";
	public static final String EXTRA_COL2 = "EXTRA_COL2";
	public static final String BILLING_MONTH = "BILLING_MONTH";
	public static final String CATEGORY_CONFIRMATION_FLAG = "CATEGORY_CONFIRMATION_FLAG";
	public static final String EBILLY_VERSION = "EBILLY_VERSION";
	public static final String MONTHLY_OR_BI_MONTHLY = "MONTHLY_OR_BI_MONTHLY";
	public static final String OLD_MTER_UNITS = "OLD_MTER_UNITS";
	public static final String IRDA_TYPE_FLAG = "IRDA_TYPE_FLAG";
	public static final String IRDA_FLAG = "IRDA_FLAG";
	public static final String DATA_FLAG = "DATA_FLAG";
	public static final String IRDA_METER_MANUFACTURER_ID = "IRDA_METER_MANUFACTURER_ID";
	public static final String SBM_ID = "SBM_ID";
	public static final String SIM_NUMBER = "SIM_NUMBER";
	public static final String NEW_METER_IR_KWH = "NEW_METER_IR_KWH";
	public static final String NEW_METER_IR_KVAH = "NEW_METER_IR_KVAH";
	public static final String NEW_METER_FR_KWH = "NEW_METER_FR_KWH";
	public static final String NEW_METER_FR_KVAH = "NEW_METER_FR_KVAH";
	public static final String CONSUMER_AADHAR_FLAG = "CONSUMER_AADHAR_FLAG";
	public static final String EXPORT_METER_OPN_KWH = "EXPORT_METER_OPN_KWH";
	public static final String TENENT_AADHAR_FLAG = "TENENT_AADHAR_FLAG";
	public static final String COMMERCIAL_TAX_REG_NO_FLAG = "COMMERCIAL_TAX_REG_NO_FLAG";
	public static final String CONSUMER_PHONE_NO_FLAG = "CONSUMER_PHONE_NO_FLAG";
	public static final String MOBILE_NUMBER_PROMPT_FLAG = "MOBILE_NUMBER_PROMPT_FLAG";
	public static final String MOBILE_NUMBER = "MOBILE_NUMBER";
	public static final String APPLICATION_NUMBER = "APPLICATION_NUMBER";
	public static final String SERVICE_KWH_IMAGE = "SERVICE_KWH_IMAGE";
	public static final String SERVICE_KVAH_IMAGE = "SERVICE_KVAH_IMAGE";
	public static final String SERVICE_RMD_IMAGE = "SERVICE_RMD_IMAGE";
	public static final String SERVICE_LT_IMAGE = "SERVICE_LT_IMAGE";

	public static final String MOBILE_NUMBER_FURNISHED_FLAG = "MOBILE_NUMBER_FURNISHED_FLAG";
	public static final String RATION_CARD_FURNISHED_FLAG = "RATION_CARD_FURNISHED_FLAG";
	public static final String APPLICATION_FURNISHED_FLAG = "APPLICATION_FURNISHED_FLAG";
	public static final String AADHAR_FURNISHED_FLAG = "AADHAR_FURNISHED_FLAG";
	public static final String AADHAR_PROMPT_FLAG = "AADHAR_PROMPT_FLAG";
	public static final String AADHAR_NUMBER = "AADHAR_NUMBER";
	public static final String OTHERCHRGES1_DES = "OTHERCHRGES1_DES";
	public static final String SCST_FLAG = "SCST_FLAG";
	public static final String OTHER_REVENUE = "OTHER_REVENUE"; // Other Revenue / Pole Rental Charges
	public static final String OTHER_REVENUE_POLE_RENTAL_CHARGES = "OTHER_REVENUE_POLE_RENTAL_CHARGES"; // Other Revenue
																										// / Pole Rental
																										// Charges
	public static final String OTHER_CHRGES2 = "OTHER_CHRGES2";
	public static final String OTHER_CHRGES3 = "OTHER_CHRGES3";
	public static final String OTHER_CHARGES1 = "OTHER_CHARGES1";
	public static final String OTHER_CHARGES2 = "OTHER_CHARGES2";
	public static final String OTHER_CHARGES3 = "OTHER_CHARGES3";
	public static final String OTHERCHRGES2_DES = "OTHERCHRGES2_DES";
	public static final String OTHERCHRGES3_DES = "OTHERCHRGES3_DES";
	public static final String BILL_MAX_UNITS = "BILL_MAX_UNITS";
	public static final String SD_REVIEW = "SD_REVIEW";
	public static final String SD_AVAILABLE = "SD_AVAILABLE";
	public static final String ACD_FLAG = "ACD_FLAG";
	public static final String FSA_AMOUNT = "FSA_AMOUNT";
	public static final String VERSION = "VERSION";
	public static final String MATS_AMOUNT = "MATS_AMOUNT";
	public static final String FIELD_OFFICER_CODE = "FIELD_OFFICER_CODE";
	public static final String FIELD_OFFICER_PHONE = "FIELD_OFFICER_PHONE";

	public static final String PRESENT_METER_READING_KWH = "PRESENT_METER_READING_KWH";
	public static final String PRESENT_KWH_READING = "PRESENT_KWH_READING";
	public static final String PRESENT_METER_READING_KVAH = "PRESENT_METER_READING_KVAH";
	public static final String PRESENT_KVAH_READING = "PRESENT_KVAH_READING";
	public static final String PRESENT_LT_METER_READING = "PRESENT_LT_METER_READING";
	public static final String PRESENT_NET_METER_KWH_READING = "PRESENT_NET_METER_KWH_READING";
	public static final String PRESENT_NET_METER_KVAH_READING = "PRESENT_NET_METER_KVAH_READING";
	public static final String PRESENT_RECORDED_MAXIMUM_DEMAND = "PRESENT_RECORDED_MAXIMUM_DEMAND"; // RMD
	public static final String PRESENT_READING_DATE = "PRESENT_READING_DATE";
	public static final String PRESENT_STATUS = "PRESENT_STATUS";
	public static final String PRESENT_LT_METER_STATUS = "PRESENT_LT_METER_STATUS";
	public static final String INITIAL_KWH_READING = "INITIAL_KWH_READING";
	public static final String FINAL_KWH_READING = "FINAL_KWH_READING";
	public static final String INITIAL_KVAH_READING = "INITIAL_KVAH_READING";
	public static final String FINAL_KVAH_READING = "FINAL_KVAH_READING";
	public static final String INITIAL_LT_KWH_READING = "INITIAL_LT_KWH_READING";
	public static final String FINAL_LT_KWH_READING = "FINAL_LT_KWH_READING";
	public static final String INITIAL_SOLAR_NET_KWH_READING = "INITIAL_SOLAR_NET_KWH_READING";
	public static final String FINAL_SOLAR_NET_KWH_READING = "FINAL_SOLAR_NET_KWH_READING";
	public static final String INITIAL_SOLAR_NET_KVAH_READING = "INITIAL_SOLAR_NET_KVAH_READING";
	public static final String FINAL_SOLAR_NET_KVAH_READING = "FINAL_SOLAR_NET_KVAH_READING";
	public static final String KWH_UNITS = "KWH_UNITS";
	public static final String KVAH_UNITS = "KVAH_UNITS";
	public static final String LT_METER_TOTAL_UNITS = "LT_METER_TOTAL_UNITS";
	public static final String SOLAR_NET_METER_KWH_UNITS = "SOLAR_NET_METER_KWH_UNITS";
	public static final String SOLAR_NET_METER_KVAH_UNITS = "SOLAR_NET_METER_KVAH_UNITS";
	public static final String TOD_UNITS = "TOD_UNITS";
	public static final String TOD1_UNITS = "TOD1_UNITS";
	public static final String TOD2_UNITS = "TOD2_UNITS";
	public static final String TOD3_UNITS = "TOD3_UNITS";
	public static final String NET_BILLED_UNITS = "NET_BILLED_UNITS";
	public static final String PRESENT_METER_READING_RKWH = "PRESENT_METER_READING_RKWH";
	public static final String PRESENT_METER_READING_RMD = "PRESENT_METER_READING_RMD";
	public static final String PRESENT_METER_STAUS = "PRESENT_METER_STAUS";
	public static final String PRDG_DATE = "PRDG_DATE";
	public static final String NEW_METER_NUMBER = "NEW_METER_NUMBER";
	public static final String NEW_TC_SEAL_NUMBER = "NEW_TC_SEAL_NUMBER";
	public static final String BOX_SEAL_NUMBER = "BOX_SEAL_NUMBER";
	public static final String MD_SEAL_NUMBER = "MD_SEAL_NUMBER";
	public static final String NEW_METER_MAKE = "NEW_METER_MAKE";
	public static final String NEW_METER_CAPACITY = "NEW_METER_CAPACITY";
	public static final String REMOVED_METER_STATUS = "REMOVED_METER_STATUS";
	public static final String BILLED_UNITS_KWH = "BILLED_UNITS_KWH";
	public static final String PERCENTAGE_ERROR = "PERCENTAGE_ERROR";
	public static final String REMOVED_METER_READING_KWH = "REMOVED_METER_READING_KWH";
	public static final String REMOVED_METER_READING_KVAH = "REMOVED_METER_READING_KVAH";
	public static final String REMOVED_METER_READING_RKWH = "REMOVED_METER_READING_RKWH";
	public static final String REMOVED_METER_READING_RMD = "REMOVED_METER_READING_RMD";
	public static final String NEW_METER_INITIAL_READING_KWH = "NEW_METER_INITIAL_READING_KWH";
	public static final String NEW_METER_INITIAL_READING_KVAH = "NEW_METER_INITIAL_READING_KVAH";
	public static final String NEW_METER_READING_RKVAH = "NEW_METER_READING_RKVAH";
	public static final String NEW_METER_READING_RMD = "NEW_METER_READING_RMD";
	public static final String NEW_METER_MF = "NEW_METER_MF";
	public static final String NEW_CT_PRIMERY = "NEW_CT_PRIMERY";
	public static final String NEW_CT_SECONDARY = "NEW_CT_SECONDARY";
	public static final String FLAG_KWH_OR_KVAH = "FLAG_KWH_OR_KVAH";
	public static final String AVERAGE_UNITS = "AVERAGE_UNITS";
	public static final String AVERAGE_UNIT = "AVERAGE_UNIT";
	public static final String AVERAGE_BILLING_UNITS = "AVERAGE_BILLING_UNITS";
	public static final String POWER_FACTOR = "POWER_FACTOR";
	public static final String MULTIPLICATION_FACTOR = "MULTIPLICATION_FACTOR";
	public static final String ENERGY_CHARGES = "ENERGY_CHARGES";
	public static final String CUSTOMER_CHARGES = "CUSTOMER_CHARGES";
	public static final String FIXED_CHARGES = "FIXED_CHARGES";
	public static final String ELECTRICITY_DUTY_CHARGES = "ELECTRICITY_DUTY_CHARGES";
	public static final String ED = "ED";
	public static final String ED_INTREST = "ED_INTREST";
	public static final String ADJ_AMOUNT = "ADJ_AMOUNT";
	public static final String EC_ADJUSTMENT_AMOUNT = "EC_ADJUSTMENT_AMOUNT";
	public static final String ED_ADJUSTMENT_AMOUNT = "ED_ADJUSTMENT_AMOUNT";
	public static final String OTHER_CHRGES = "OTHER_CHRGES";
	public static final String LPF_SURCHARGE = "LPF_SURCHARGE";
	public static final String CAP_SURCHARGE = "CAP_SURCHARGE";
	public static final String AMOUNT_SUBSIDY = "AMOUNT_SUBSIDY";
	public static final String SUBSIDY_AMOUNT = "SUBSIDY_AMOUNT";
	public static final String PERCENTAGE_SUBSIDY = "PERCENTAGE_SUBSIDY";
	public static final String LOSS_OR_GAIN = "LOSS_OR_GAIN";
	public static final String BILL_AMOUNT_EXCL_ARREARARS = "BILL_AMOUNT_EXCL_ARREARARS";
	public static final String BILL_AMOUNT = "BILL_AMOUNT";
	public static final String TOTAL_AMONT_INCL_ARRS = "TOTAL_AMONT_INCL_ARRS";
	public static final String DUE_DATE = "DUE_DATE";

	public static final String TIME = "TIME";
	public static final String TIME_STAMP = "TIME_STAMP";
	public static final String LATITUDE = "LATITUDE";
	public static final String LONGITUDE = "LONGITUDE";
	public static final String PREVIOUS_METER_READING_KWH = "PREVIOUS_METER_READING_KWH";
	public static final String PREVIOUS_KWH_READING = "PREVIOUS_KWH_READING";
	public static final String PREVIOUS_METER_READING_KVH = "PREVIOUS_METER_READING_KVH";
	public static final String PREVIOUS_KVAH_READING = "PREVIOUS_KVAH_READING";
	public static final String PREVIOUS_LT_METER_READING = "PREVIOUS_LT_METER_READING";
	public static final String PREVIOUS_NET_METER_KWH_READING = "PREVIOUS_NET_METER_KWH_READING";
	public static final String PREVIOUS_NET_METER_KVAH_READING = "PREVIOUS_NET_METER_KVAH_READING";
	public static final String PREVIOUS_METER_STATUS = "PREVIOUS_METER_STATUS";
	public static final String PREVIOUS_STATUS = "PREVIOUS_STATUS";
	public static final String LT_METER_PREVIOUS_STATUS = "LT_METER_PREVIOUS_STATUS";
	public static final String PREVIOUS_READING_DT = "PREVIOUS_READING_DT";
	public static final String PREVIOUS_READING_DATE = "PREVIOUS_READING_DATE";
	public static final String TRANS_RENTAL_CHARGES = "TRANS_RENTAL_CHARGES";
	// public static final String OLD_METER_STATUS = "OLD_METR_STATUS";
	public static final String BILLED_UNITS_KVAH = "BILLED_UNITS_KVAH";
	public static final String CHK_READING_FLAG = "CHK_READING_FLAG";
	public static final String CONSUMER_AADHAR_NUMBER = "CONSUMER_AADHAR_NUMBER";
	public static final String EXPORT_METER_CLS_KWH = "EXPORT_METER_CLS_KWH";
	public static final String EXPORT_METER_CLS_KVAH = "EXPORT_METER_CLS_KVAH";
	public static final String TENENT_AADHAR_NO = "TENENT_AADHAR_NO";
	public static final String COMMERCIAL_TAX_REG_NO = "COMMERCIAL_TAX_REG_NO";
	public static final String CONSUMER_PHONE_NO = "CONSUMER_PHONE_NO";
	public static final String CONSUMER_PAYABLE = "CONSUMER_PAYABLE";
	public static final String SHORTFALL_AMOUNT = "SHORTFALL_AMOUNT";
	public static final String COMPANY_FLAG = "COMPANY_FLAG";
	public static final String MACHINE_SL_NO = "MACHINE_SL_NO";
	public static final String IRDA_FLAG_X = "IRDA_FLAG_X";

	// Following fields are stored in device for book keeping. These may be
	// pushed to cloud as well. But not exported in the file that is published to
	// APSPDCL Servers
	public static final String DISCONNECTION_DATE = "DISCONNECTION_DATE";

	public static final String _SERVICE_NUMBER = "_SERVICE_NUMBER"; // Userd in device, this field holds service number
																	// in string version with stripped leading zeros.
	public static final String _N_SERVICE_NUMBER = "_N_SERVICE_NUMBER"; // Used in device, holds number value of service
																		// which is used to sort services
	public static final String _PUSH_STATE = "_PUSH_STATE"; // Status of service record in device whether pushed to
															// internet or not
	public static final String _N_METER_NUMBER = "_N_METER_NUMBER"; // METER_NUMBER converted into Integer. This is for
																	// Service lookup by meter number.
	public static final String _PUBLISHED_DATE_TIME = "publishedDateTime"; // if direct publish is enabled this value is
																			// updated in device
	public static final String _PUBLISH_ATTEMPTS = "publishAttempts"; // if direct publish is enabled this value is
																		// updated in device
	public static final String _LAST_PUBLISH_RESPONSE = "lastPublishResponse"; // if direct publish is enabled this
																				// value is updated in device
	public static final String _IS_PUBLISHED_DIRECTLY_FROM_DEVICE = "isPublishedDirectlyFromDevice"; // Represents this
																										// service is
																										// published
																										// from device

	public static final String _COMPANY_CODE = "companyCode";
	public static final String _CIRCLE_CODE = "circleCode";
	public static final String _DIVISION_CODE = "divisionCode";
	public static final String _ERO_CODE = "eroCode";
	public static final String _SUBDIVISION_CODE = "subDivisionCode";
	public static final String _SECTION_CODE = "sectionCode";
	public static final String _DIST_CODE = "distCode";
	public static final String _DEVICE_NAME = "deviceName";
	public static final String _ARREARS = "arrears";

	// Meter data fields. Source of these fields are either from meter scan or
	// manually provided
	public static final String METERDATA_MANUFACTURER_ID = "METERDATA_MANUFACTURER_ID";
	public static final String METERDATA_METER_SERIAL_NO = "METERDATA_METER_SERIAL_NO";
	public static final String METERDATA_PRESENT_CUMULATIVE_ENERGY = "METERDATA_PRESENT_CUMULATIVE_ENERGY";
	public static final String METERDATA_PRESENT_CUMULATIVE_ENERGY_KVAH = "METERDATA_PRESENT_CUMULATIVE_ENERGY_KVAH";
	public static final String METERDATA_PRESENT_RMD = "METERDATA_PRESENT_RMD";
	public static final String METERDATA_INSTANTANEOUS_VOLTAGE_R = "METERDATA_INSTANTANEOUS_VOLTAGE_R";
	public static final String METERDATA_INSTANTANEOUS_VOLTAGE_Y = "METERDATA_INSTANTANEOUS_VOLTAGE_Y";
	public static final String METERDATA_INSTANTANEOUS_VOLTAGE_B = "METERDATA_INSTANTANEOUS_VOLTAGE_B";
	public static final String METERDATA_INSTANTANEOUS_CURRENT_R = "METERDATA_INSTANTANEOUS_CURRENT_R";
	public static final String METERDATA_INSTANTANEOUS_CURRENT_Y = "METERDATA_INSTANTANEOUS_CURRENT_Y";
	public static final String METERDATA_INSTANTANEOUS_CURRENT_B = "METERDATA_INSTANTANEOUS_CURRENT_B";
	public static final String METERDATA_MULTIPLYING_FACTOR = "METERDATA_MULTIPLYING_FACTOR";
	public static final String METERDATA_PHASE = "METERDATA_PHASE";
	public static final String METERDATA_RMD_MONTH2 = "METERDATA_RMDMONTH2";
	public static final String METERDATA_RMD_MONTH3 = "METERDATA_RMDMONTH3";
	public static final String METERDATA_RMD_MONTH4 = "METERDATA_RMDMONTH4";
	public static final String METERDATA_RMD_MONTH5 = "METERDATA_RMDMONTH5";
	public static final String METERDATA_RMD_MONTH6 = "METERDATA_RMDMONTH6";
	public static final String FR_KWH = "FR_KWH";
	public static final String FR_KVAH = "FR_KVAH";
	public static final String EXPORT_FR_KWH = "EXPORT_FR_KWH";
	public static final String SMART_METER_RMD = "SMART_METER_RMD";
	public static final String RATION_CARD_NUMBER = "RATION_CARD_NUMBER";
	public static final String GJ_APPROVED_FLAG = "GJ_APPROVED_FLAG";
	public static final String GJ_SUBSIDY_AMOUNT = "GJ_SUBSIDY_AMOUNT";

	public static final List<String> IMPORT_COLUMN_ORDER = new ArrayList<String>();
	public static final List<String> HEADER_COLUMN_ORDER = new ArrayList<String>();
	public static final List<String> IMPORT_HEADER_COLUMN_ORDER = new ArrayList<String>();

	public static final List<String> EXPORT_COLUMN_ORDER = new ArrayList<String>();
	// public static final int EXPORT_COLUMN_ORDER_PAYLOAD_LENGTH = 650
	// public static final int EXPORT_COLUMN_ORDER_PAYLOAD_LENGTH = 723;
	public static final int EXPORT_COLUMN_ORDER_PAYLOAD_LENGTH = 732;
	public static final List<String> EXPORT_COLUMN_ORDER_V2 = new ArrayList<String>();
	public static final List<String> EXPORT_COLUMN_ORDER_V3 = new ArrayList<String>();
	public static final int EXPORT_COLUMN_ORDER_V2_PAYLOAD_LENGTH = 689;
	public static final int EXPORT_COLUMN_ORDER_V3_PAYLOAD_LENGTH = 714;

	public static final List<String> CURRENT_EXPORT_COLUMN_ORDER = EXPORT_COLUMN_ORDER;
	public static final int CURRENT_EXPORT_COLUMN_ORDER_PAYLOAD_LENGHT = EXPORT_COLUMN_ORDER_PAYLOAD_LENGTH;

	public static final List<String> PUSH_PULL_COLUMN_ORDER = new ArrayList<String>(); // used to serialize and
																						// deserialize a record
	public static final List<String> PUSH_PULL_COLUMN_ORDER_V2 = new ArrayList<String>();
	public static final List<String> PUSH_PULL_COLUMN_ORDER_V3 = new ArrayList<String>();
	public static final List<String> PUSH_PULL_COLUMN_ORDER_V4 = new ArrayList<String>();
	private static final List<String> PUSH_PULL_COLUMN_ORDER_V5 = new ArrayList<String>();

	public static final List<String> PUSH_PULL_COLUMN_ORDER_CURRENT = PUSH_PULL_COLUMN_ORDER;

	static {
		IMPORT_HEADER_COLUMN_ORDER.add(ServiceColumns.ERO_CODE);
		IMPORT_HEADER_COLUMN_ORDER.add(ServiceColumns.ERO_NAME);
		IMPORT_HEADER_COLUMN_ORDER.add(ServiceColumns.TOLL_FREE_NO);
		IMPORT_HEADER_COLUMN_ORDER.add(ServiceColumns.FY);
		IMPORT_HEADER_COLUMN_ORDER.add(ServiceColumns.DATA_TYPE);
		IMPORT_HEADER_COLUMN_ORDER.add(ServiceColumns.HEADER1);
		IMPORT_HEADER_COLUMN_ORDER.add(ServiceColumns.HEADER2);
		IMPORT_HEADER_COLUMN_ORDER.add(ServiceColumns.HEADER3);
		IMPORT_HEADER_COLUMN_ORDER.add(ServiceColumns.AAO_MOBILE_PHONE);

		IMPORT_HEADER_COLUMN_ORDER.add(ServiceColumns.AE_MOBILE_PHONE);
		IMPORT_HEADER_COLUMN_ORDER.add(ServiceColumns.NO_OF_SCS);
		IMPORT_HEADER_COLUMN_ORDER.add(ServiceColumns.SECTION_NAME);

	}
	static {
		HEADER_COLUMN_ORDER.add(ServiceColumns.ERO_CODE);
		HEADER_COLUMN_ORDER.add(ServiceColumns.ERO_NAME);
		HEADER_COLUMN_ORDER.add(ServiceColumns.ERO_PHONE);
		HEADER_COLUMN_ORDER.add(ServiceColumns.FYEAR1);
		HEADER_COLUMN_ORDER.add(ServiceColumns.FYEAR2);
		HEADER_COLUMN_ORDER.add(ServiceColumns.SECTION_NAME);
		// HEADER_COLUMN_ORDER.add(ServiceColumns.READER_NAME);
		HEADER_COLUMN_ORDER.add(ServiceColumns.CIN);
		HEADER_COLUMN_ORDER.add(ServiceColumns.DATA_FLAG);
		HEADER_COLUMN_ORDER.add(ServiceColumns.FSA_MSG1);
		HEADER_COLUMN_ORDER.add(ServiceColumns.FSA_MSG2);
		HEADER_COLUMN_ORDER.add(ServiceColumns.FSA_MSG3);
		HEADER_COLUMN_ORDER.add(ServiceColumns.FILE_NAME);
		HEADER_COLUMN_ORDER.add(ServiceColumns.AE_PHONE);
		HEADER_COLUMN_ORDER.add(ServiceColumns.AAO_PHONE);

	}
	static {
		// IMPORT_COLUMN_ORDER.add(ServiceColumns.CIRCLE_NAME);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.SERVICE_NUMBER);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.AREA_CODE);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.NAME);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.ADDRESS1);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.ADDRESS2);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.ADDRESS3);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.CATEGORY);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.SUB_CATEGORY);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.SUB_DIVISION_CODE);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.SECTION_CODE);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.GROUP_CODE);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.CONTRACTED_LOAD);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.CONNECTED_LOAD);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.LT_METER_LOAD);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.METER_NUMBER);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.METER_PHASE);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.MULTIPLICATION_FACTOR);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.PREVIOUS_KWH_READING);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.PREVIOUS_KVAH_READING);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.PREVIOUS_LT_METER_READING);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.PREVIOUS_READING_DATE);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.PREVIOUS_STATUS);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.LT_METER_PREVIOUS_STATUS);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.OLD_ARREARS);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.NEW_ARREARS);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.ADDITIONAL_SUR_CHARGE);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.ADDITIONAL_ED_INTEREST);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.PROVISIONAL_AMOUNT);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.PROVISIONAL_ED_CHARGES);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.ACD_AMOUNT);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.OTHER_REVENUE);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.OTHER_CHARGES1);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.OTHER_CHARGES2);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.AVERAGE_UNIT);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.METER_MAKE);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.METER_CAPACITY);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.DATE_OF_REPLACEMENT);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.TC_SEAL_NUMBER);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.STRUCTURE_CODE);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.POLE_NUMBER);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.CYCLE);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.CT_CONNECTED_POINTS);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.FORCE_HT_BILL);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.MONTHLY_OR_BI_MONTHLY);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.REMARKS1);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.LAST_PAID_DATE);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.LAST_PAID_AMOUNT);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.CC_ARREARS);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.INSTALLMENT_DUE_AMOUNT);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.DWEL_NUMBER);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.AGREEMENT_AMOUNT);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.SUBSIDY_FLAG);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.TRI_VECTOR_METER_FLAG);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.CAPACITOR_FLAG);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.EXEMPT_ED_FLAG);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.CUMULATIVE_UNITS);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.SOLAR_NET_METER_CF_UNITS);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.CT_CMD);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.HT_FLAG);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.USC_NUMBER);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.IRDA_FLAG);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.SOLAR_METER_FLAG);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.SOLAR_KWH_METER_READING);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.SOLAR_KVAH_METER_READING);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.MOBILE_NUMBER_PROMPT_FLAG);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.AADHAR_PROMPT_FLAG);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.METER_TYPE);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.METER_POSITION_FLAG);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.AGL1_SCNO);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.AGL1_ARREARS);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.AGL2_SCNO);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.AGL2_ARREARS);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.DOOR_NUMBER_FLAG);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.OTHER_CHARGES3);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.REMARKS2);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.REMARKS3);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.REMARKS2_AMOUNT);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.REMARKS3_AMOUNT);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.TCS_AMOUNT);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.REMARKS4);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.REMARKS4_AMOUNT);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.BILL_MAX_UNITS);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.SD_REVIEW);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.SD_AVAILABLE);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.ACD_FLAG);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.FSA_AMOUNT);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.FIELD_OFFICER_CODE);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.FIELD_OFFICER_PHONE);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.AADHAR_NUMBER);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.RATION_CARD_NUMBER);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.MOBILE_NUMBER);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.APPLICATION_NUMBER);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.GJ_APPROVED_FLAG);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.MATS_AMOUNT);
		IMPORT_COLUMN_ORDER.add(ServiceColumns.VERSION);

		//
		//
		// Export Column order
		// Length: 723
		// ---------------------------------------------------------------------// Size,
		// Location
		EXPORT_COLUMN_ORDER.add(ServiceColumns.SERVICE_NUMBER); // 13 1
		EXPORT_COLUMN_ORDER.add(ServiceColumns.USC_NUMBER); // 16 14
		EXPORT_COLUMN_ORDER.add(ServiceColumns.ERO_CODE); // 5 30
		EXPORT_COLUMN_ORDER.add(ServiceColumns.AREA_CODE); // 5 35
		EXPORT_COLUMN_ORDER.add(ServiceColumns.METER_NUMBER); // 8 40
		EXPORT_COLUMN_ORDER.add(ServiceColumns.PREVIOUS_READING_DATE); // 8 48
		EXPORT_COLUMN_ORDER.add(ServiceColumns.PREVIOUS_KWH_READING); // 11 58
		EXPORT_COLUMN_ORDER.add(ServiceColumns.PREVIOUS_KVAH_READING); // 11 69
		EXPORT_COLUMN_ORDER.add(ServiceColumns.PREVIOUS_LT_METER_READING); // 11 80
		EXPORT_COLUMN_ORDER.add(ServiceColumns.PREVIOUS_NET_METER_KWH_READING); // 11 91
		EXPORT_COLUMN_ORDER.add(ServiceColumns.PREVIOUS_NET_METER_KVAH_READING); // 11 102
		EXPORT_COLUMN_ORDER.add(ServiceColumns.PRESENT_KWH_READING); // 11 113
		EXPORT_COLUMN_ORDER.add(ServiceColumns.PRESENT_KVAH_READING); // 11 124
		EXPORT_COLUMN_ORDER.add(ServiceColumns.PRESENT_LT_METER_READING); // 11 135
		EXPORT_COLUMN_ORDER.add(ServiceColumns.PRESENT_NET_METER_KWH_READING); // 11 146
		EXPORT_COLUMN_ORDER.add(ServiceColumns.PRESENT_NET_METER_KVAH_READING); // 11 157
		EXPORT_COLUMN_ORDER.add(ServiceColumns.PRESENT_RECORDED_MAXIMUM_DEMAND); // 7 168
		EXPORT_COLUMN_ORDER.add(ServiceColumns.PRESENT_READING_DATE); // 10 175
		EXPORT_COLUMN_ORDER.add(ServiceColumns.PRESENT_STATUS); // 2 185
		EXPORT_COLUMN_ORDER.add(ServiceColumns.PRESENT_LT_METER_STATUS); // 2 187
		EXPORT_COLUMN_ORDER.add(ServiceColumns.INITIAL_KWH_READING); // 5 189
		EXPORT_COLUMN_ORDER.add(ServiceColumns.FINAL_KWH_READING); // 11 194
		EXPORT_COLUMN_ORDER.add(ServiceColumns.INITIAL_KVAH_READING); // 5 205
		EXPORT_COLUMN_ORDER.add(ServiceColumns.FINAL_KVAH_READING); // 11 210
		EXPORT_COLUMN_ORDER.add(ServiceColumns.INITIAL_LT_KWH_READING); // 5 221
		EXPORT_COLUMN_ORDER.add(ServiceColumns.FINAL_LT_KWH_READING); // 11 226
		EXPORT_COLUMN_ORDER.add(ServiceColumns.INITIAL_SOLAR_NET_KWH_READING); // 5 237
		EXPORT_COLUMN_ORDER.add(ServiceColumns.FINAL_SOLAR_NET_KWH_READING); // 11 242
		EXPORT_COLUMN_ORDER.add(ServiceColumns.INITIAL_SOLAR_NET_KVAH_READING); // 5 253
		EXPORT_COLUMN_ORDER.add(ServiceColumns.FINAL_SOLAR_NET_KVAH_READING); // 11 258
		EXPORT_COLUMN_ORDER.add(ServiceColumns.KWH_UNITS); // 6 269
		EXPORT_COLUMN_ORDER.add(ServiceColumns.KVAH_UNITS); // 6 275
		EXPORT_COLUMN_ORDER.add(ServiceColumns.LT_METER_TOTAL_UNITS); // 6 281
		EXPORT_COLUMN_ORDER.add(ServiceColumns.SOLAR_NET_METER_KWH_UNITS); // 6 287
		EXPORT_COLUMN_ORDER.add(ServiceColumns.SOLAR_NET_METER_KVAH_UNITS); // 6 293
		EXPORT_COLUMN_ORDER.add(ServiceColumns.SOLAR_NET_METER_CF_UNITS); // 7 299
		EXPORT_COLUMN_ORDER.add(ServiceColumns.TOD_UNITS); // 6 306
		EXPORT_COLUMN_ORDER.add(ServiceColumns.NET_BILLED_UNITS); // 6 312
		EXPORT_COLUMN_ORDER.add(ServiceColumns.AVERAGE_BILLING_UNITS); // 6 318
		EXPORT_COLUMN_ORDER.add(ServiceColumns.POWER_FACTOR); // 4 324
		EXPORT_COLUMN_ORDER.add(ServiceColumns.METER_TYPE); // 1 328
		EXPORT_COLUMN_ORDER.add(ServiceColumns.METER_LOCATION); // 1 329
		EXPORT_COLUMN_ORDER.add(ServiceColumns.ENERGY_CHARGES); // 9 330
		EXPORT_COLUMN_ORDER.add(ServiceColumns.FIXED_CHARGES); // 9 339
		EXPORT_COLUMN_ORDER.add(ServiceColumns.CUSTOMER_CHARGES); // 8 348
		EXPORT_COLUMN_ORDER.add(ServiceColumns.ELECTRICITY_DUTY_CHARGES); // 8 356
		// EXPORT_COLUMN_ORDER.add(ServiceColumns.EXPORT_ADDITIONAL_SUR_CHARGE); // 9
		// 364
		EXPORT_COLUMN_ORDER.add(ServiceColumns.ED_INTEREST); // 8 373
		EXPORT_COLUMN_ORDER.add(ServiceColumns.OTHER_REVENUE); // 8 381
		// EXPORT_COLUMN_ORDER.add(ServiceColumns.OTHER_REVENUE_POLE_RENTAL_CHARGES); //
		// 8 381
		EXPORT_COLUMN_ORDER.add(ServiceColumns.CAPACITOR_SUR_CHARGE); // 8 389
		EXPORT_COLUMN_ORDER.add(ServiceColumns.OTHER_CHARGES1); // 8 397
		EXPORT_COLUMN_ORDER.add(ServiceColumns.OTHER_CHARGES2); // 8 405
		EXPORT_COLUMN_ORDER.add(ServiceColumns.SUBSIDY_AMOUNT); // 8 413
		EXPORT_COLUMN_ORDER.add(ServiceColumns.BILL_AMOUNT); // 9 421
		EXPORT_COLUMN_ORDER.add(ServiceColumns.EC_ADJUSTMENT_AMOUNT); // 9 430
		EXPORT_COLUMN_ORDER.add(ServiceColumns.ED_ADJUSTMENT_AMOUNT); // 8 439
		// EXPORT_COLUMN_ORDER.add(ServiceColumns.EXPORT_OLD_ARREARS); // 11 447
		// EXPORT_COLUMN_ORDER.add(ServiceColumns.EXPORT_NEW_ARREARS); // 11 458
		EXPORT_COLUMN_ORDER.add(ServiceColumns.ROUNDING_AMOUNT); // 5 469
		EXPORT_COLUMN_ORDER.add(ServiceColumns.NET_TOTAL_AMOUNT); // 11 474
		EXPORT_COLUMN_ORDER.add(ServiceColumns.DUE_DATE); // 10 485
		EXPORT_COLUMN_ORDER.add(ServiceColumns.DISCONNECTION_DATE); // 10 495
		EXPORT_COLUMN_ORDER.add(ServiceColumns.PROVISIONAL_CC_AMOUNT); // 9 505
		EXPORT_COLUMN_ORDER.add(ServiceColumns.PROVISIONAL_ED_AMOUNT); // 8 514
		EXPORT_COLUMN_ORDER.add(ServiceColumns.ACD_AMOUNT); // 9 522
		EXPORT_COLUMN_ORDER.add(ServiceColumns.BILLING_DAYS); // 4 531
		EXPORT_COLUMN_ORDER.add(ServiceColumns.IRDA_FLAG); // 1 535
		EXPORT_COLUMN_ORDER.add(ServiceColumns.DATA_FLAG); // 3 536
		EXPORT_COLUMN_ORDER.add(ServiceColumns.PREVIOUS_STATUS); // 2 539
		EXPORT_COLUMN_ORDER.add(ServiceColumns.IRDA_METER_MANUFACTURER_ID); // 16 541
		EXPORT_COLUMN_ORDER.add(ServiceColumns.SBM_ID); // 11 557
		EXPORT_COLUMN_ORDER.add(ServiceColumns.SIM_NUMBER); // 20 568
		EXPORT_COLUMN_ORDER.add(ServiceColumns.MOBILE_NUMBER); // 10 588
		EXPORT_COLUMN_ORDER.add(ServiceColumns.AADHAR_NUMBER); // 12 598
		EXPORT_COLUMN_ORDER.add(ServiceColumns.VERSION); // 4 610
		EXPORT_COLUMN_ORDER.add(ServiceColumns.BILL_NUMBER); // 6 614
		EXPORT_COLUMN_ORDER.add(ServiceColumns.TIME_STAMP); // 5 620
		EXPORT_COLUMN_ORDER.add(ServiceColumns.LATITUDE); // 9 625
		EXPORT_COLUMN_ORDER.add(ServiceColumns.LONGITUDE); // 9 634
		EXPORT_COLUMN_ORDER.add(ServiceColumns.DOOR_NUMBER); // 20 643
		EXPORT_COLUMN_ORDER.add(ServiceColumns.ACD_SUR_CHARGE); // 10 663
		EXPORT_COLUMN_ORDER.add(ServiceColumns.METER_PHASE); // 1 673
		EXPORT_COLUMN_ORDER.add(ServiceColumns.OTHER_CHARGES3); // 8 674
		EXPORT_COLUMN_ORDER.add(ServiceColumns.TCS_AMOUNT); // 9 682
		EXPORT_COLUMN_ORDER.add(ServiceColumns.GOVT_SUBSIDY); // 11 691
		EXPORT_COLUMN_ORDER.add(ServiceColumns.CONSUMER_PAYABLE); // 11 702
		EXPORT_COLUMN_ORDER.add(ServiceColumns.SHORTFALL_AMOUNT); // 10 713
		EXPORT_COLUMN_ORDER.add(ServiceColumns.COMPANY_FLAG); // 1 723
		EXPORT_COLUMN_ORDER.add(ServiceColumns.REMARKS4); // 10 713
		EXPORT_COLUMN_ORDER.add(ServiceColumns.METERDATA_INSTANTANEOUS_VOLTAGE_R);
		EXPORT_COLUMN_ORDER.add(ServiceColumns.METERDATA_INSTANTANEOUS_VOLTAGE_Y);
		EXPORT_COLUMN_ORDER.add(ServiceColumns.METERDATA_INSTANTANEOUS_VOLTAGE_B);
		EXPORT_COLUMN_ORDER.add(ServiceColumns.METERDATA_INSTANTANEOUS_CURRENT_R);
		EXPORT_COLUMN_ORDER.add(ServiceColumns.METERDATA_INSTANTANEOUS_CURRENT_Y);
		EXPORT_COLUMN_ORDER.add(ServiceColumns.METERDATA_INSTANTANEOUS_CURRENT_B);
		EXPORT_COLUMN_ORDER.add(ServiceColumns.METERDATA_PHASE);
		EXPORT_COLUMN_ORDER.add(ServiceColumns.METERDATA_MULTIPLYING_FACTOR);
		EXPORT_COLUMN_ORDER.add(ServiceColumns.METERDATA_MANUFACTURER_ID);

		//
		//
		// Export Column order V2
		// Length: 689
		// ---------------------------------------------------------------------
		EXPORT_COLUMN_ORDER_V2.addAll(EXPORT_COLUMN_ORDER);

		//
		//
		// Export Column order V2
		// Length: 739
		// ---------------------------------------------------------------------
		EXPORT_COLUMN_ORDER_V3.addAll(EXPORT_COLUMN_ORDER_V2);
		EXPORT_COLUMN_ORDER_V3.add(ServiceColumns.METERDATA_RMD_MONTH2);
		EXPORT_COLUMN_ORDER_V3.add(ServiceColumns.METERDATA_RMD_MONTH3);
		EXPORT_COLUMN_ORDER_V3.add(ServiceColumns.METERDATA_RMD_MONTH4);
		EXPORT_COLUMN_ORDER_V3.add(ServiceColumns.METERDATA_RMD_MONTH5);
		EXPORT_COLUMN_ORDER_V3.add(ServiceColumns.METERDATA_RMD_MONTH6);

		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.ERO_NAME);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.SERVICE_NUMBER);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.USC_NUMBER);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.ERO_CODE);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.SUB_DIVISION_CODE);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.SECTION_CODE);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.AREA_CODE);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METER_NUMBER);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.EXTRA_COL2);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.PREVIOUS_READING_DATE);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.PREVIOUS_KWH_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.PREVIOUS_KVAH_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.PREVIOUS_LT_METER_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.PREVIOUS_NET_METER_KWH_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.PREVIOUS_NET_METER_KVAH_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.PRESENT_KWH_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.PRESENT_KVAH_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.ADDITIONAL_ED_INTEREST);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.PRESENT_LT_METER_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.PRESENT_NET_METER_KWH_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.PRESENT_NET_METER_KVAH_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.PRESENT_RECORDED_MAXIMUM_DEMAND);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.PRESENT_READING_DATE);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.PRESENT_STATUS);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.PRESENT_LT_METER_STATUS);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.INITIAL_KWH_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.FINAL_KWH_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.INITIAL_KVAH_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.FINAL_KVAH_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.INITIAL_LT_KWH_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.FINAL_LT_KWH_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.INITIAL_SOLAR_NET_KWH_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.FINAL_SOLAR_NET_KWH_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.INITIAL_SOLAR_NET_KVAH_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.FINAL_SOLAR_NET_KVAH_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.KWH_UNITS);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.KVAH_UNITS);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.NET_BILLED_UNITS);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.LT_METER_TOTAL_UNITS);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.SOLAR_NET_METER_KWH_UNITS);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.SOLAR_METER_FLAG);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.SOLAR_KWH_METER_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.SOLAR_KVAH_METER_READING);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.SOLAR_NET_METER_KVAH_UNITS);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.SOLAR_NET_METER_PRESENT_CF_UNITS);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.TOD_UNITS);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.TOD1_UNITS);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.TOD2_UNITS);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.TOD3_UNITS);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.AVERAGE_BILLING_UNITS);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.POWER_FACTOR);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METER_TYPE);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METER_LOCATION);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.ENERGY_CHARGES);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.FIXED_CHARGES);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.CUSTOMER_CHARGES);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.ELECTRICITY_DUTY_CHARGES);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.ADDITIONAL_SUR_CHARGE);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.ED_INTEREST);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.OTHER_REVENUE);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.TRI_VECTOR_METER_FLAG);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.CAPACITOR_SUR_CHARGE);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.OTHER_CHARGES1);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.OTHER_CHARGES2);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.SUBSIDY_AMOUNT);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.SUBSIDY_FLAG);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.BILL_AMOUNT);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.EC_ADJUSTMENT_AMOUNT);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.ED_ADJUSTMENT_AMOUNT);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.OLD_ARREARS);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.NEW_ARREARS);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.ROUNDING_AMOUNT);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.NET_TOTAL_AMOUNT);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.DUE_DATE);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.DISCONNECTION_DATE);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.PROVISIONAL_CC_AMOUNT);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.PROVISIONAL_ED_AMOUNT);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.ACD_AMOUNT);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.BILLING_DAYS);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.IRDA_FLAG);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.DATA_FLAG);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.PREVIOUS_STATUS);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.IRDA_METER_MANUFACTURER_ID);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.SBM_ID);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.SIM_NUMBER);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.MOBILE_NUMBER);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.AADHAR_NUMBER);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.BILL_MAX_UNITS);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.SD_REVIEW);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.SD_AVAILABLE);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.ACD_FLAG);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.FSA_AMOUNT);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.VERSION);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.CYCLE);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.BILL_NUMBER);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.TIME_STAMP);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.LATITUDE);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.LONGITUDE);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.DOOR_NUMBER);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.ACD_SUR_CHARGE);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METER_PHASE);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.OTHER_CHARGES3);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.TCS_AMOUNT);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.GOVT_SUBSIDY);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.CONSUMER_PAYABLE);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.REMARKS4_AMOUNT);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.REMARKS4);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.COMPANY_FLAG);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.CONTRACTED_LOAD);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.CONNECTED_LOAD);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.CATEGORY);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.SUB_CATEGORY);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METERDATA_INSTANTANEOUS_VOLTAGE_R);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METERDATA_INSTANTANEOUS_VOLTAGE_Y);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METERDATA_INSTANTANEOUS_VOLTAGE_B);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METERDATA_INSTANTANEOUS_CURRENT_R);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METERDATA_INSTANTANEOUS_CURRENT_Y);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METERDATA_INSTANTANEOUS_CURRENT_B);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METERDATA_PHASE);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METERDATA_MULTIPLYING_FACTOR);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METERDATA_MANUFACTURER_ID);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METERDATA_METER_SERIAL_NO);

		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METERDATA_PRESENT_CUMULATIVE_ENERGY);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METERDATA_PRESENT_CUMULATIVE_ENERGY_KVAH);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METERDATA_PRESENT_RMD);

		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METERDATA_RMD_MONTH2);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METERDATA_RMD_MONTH3);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METERDATA_RMD_MONTH4);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METERDATA_RMD_MONTH5);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.METERDATA_RMD_MONTH6);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.RATION_CARD_NUMBER);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.AADHAR_FURNISHED_FLAG);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.RATION_CARD_FURNISHED_FLAG);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.MOBILE_NUMBER_FURNISHED_FLAG);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.APPLICATION_FURNISHED_FLAG);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.APPLICATION_NUMBER);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.GJ_APPROVED_FLAG);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.GJ_SUBSIDY_AMOUNT);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.EBILLY_VERSION);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.CATEGORY_CONFIRMATION_FLAG);
		PUSH_PULL_COLUMN_ORDER.add(ServiceColumns.MATS_AMOUNT);
	}

	// Field Lenght map, in the order of IMPORT_COLUMN_ORDER
	// key=index of field, Value=Lenght, in characters, of field.
	public static Map<String, FormatProps> FL_MAP = new LinkedHashMap<String, FormatProps>();

	public static Map<String, FormatProps> HEADER_FL_MAP = new LinkedHashMap<String, FormatProps>();
	static {
		HEADER_FL_MAP.put(ServiceColumns.ERO_CODE, new FormatProps(5, "", ""));
		HEADER_FL_MAP.put(ServiceColumns.ERO_NAME, new FormatProps(15, "", ""));
		HEADER_FL_MAP.put(ServiceColumns.ERO_PHONE, new FormatProps(15, "", ""));
		HEADER_FL_MAP.put(ServiceColumns.FYEAR1, new FormatProps(2, "", ""));
		HEADER_FL_MAP.put(ServiceColumns.FYEAR2, new FormatProps(2, "", ""));
		HEADER_FL_MAP.put(ServiceColumns.SECTION_NAME, new FormatProps(15, "", ""));
		// HEADER_FL_MAP.put(ServiceColumns.READER_NAME, new FormatProps(15,"",""));
		HEADER_FL_MAP.put(ServiceColumns.CIN, new FormatProps(20, "", ""));
		HEADER_FL_MAP.put(ServiceColumns.DATA_FLAG, new FormatProps(3, "", ""));
		HEADER_FL_MAP.put(ServiceColumns.FSA_MSG1, new FormatProps(12, "", ""));
		HEADER_FL_MAP.put(ServiceColumns.FSA_MSG2, new FormatProps(12, "", ""));
		HEADER_FL_MAP.put(ServiceColumns.FSA_MSG3, new FormatProps(12, "", ""));
		HEADER_FL_MAP.put(ServiceColumns.FILE_NAME, new FormatProps(20, "", ""));
		HEADER_FL_MAP.put(ServiceColumns.AAO_PHONE, new FormatProps(20, "", ""));
		HEADER_FL_MAP.put(ServiceColumns.AE_PHONE, new FormatProps(20, "", ""));

	}
	static {
		// FL_MAP.put(ServiceColumns.CIRCLE_NAME, new FormatProps(10,"",""));
		// FL_MAP.put(ServiceColumns.BILL_NUMBER, new FormatProps(5,"",""));
		// FL_MAP.put(ServiceColumns.ERO_NAME, new FormatProps(10,"",""));
		FL_MAP.put(ServiceColumns.SECTION_NAME, new FormatProps(15, "", ""));
		// FL_MAP.put(ServiceColumns.DIST_OR_ZONE_NAME, new FormatProps(10,"",""));
		// FL_MAP.put(ServiceColumns.DIST_OR_AREA_CODE, new FormatProps(6,"","")); //45
		FL_MAP.put(ServiceColumns.SERVICE_NUMBER, new FormatProps(13, "", ""));
		FL_MAP.put(ServiceColumns.AREA_CODE, new FormatProps(5, "", ""));
		FL_MAP.put(ServiceColumns.ERO_CODE, new FormatProps(5, "", ""));
		FL_MAP.put(ServiceColumns.NAME, new FormatProps(30, "", ""));
		FL_MAP.put(ServiceColumns.ADDRESS1, new FormatProps(20, "", ""));
		FL_MAP.put(ServiceColumns.ADDRESS2, new FormatProps(20, "", ""));
		FL_MAP.put(ServiceColumns.ADDRESS3, new FormatProps(20, "", ""));
		FL_MAP.put(ServiceColumns.CATEGORY, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.SUB_CATEGORY, new FormatProps(2, "", ""));
		FL_MAP.put(ServiceColumns.SUB_DIVISION_CODE, new FormatProps(2, "", ""));
		FL_MAP.put(ServiceColumns.SECTION_CODE, new FormatProps(5, "", ""));
		FL_MAP.put(ServiceColumns.GROUP_CODE, new FormatProps(2, "", ""));

		FL_MAP.put(ServiceColumns.CONTRACTED_LOAD, new FormatProps(6, "", "[F:7,2][L]"));
		FL_MAP.put(ServiceColumns.CONNECTED_LOAD, new FormatProps(6, "", "[F:7,2][L]"));
		FL_MAP.put(ServiceColumns.LT_METER_LOAD, new FormatProps(6, "", "[F:7,2][L]"));
		FL_MAP.put(ServiceColumns.METER_NUMBER, new FormatProps(8, "", ""));
		FL_MAP.put(ServiceColumns.METER_PHASE, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.MULTIPLICATION_FACTOR, new FormatProps(6, "", ""));
		FL_MAP.put(ServiceColumns.PREVIOUS_KWH_READING, new FormatProps(11, "", ""));
		FL_MAP.put(ServiceColumns.PREVIOUS_KVAH_READING, new FormatProps(11, "", ""));
		FL_MAP.put(ServiceColumns.PREVIOUS_LT_METER_READING, new FormatProps(11, "", ""));
		FL_MAP.put(ServiceColumns.PREVIOUS_NET_METER_KWH_READING, new FormatProps(11, "", ""));
		FL_MAP.put(ServiceColumns.PREVIOUS_NET_METER_KVAH_READING, new FormatProps(11, "", ""));
		FL_MAP.put(ServiceColumns.PREVIOUS_READING_DATE, new FormatProps(10, "", ""));
		FL_MAP.put(ServiceColumns.PRESENT_KWH_READING, new FormatProps(11, "", ""));
		FL_MAP.put(ServiceColumns.PRESENT_KVAH_READING, new FormatProps(11, "", ""));
		FL_MAP.put(ServiceColumns.PRESENT_LT_METER_READING, new FormatProps(11, "", ""));
		FL_MAP.put(ServiceColumns.PRESENT_NET_METER_KWH_READING, new FormatProps(11, "", ""));
		FL_MAP.put(ServiceColumns.PRESENT_NET_METER_KVAH_READING, new FormatProps(11, "", ""));
		FL_MAP.put(ServiceColumns.PRESENT_RECORDED_MAXIMUM_DEMAND, new FormatProps(7, "", ""));
		FL_MAP.put(ServiceColumns.PRESENT_READING_DATE, new FormatProps(10, "", ""));
		FL_MAP.put(ServiceColumns.PRESENT_STATUS, new FormatProps(2, "", ""));
		FL_MAP.put(ServiceColumns.PRESENT_LT_METER_STATUS, new FormatProps(2, "", ""));
		FL_MAP.put(ServiceColumns.INITIAL_KWH_READING, new FormatProps(5, "", ""));
		FL_MAP.put(ServiceColumns.FINAL_KWH_READING, new FormatProps(11, "", ""));
		FL_MAP.put(ServiceColumns.INITIAL_KVAH_READING, new FormatProps(5, "", ""));
		FL_MAP.put(ServiceColumns.FINAL_KVAH_READING, new FormatProps(11, "", ""));
		FL_MAP.put(ServiceColumns.INITIAL_LT_KWH_READING, new FormatProps(5, "", ""));
		FL_MAP.put(ServiceColumns.FINAL_LT_KWH_READING, new FormatProps(11, "", ""));
		FL_MAP.put(ServiceColumns.INITIAL_SOLAR_NET_KWH_READING, new FormatProps(5, "", ""));
		FL_MAP.put(ServiceColumns.FINAL_SOLAR_NET_KWH_READING, new FormatProps(11, "", ""));
		FL_MAP.put(ServiceColumns.INITIAL_SOLAR_NET_KVAH_READING, new FormatProps(5, "", ""));
		FL_MAP.put(ServiceColumns.FINAL_SOLAR_NET_KVAH_READING, new FormatProps(11, "", ""));
		FL_MAP.put(ServiceColumns.KWH_UNITS, new FormatProps(6, "", ""));
		FL_MAP.put(ServiceColumns.KVAH_UNITS, new FormatProps(6, "", ""));
		FL_MAP.put(ServiceColumns.LT_METER_TOTAL_UNITS, new FormatProps(6, "", ""));
		FL_MAP.put(ServiceColumns.SOLAR_NET_METER_KWH_UNITS, new FormatProps(6, "", ""));
		FL_MAP.put(ServiceColumns.SOLAR_NET_METER_KVAH_UNITS, new FormatProps(6, "", ""));
		FL_MAP.put(ServiceColumns.SOLAR_NET_METER_CF_UNITS, new FormatProps(7, "", ""));
		FL_MAP.put(ServiceColumns.TOD_UNITS, new FormatProps(6, "", ""));
		FL_MAP.put(ServiceColumns.NET_BILLED_UNITS, new FormatProps(6, "", ""));
		FL_MAP.put(ServiceColumns.AVERAGE_BILLING_UNITS, new FormatProps(6, "", ""));
		FL_MAP.put(ServiceColumns.POWER_FACTOR, new FormatProps(4, "", ""));

		FL_MAP.put(ServiceColumns.PREVIOUS_STATUS, new FormatProps(2, "", ""));
		FL_MAP.put(ServiceColumns.LT_METER_PREVIOUS_STATUS, new FormatProps(2, "", ""));
		FL_MAP.put(ServiceColumns.OLD_ARREARS, new FormatProps(10, "", "[F:10,2][L]"));
		// FL_MAP.put(ServiceColumns.EXPORT_OLD_ARREARS, new
		// FormatProps(11,"","[F:10,2][L]"));
		FL_MAP.put(ServiceColumns.NEW_ARREARS, new FormatProps(10, "", "[F:10,2][L]"));
		// FL_MAP.put(ServiceColumns.EXPORT_NEW_ARREARS, new
		// FormatProps(11,"","[F:10,2][L]"));
		FL_MAP.put(ServiceColumns.ROUNDING_AMOUNT, new FormatProps(5, "", "[F:10,2][L]"));
		FL_MAP.put(ServiceColumns.NET_TOTAL_AMOUNT, new FormatProps(11, "", "[F:10,2][L]"));
		FL_MAP.put(ServiceColumns.DUE_DATE, new FormatProps(10, "", ""));
		FL_MAP.put(ServiceColumns.DISCONNECTION_DATE, new FormatProps(10, "", ""));
		FL_MAP.put(ServiceColumns.PROVISIONAL_CC_AMOUNT, new FormatProps(9, "", ""));
		FL_MAP.put(ServiceColumns.PROVISIONAL_ED_AMOUNT, new FormatProps(8, "", ""));
		FL_MAP.put(ServiceColumns.ACD_AMOUNT, new FormatProps(9, "", ""));
		FL_MAP.put(ServiceColumns.BILLING_DAYS, new FormatProps(4, "", ""));

		FL_MAP.put(ServiceColumns.ADDITIONAL_SUR_CHARGE, new FormatProps(8, "", ""));
		// FL_MAP.put(ServiceColumns.EXPORT_ADDITIONAL_SUR_CHARGE, new
		// FormatProps(9,"",""));
		FL_MAP.put(ServiceColumns.ADDITIONAL_ED_INTEREST, new FormatProps(8, "", ""));
		FL_MAP.put(ServiceColumns.PROVISIONAL_AMOUNT, new FormatProps(9, "", ""));
		FL_MAP.put(ServiceColumns.PROVISIONAL_ED_CHARGES, new FormatProps(8, "", ""));
		FL_MAP.put(ServiceColumns.ACD_AMOUNT, new FormatProps(9, "", "[F:9,2]"));
		FL_MAP.put(ServiceColumns.OTHER_REVENUE, new FormatProps(8, "", "[F:9,2]"));
		FL_MAP.put(ServiceColumns.OTHER_CHARGES1, new FormatProps(8, "", "[F:8,2][L]"));
		FL_MAP.put(ServiceColumns.OTHER_CHARGES2, new FormatProps(8, "", "[F:8,2][L]"));
		FL_MAP.put(ServiceColumns.AVERAGE_UNIT, new FormatProps(5, "", "[PAD_CHAR:0][L]"));
		FL_MAP.put(ServiceColumns.METER_MAKE, new FormatProps(15, "", "", FormatUtils.REGEX_ASCII_FILTER));
		FL_MAP.put(ServiceColumns.METER_CAPACITY, new FormatProps(2, "", "[F:5,2]"));
		FL_MAP.put(ServiceColumns.DATE_OF_REPLACEMENT, new FormatProps(10, "", ""));
		FL_MAP.put(ServiceColumns.TC_SEAL_NUMBER, new FormatProps(10, "", ""));
		FL_MAP.put(ServiceColumns.STRUCTURE_CODE, new FormatProps(15, "", ""));
		FL_MAP.put(ServiceColumns.POLE_NUMBER, new FormatProps(15, "", ""));
		FL_MAP.put(ServiceColumns.CYCLE, new FormatProps(2, "", ""));
		FL_MAP.put(ServiceColumns.CT_CONNECTED_POINTS, new FormatProps(3, "", ""));
		FL_MAP.put(ServiceColumns.FORCE_HT_BILL, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.MONTHLY_OR_BI_MONTHLY, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.REMARKS1, new FormatProps(16, "", ""));
		FL_MAP.put(ServiceColumns.LAST_PAID_DATE, new FormatProps(10, "", ""));
		FL_MAP.put(ServiceColumns.LAST_PAID_AMOUNT, new FormatProps(9, "", ""));
		FL_MAP.put(ServiceColumns.CC_ARREARS, new FormatProps(8, "", ""));
		FL_MAP.put(ServiceColumns.INSTALLMENT_DUE_AMOUNT, new FormatProps(8, "", ""));
		FL_MAP.put(ServiceColumns.DWEL_NUMBER, new FormatProps(3, "", ""));
		FL_MAP.put(ServiceColumns.AGREEMENT_AMOUNT, new FormatProps(10, "", ""));
		FL_MAP.put(ServiceColumns.SUBSIDY_FLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.TRI_VECTOR_METER_FLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.CAPACITOR_FLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.CAPACITOR_SUR_CHARGE, new FormatProps(8, "", ""));
		FL_MAP.put(ServiceColumns.EXEMPT_ED_FLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.CUMULATIVE_UNITS, new FormatProps(6, "", ""));
		FL_MAP.put(ServiceColumns.SOLAR_NET_METER_CF_UNITS, new FormatProps(7, "", ""));
		FL_MAP.put(ServiceColumns.CT_CMD, new FormatProps(6, "", ""));
		FL_MAP.put(ServiceColumns.HT_FLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.USC_NUMBER, new FormatProps(16, "", ""));
		FL_MAP.put(ServiceColumns.IRDA_METER_MANUFACTURER_ID, new FormatProps(16, "", ""));
		FL_MAP.put(ServiceColumns.SBM_ID, new FormatProps(11, "", ""));
		FL_MAP.put(ServiceColumns.SIM_NUMBER, new FormatProps(20, "", ""));
		FL_MAP.put(ServiceColumns.MOBILE_NUMBER, new FormatProps(10, "", ""));
		FL_MAP.put(ServiceColumns.AADHAR_NUMBER, new FormatProps(12, "", ""));
		FL_MAP.put(ServiceColumns.RATION_CARD_NUMBER, new FormatProps(12, "", ""));
		FL_MAP.put(ServiceColumns.APPLICATION_NUMBER, new FormatProps(30, "", ""));
		FL_MAP.put(ServiceColumns.IRDA_FLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.DATA_FLAG, new FormatProps(3, "", ""));
		FL_MAP.put(ServiceColumns.SOLAR_METER_FLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.SOLAR_KWH_METER_READING, new FormatProps(11, "", ""));
		FL_MAP.put(ServiceColumns.SOLAR_KVAH_METER_READING, new FormatProps(11, "", ""));
		FL_MAP.put(ServiceColumns.MOBILE_NUMBER_PROMPT_FLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.AADHAR_PROMPT_FLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.METER_TYPE, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.METER_LOCATION, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.METER_POSITION_FLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.AGL1_SCNO, new FormatProps(13, "", ""));
		FL_MAP.put(ServiceColumns.AGL1_ARREARS, new FormatProps(10, "", ""));
		FL_MAP.put(ServiceColumns.AGL2_SCNO, new FormatProps(13, "", ""));
		FL_MAP.put(ServiceColumns.AGL2_ARREARS, new FormatProps(10, "", ""));
		FL_MAP.put(ServiceColumns.DOOR_NUMBER_FLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.AGL1_SCNO, new FormatProps(13, "", ""));
		FL_MAP.put(ServiceColumns.OTHER_CHARGES3, new FormatProps(8, "", ""));
		FL_MAP.put(ServiceColumns.REMARKS2, new FormatProps(16, "", ""));
		FL_MAP.put(ServiceColumns.REMARKS3, new FormatProps(16, "", ""));
		FL_MAP.put(ServiceColumns.REMARKS2_AMOUNT, new FormatProps(8, "", ""));
		FL_MAP.put(ServiceColumns.REMARKS3_AMOUNT, new FormatProps(8, "", ""));
		FL_MAP.put(ServiceColumns.TCS_AMOUNT, new FormatProps(9, "", ""));
		FL_MAP.put(ServiceColumns.GOVT_SUBSIDY, new FormatProps(11, "", ""));
		FL_MAP.put(ServiceColumns.CONSUMER_PAYABLE, new FormatProps(11, "", ""));
		FL_MAP.put(ServiceColumns.SHORTFALL_AMOUNT, new FormatProps(10, "", ""));
		FL_MAP.put(ServiceColumns.COMPANY_FLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.REMARKS4, new FormatProps(14, "", ""));
		;
		FL_MAP.put(ServiceColumns.REMARKS4_AMOUNT, new FormatProps(10, "", ""));
		;
		FL_MAP.put(ServiceColumns.BILL_MAX_UNITS, new FormatProps(6, "", "[L]"));
		FL_MAP.put(ServiceColumns.SD_REVIEW, new FormatProps(10, "", "[L]"));
		FL_MAP.put(ServiceColumns.SD_AVAILABLE, new FormatProps(10, "", "[L]"));
		FL_MAP.put(ServiceColumns.ACD_FLAG, new FormatProps(1, "", "[L]"));
		FL_MAP.put(ServiceColumns.FSA_AMOUNT, new FormatProps(9, "", "[L]"));
		FL_MAP.put(ServiceColumns.FIELD_OFFICER_CODE, new FormatProps(10, "", "[L]"));
		FL_MAP.put(ServiceColumns.FIELD_OFFICER_PHONE, new FormatProps(10, "", "[L]"));
		FL_MAP.put(ServiceColumns.VERSION, new FormatProps(4, "", "[L]"));
		FL_MAP.put(ServiceColumns.MATS_AMOUNT, new FormatProps(10, "", "[L]"));
		// FL_MAP.put(ServiceColumns.TC_SEAL_NO, new FormatProps(7,"",""));

		FL_MAP.put(ServiceColumns.OLD_MTR_STATUS, new FormatProps(2, "", ""));
		FL_MAP.put(ServiceColumns.OLD_MTR_READING, new FormatProps(10, "", "[L][F:10,2]"));
		FL_MAP.put(ServiceColumns.OLD_METER_READING_KVAH, new FormatProps(10, "", "[L][F:10,2]"));
		FL_MAP.put(ServiceColumns.OLD_MTR_DATE, new FormatProps(8, "", ""));
		FL_MAP.put(ServiceColumns.OLD_AVERAGE, new FormatProps(5, "", ""));
		// FL_MAP.put(ServiceColumns.OLD_ARREARS, new FormatProps(10,"","[F:10,2]"));
		// FL_MAP.put(ServiceColumns.NEW_ARREARS, new FormatProps(10,"","[F:10,2]"));
		// FL_MAP.put(ServiceColumns.FSA, new FormatProps(9,"","[F:9,2]"));
		// FL_MAP.put(ServiceColumns.ASURCHG, new FormatProps(9,"","[F:9,2]"));
		// FL_MAP.put(ServiceColumns.ED_INTEREST, new FormatProps(9,"","[F:9,2]"));
		FL_MAP.put(ServiceColumns.PAMOUNT, new FormatProps(9, "", "[F:9,2]"));
		FL_MAP.put(ServiceColumns.ACD_DUE_AMOUNT, new FormatProps(9, "", "[F:9,2]"));
		// FL_MAP.put(ServiceColumns.PEDCHG, new FormatProps(9,"","[F:9,2]"));
		// FL_MAP.put(ServiceColumns.LAST_PAYMENT_DATE,new FormatProps(8,"","[D]"));
		FL_MAP.put(ServiceColumns.REMARKS_1, new FormatProps(20, "", ""));
		FL_MAP.put(ServiceColumns.REMARKS_2, new FormatProps(20, "", ""));
		FL_MAP.put(ServiceColumns.CHK_KWH_READING, new FormatProps(7, "", ""));
		FL_MAP.put(ServiceColumns.CHK_KVAH_READING, new FormatProps(7, "", ""));
		FL_MAP.put(ServiceColumns.LAST_MONTH_UNITS, new FormatProps(5, "", ""));
		FL_MAP.put(ServiceColumns.METER_MECH_OR_ELECTR_OR_CT_ELECT, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.OTHER_CHRGES, new FormatProps(9, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.MF, new FormatProps(6, "", "[F:6,2]"));
		FL_MAP.put(ServiceColumns.CUMULATEDUNITS, new FormatProps(5, "", ""));
		FL_MAP.put(ServiceColumns.RAPDRP_POLE_NUMBER_FLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.ADD_OR_SUB_PERCENTAGE, new FormatProps(5, "", "[F:5,2]"));
		// FL_MAP.put(ServiceColumns.RMDMF, new FormatProps(5,"","[F:5,2]"));
		FL_MAP.put(ServiceColumns.SEASSIONAL_FLAG, new FormatProps(1, "", ""));
		// FL_MAP.put(ServiceColumns.CAPACITER_FLAG, new FormatProps(1,"",""));
		FL_MAP.put(ServiceColumns.FIXED_CHARGES, new FormatProps(9, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.AMG_AMOUNT, new FormatProps(9, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.AMT_SUBSIDY, new FormatProps(9, "", "[F:9,2]"));
		FL_MAP.put(ServiceColumns.PER_SUBSIDY, new FormatProps(5, "", "[F:5,2]"));
		FL_MAP.put(ServiceColumns.SD_AMOUNT_AVAILABLE, new FormatProps(9, "", "[F:9,2]"));
		FL_MAP.put(ServiceColumns.EROPHNO, new FormatProps(10, "", ""));
		FL_MAP.put(ServiceColumns.EDFLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.NO_OF_STREET_LIGHT_POINTS, new FormatProps(3, "", "[L]"));
		FL_MAP.put(ServiceColumns.OLD_MTER_UNITS, new FormatProps(5, "", ""));
		FL_MAP.put(ServiceColumns.IRDA_TYPE_FLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.NEW_METER_IR_KWH, new FormatProps(10, "", "[F:10,2]"));
		FL_MAP.put(ServiceColumns.NEW_METER_IR_KVAH, new FormatProps(10, "", "[F:10,2]"));
		FL_MAP.put(ServiceColumns.NEW_METER_FR_KWH, new FormatProps(10, "", "[F:10,2]"));
		FL_MAP.put(ServiceColumns.NEW_METER_FR_KVAH, new FormatProps(10, "", "[F:10,2]"));
		FL_MAP.put(ServiceColumns.CONSUMER_AADHAR_FLAG, new FormatProps(1, "", ""));
		// FL_MAP.put(ServiceColumns.EXPORT_METER_OPN_KWH, new
		// FormatProps(9,"","[F:9,2]"));
		FL_MAP.put(ServiceColumns.TENENT_AADHAR_FLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.COMMERCIAL_TAX_REG_NO_FLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.CONSUMER_PHONE_NO_FLAG, new FormatProps(1, "", ""));
		// FL_MAP.put(ServiceColumns.LAST_PAYMENT, new FormatProps(8,"",""));
		FL_MAP.put(ServiceColumns.OTHERCHRGES1_DES, new FormatProps(4, "", ""));
		FL_MAP.put(ServiceColumns.SCST_FLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.AGL_DEMAND, new FormatProps(8, "", "[F:8,2][L]"));
		// FL_MAP.put(ServiceColumns.OTHER_CHRGES2, new FormatProps(8,"","[F:8,2][L]"));
		// FL_MAP.put(ServiceColumns.OTHER_CHRGES3, new FormatProps(8,"","[F:8,2][L]"));
		FL_MAP.put(ServiceColumns.LAST_PAID_AMOUNT, new FormatProps(9, "", "[F:9,2]"));
		FL_MAP.put(ServiceColumns.OTHERCHRGES2_DES, new FormatProps(9, "", ""));
		FL_MAP.put(ServiceColumns.OTHERCHRGES3_DES, new FormatProps(9, "", ""));
		// FL_MAP.put(ServiceColumns.VERSION, new FormatProps(5,"","[L]"));

		/*
		 * FL_MAP.put(ServiceColumns.PRESENT_METER_READING_KWH, new
		 * FormatProps(10,"","[L][F:10,2]"));
		 * FL_MAP.put(ServiceColumns.PRESENT_METER_READING_KVAH, new
		 * FormatProps(10,"","[L][F:10,2]"));
		 */
		FL_MAP.put(ServiceColumns.PRESENT_METER_READING_KWH, new FormatProps(10, "", "[L][N]"));
		FL_MAP.put(ServiceColumns.PRESENT_METER_READING_KVAH, new FormatProps(10, "", "[L][N]"));
		FL_MAP.put(ServiceColumns.PRESENT_METER_READING_RKWH, new FormatProps(10, "", "[L][F:10,2]"));
		FL_MAP.put(ServiceColumns.PRESENT_METER_READING_RMD, new FormatProps(10, "", "[L][F:10,2]"));
		FL_MAP.put(ServiceColumns.PRESENT_METER_STAUS, new FormatProps(2, "", ""));
		FL_MAP.put(ServiceColumns.PRESENT_READING_DATE, new FormatProps(8, "", "[D]"));
		FL_MAP.put(ServiceColumns.NEW_METER_NUMBER, new FormatProps(10, "", "", FormatUtils.REGEX_ASCII_FILTER));
		FL_MAP.put(ServiceColumns.NEW_TC_SEAL_NUMBER, new FormatProps(7, "", ""));
		FL_MAP.put(ServiceColumns.BOX_SEAL_NUMBER, new FormatProps(7, "", ""));
		FL_MAP.put(ServiceColumns.MD_SEAL_NUMBER, new FormatProps(7, "", ""));
		FL_MAP.put(ServiceColumns.NEW_METER_MAKE, new FormatProps(6, "", ""));
		FL_MAP.put(ServiceColumns.NEW_METER_CAPACITY, new FormatProps(5, "", "[BIE][F:5,2]"));
		FL_MAP.put(ServiceColumns.REMOVED_METER_STATUS, new FormatProps(2, "", ""));
		FL_MAP.put(ServiceColumns.BILLED_UNITS_KWH, new FormatProps(6, "", "[N][PAD_CHAR:0][L]"));
		FL_MAP.put(ServiceColumns.PHASE_DEFECT, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.PERCENTAGE_ERROR, new FormatProps(5, "", "[F:5,2][L]"));
		FL_MAP.put(ServiceColumns.REMOVED_METER_READING_KWH, new FormatProps(10, "", "[F:10,2][L]"));
		FL_MAP.put(ServiceColumns.REMOVED_METER_READING_KVAH, new FormatProps(10, "", "[F:10,2][L]"));
		FL_MAP.put(ServiceColumns.REMOVED_METER_READING_RKWH, new FormatProps(10, "", "[F:10,2][L]"));
		FL_MAP.put(ServiceColumns.REMOVED_METER_READING_RMD, new FormatProps(10, "", "[F:10,2][L]"));
		FL_MAP.put(ServiceColumns.NEW_METER_INITIAL_READING_KWH, new FormatProps(10, "", "[F:10,2][L]"));
		FL_MAP.put(ServiceColumns.NEW_METER_INITIAL_READING_KVAH, new FormatProps(10, "", "[F:10,2][L]"));
		FL_MAP.put(ServiceColumns.NEW_METER_READING_RKVAH, new FormatProps(10, "", "[F:10,2][L]"));
		FL_MAP.put(ServiceColumns.NEW_METER_READING_RMD, new FormatProps(10, "", "[F:10,2][L]"));
		FL_MAP.put(ServiceColumns.NEW_METER_MF, new FormatProps(5, "", "[F:5,2][L]"));
		FL_MAP.put(ServiceColumns.NEW_CT_PRIMERY, new FormatProps(5, "", "[F:5,2][L]"));
		FL_MAP.put(ServiceColumns.NEW_CT_SECONDARY, new FormatProps(5, "", "[F:5,2][L]"));
		FL_MAP.put(ServiceColumns.FLAG_KWH_OR_KVAH, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.RMDMF, new FormatProps(5, "", "[L]"));
		// FL_MAP.put(ServiceColumns.AVERAGE_UNITS, new
		// FormatProps(5,"","[PAD_CHAR:0][L]"));
		FL_MAP.put(ServiceColumns.POWER_FACTOR, new FormatProps(4, "", "[F:4,2]"));
		// FL_MAP.put(ServiceColumns.OLD_ARREARS, new FormatProps(10,"","[F:10,2][L]"));
		// FL_MAP.put(ServiceColumns.NEW_ARREARS, new FormatProps(10,"","[F:10,2][L]"));
		FL_MAP.put(ServiceColumns.ENERGY_CHARGES, new FormatProps(9, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.CUSTOMER_CHARGES, new FormatProps(8, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.ELECTRICITY_DUTY_CHARGES, new FormatProps(8, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.ED, new FormatProps(9, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.FSA, new FormatProps(9, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.ASURCHG, new FormatProps(9, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.ED_INTEREST, new FormatProps(8, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.ADJ_AMOUNT, new FormatProps(9, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.LPF_SURCHARGE, new FormatProps(9, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.CAP_SURCHARGE, new FormatProps(9, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.AMOUNT_SUBSIDY, new FormatProps(9, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.SUBSIDY_AMOUNT, new FormatProps(8, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.BILL_NUMBER, new FormatProps(6, "", ""));
		FL_MAP.put(ServiceColumns.GJ_APPROVED_FLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.BILL_AMOUNT, new FormatProps(9, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.EC_ADJUSTMENT_AMOUNT, new FormatProps(9, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.ED_ADJUSTMENT_AMOUNT, new FormatProps(8, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.PERCENTAGE_SUBSIDY, new FormatProps(5, "", "[F:5,2][L]"));
		FL_MAP.put(ServiceColumns.LOSS_OR_GAIN, new FormatProps(5, "", "[F:5,2][L]"));
		FL_MAP.put(ServiceColumns.BILL_AMOUNT_EXCL_ARREARARS, new FormatProps(10, "", "[F:10,2][L]"));
		FL_MAP.put(ServiceColumns.TOTAL_AMONT_INCL_ARRS, new FormatProps(10, "", "[F:10,2][L]"));
		FL_MAP.put(ServiceColumns.DUE_DATE, new FormatProps(10, "", "[D]"));
		FL_MAP.put(ServiceColumns.CAPACITER_FLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.TIME, new FormatProps(5, "", ""));
		FL_MAP.put(ServiceColumns.TIME_STAMP, new FormatProps(5, "", ""));
		FL_MAP.put(ServiceColumns.LATITUDE, new FormatProps(9, "", ""));
		FL_MAP.put(ServiceColumns.LONGITUDE, new FormatProps(9, "", ""));
		FL_MAP.put(ServiceColumns.DOOR_NUMBER, new FormatProps(20, "", ""));
		FL_MAP.put(ServiceColumns.ACD_SUR_CHARGE, new FormatProps(10, "", ""));

		FL_MAP.put(ServiceColumns.PREVIOUS_METER_READING_KWH, new FormatProps(10, "", "[L]"));
		FL_MAP.put(ServiceColumns.PREVIOUS_METER_READING_KVH, new FormatProps(10, "", "[L]"));
		FL_MAP.put(ServiceColumns.PREVIOUS_METER_STATUS, new FormatProps(2, "", ""));
		// FL_MAP.put(ServiceColumns.PREVIOUS_READING_DT, new FormatProps(8,"",""));
		FL_MAP.put(ServiceColumns.PEDCHG, new FormatProps(9, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.TRANS_RENTAL_CHARGES, new FormatProps(9, "", "[F:9,2][L]"));

		FL_MAP.put(ServiceColumns.BILLED_UNITS_KVAH, new FormatProps(6, "", "[L]"));
		FL_MAP.put(ServiceColumns.CHK_READING_FLAG, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.RAPDRP_POLE_NUMBER, new FormatProps(13, "", "[L][PAD_CHAR:0]"));
		FL_MAP.put(ServiceColumns.CONSUMER_AADHAR_NUMBER, new FormatProps(12, "", "[BIE]"));
		FL_MAP.put(ServiceColumns.EXPORT_METER_OPN_KWH, new FormatProps(9, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.EXPORT_METER_CLS_KWH, new FormatProps(9, "", "[F:9,2][L]"));
		FL_MAP.put(ServiceColumns.TENENT_AADHAR_NO, new FormatProps(12, "", "[BIE]"));
		FL_MAP.put(ServiceColumns.COMMERCIAL_TAX_REG_NO, new FormatProps(20, "", "[BIE]"));
		FL_MAP.put(ServiceColumns.CONSUMER_PHONE_NO, new FormatProps(12, "", "[BIE]"));
		FL_MAP.put(ServiceColumns.MACHINE_SL_NO, new FormatProps(10, "", "[L][PAD_CHAR:0]"));
		FL_MAP.put(ServiceColumns.GROUP_EXPORT, new FormatProps(2, "", ""));
		FL_MAP.put(ServiceColumns.IRDA_FLAG_X, new FormatProps(1, "", ""));

		FL_MAP.put(ServiceColumns.METERDATA_INSTANTANEOUS_VOLTAGE_R, new FormatProps(6, "", "[F:6,2][L]"));
		FL_MAP.put(ServiceColumns.METERDATA_INSTANTANEOUS_VOLTAGE_Y, new FormatProps(6, "", "[F:6,2][L]"));
		FL_MAP.put(ServiceColumns.METERDATA_INSTANTANEOUS_VOLTAGE_B, new FormatProps(6, "", "[F:6,2][L]"));
		FL_MAP.put(ServiceColumns.METERDATA_INSTANTANEOUS_CURRENT_R, new FormatProps(5, "", "[F:5,2][L]"));
		FL_MAP.put(ServiceColumns.METERDATA_INSTANTANEOUS_CURRENT_Y, new FormatProps(5, "", "[F:5,2][L]"));
		FL_MAP.put(ServiceColumns.METERDATA_INSTANTANEOUS_CURRENT_B, new FormatProps(5, "", "[F:5,2][L]"));
		FL_MAP.put(ServiceColumns.METERDATA_PHASE, new FormatProps(1, "", ""));
		FL_MAP.put(ServiceColumns.METERDATA_MULTIPLYING_FACTOR, new FormatProps(5, "", "[F:5,2][L]"));
		FL_MAP.put(ServiceColumns.METERDATA_RMD_MONTH2, new FormatProps(5, "", "[F:5,2][L]"));
		FL_MAP.put(ServiceColumns.METERDATA_RMD_MONTH3, new FormatProps(5, "", "[F:5,2][L]"));
		FL_MAP.put(ServiceColumns.METERDATA_RMD_MONTH4, new FormatProps(5, "", "[F:5,2][L]"));
		FL_MAP.put(ServiceColumns.METERDATA_RMD_MONTH5, new FormatProps(5, "", "[F:5,2][L]"));
		FL_MAP.put(ServiceColumns.METERDATA_RMD_MONTH6, new FormatProps(5, "", "[F:5,2][L]"));

		FL_MAP.put(ServiceColumns.FR_KWH, new FormatProps(10, "", "[F:10,2][L]"));
		FL_MAP.put(ServiceColumns.FR_KVAH, new FormatProps(10, "", "[F:10,2][L]"));
		FL_MAP.put(ServiceColumns.EXPORT_FR_KWH, new FormatProps(10, "", "[F:10,2][L]"));
		FL_MAP.put(ServiceColumns.SMART_METER_RMD, new FormatProps(10, "", "[F:10,2][L]"));
	}

	/* when billing is completed, its ready */
	public static final String C_PUSH_STATE_READY = "READY";
	/* when pushed to cloud, its complete */
	public static final String C_PUSH_STATE_COMPLETE = "COMPLETE";
	/* when service is imported into device, its new */
	public static final String C_PUSH_STATE_NEW = "NEW";

	/* After N unsuccessful push attempts, its ERROR */
	public static final String C_PUSH_STATE_ERROR = "ERROR";

	/* After backup successful, its BACKUP_COMPLETE */
	public static final String C_PUSH_STATE_BACKUP_COMPLETE = "BACKUP_COMPLETE";

	public static final Set<String> PUSH_STATES = new HashSet<>();
	static {
		PUSH_STATES.add(ServiceColumns.C_PUSH_STATE_READY);
		PUSH_STATES.add(ServiceColumns.C_PUSH_STATE_COMPLETE);
		PUSH_STATES.add(ServiceColumns.C_PUSH_STATE_NEW);
		PUSH_STATES.add(ServiceColumns.C_PUSH_STATE_ERROR);
		PUSH_STATES.add(ServiceColumns.C_PUSH_STATE_BACKUP_COMPLETE);
	}

	public static final String C_FIELD_SEPERATOR = ":::";
	public static final String C_RECORD_SEPERATOR = ":#:";

	/**
	 * Replaces C_FIELD_SEPERATOR and C_RECORD_SEPERATOR char sequences with blank
	 * strings.
	 * 
	 * @param valueToEscape
	 * @return
	 */
	public static String escapeDelimiters(String valueToEscape) {
		if (FormatUtils.isEmpty(valueToEscape))
			return valueToEscape;
		return valueToEscape.replaceAll(C_FIELD_SEPERATOR, "").replaceAll(C_RECORD_SEPERATOR, "");
	}

	/**
	 *
	 * @param serializedString
	 * @param pushPullColumnOrder
	 * @return
	 */
	public static List<Map<String, String>> deserializePayload(String serializedString,
			List<String> pushPullColumnOrder) {
		List<Map<String, String>> services = new ArrayList<Map<String, String>>();
		if (serializedString == null || serializedString.trim().equals("")) {
			return services;
		}
		String[] records = parseIntoRecords(serializedString);
		// serializedString.split(ServiceColumns.C_RECORD_SEPERATOR, -1);
		for (String record : records) {
			if (record != null && record.trim().equals("")) {
				continue;
			}
			String[] fields = parseIntoFieldValues(record);
			// record.split(ServiceColumns.C_FIELD_SEPERATOR, -1);
			Map<String, String> m = new HashMap<String, String>();
			int i = 0;
			for (String fieldName : pushPullColumnOrder) {
				m.put(fieldName, fields[i]);
				i++;
			}
			services.add(m);
		}
		return services;
	}

	public static boolean isValidStatus(String status) {
		if (FormatUtils.isEmpty(status))
			return false;
		return PUSH_STATES.contains(status);
	}

	public static String[] parseIntoRecords(String serializedServices) {
		if (FormatUtils.isEmpty(serializedServices))
			return new String[] {};
		return serializedServices.split(ServiceColumns.C_RECORD_SEPERATOR, -1);
	}

	public static String[] parseIntoFieldValues(String serializedServiceRecord) {
		if (FormatUtils.isEmpty(serializedServiceRecord))
			return new String[] {};
		return serializedServiceRecord.split(ServiceColumns.C_FIELD_SEPERATOR, -1);
	}
}