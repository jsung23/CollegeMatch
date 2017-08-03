package main.java;

import java.util.ArrayList;

/**
 * Represents a school record
 * 
 * @author Geoff
 *
 */
public class School {
	public static final String ID = "school.id";
	public static final String NAME = "school.name";
	public static final String URL = "school.url";
	public static final String ALIAS = "school.alias";
	public static final String SAT_AVG = "school.SAT_avg";
	public static final String SAT_25 = "school.SAT_pct_25_cumulative";
	public static final String SAT_75 = "school.SAT_pct_75_cumulative";
	public static final String SAT_25_RD = "school.SAT_pct_25_reading";
	public static final String SAT_75_RD = "school.SAT_pct_75_reading";
	public static final String SAT_25_MATH = "school.SAT_pct_25_math";
	public static final String SAT_75_MATH = "school.SAT_pct_75_math";
	public static final String SAT_25_WR = "school.SAT_pct_25_writing";
	public static final String SAT_75_WR = "school.SAT_pct_75_writing";
	public static final String SAT_MED_RD = "school.SAT_midpoint_reading";
	public static final String SAT_MED_MATH = "school.SAT_midpoint_math";
	public static final String SAT_MED_WR = "school.SAT_midpoint_writing";
	public static final String ACT_25 = "school.ACT_pct_25_cumulative";
	public static final String ACT_75 = "school.ACT_pct_75_cumulative";
	public static final String ACT_25_ENG = "school.ACT_pct_25_english";
	public static final String ACT_75_ENG = "school.ACT_pct_75_english";
	public static final String ACT_25_MATH = "school.ACT_pct_25_math";
	public static final String ACT_75_MATH = "school.ACT_pct_75_math";
	public static final String ACT_25_WR = "school.ACT_pct_25_writing";
	public static final String ACT_75_WR = "school.ACT_pct_75_writing";
	public static final String ACT_AVG = "school.ACT_avg";
	public static final String ACT_MED_ENG = "school.ACT_midpoint_english";
	public static final String ACT_MED_MATH = "school.ACT_midpoint_math";
	public static final String ACT_MED_WR = "school.ACT_midpoint_writing";
	public static final String AVG_EARN = "school.avg_earnings_6_years_after_matriculation";
	public static final String AVG_COST = "school.avg_cost";
	public static final String CONTROL = "school.control";
	public static final String MED_DEBT = "school.med_debt";
	public static final String STD_BODY_SIZE = "school.std_bdy_sz";
	public static final String PROG_1 = "school.pop_prog_1";
	public static final String PROG_2 = "school.pop_prog_2";
	public static final String PROG_3 = "school.pop_prog_3";
	public static final String PROG_4 = "school.pop_prog_4";
	public static final String PROG_5 = "school.pop_prog_5";
	public static final String ADM_RATE = "school.adm_rate";
	public static final String AVG_FAM_INC = "school.avg_fam_inc";
	public static final String MED_FAM_INC = "school.med_fam_inc";
	public static final String TUITION_OUT = "school.tuition_and_fees_out";
	public static final String TUITION_IN = "school.tuition_and_fees_in";
	public static final String AVG_AGE_ENTRY = "school.avg_entry_age";
	public static final String FIRST_GEN = "school.1_gen_std_share";
	public static final String LEVEL = "school.level";
	public static final String DIST_LEARNING = "school.dist_learning";
	public static final String GENDER_DEM_ID = "school.GenderDemographics_ID";
	public static final String ETHNIC_DEM_ID = "school.EthnicDemographics_ID";
	//school_loc
	public static final String SL_SCHOOL_ID = "school_loc.school_ID";
	public static final String SL_LOC_ID = "school_loc.loc_ID";
	//location
	public static final String L_ID = "location.ID";
	public static final String L_CITY = "location.city";
	public static final String L_STATE_STRING = "location.state_string";
	public static final String L_STATE = "location.state";
	public static final String L_ZIP = "location.ZIP";
	//region
	public static final String R_STATE = "region.state";
	public static final String R_REGION = "region.region_name";
	//gender demographics
	public static final String GD_ID = "genderDemographics.ID";
	public static final String GD_FEMALE = "genderDemographics.female";
	public static final String GD_MALE = "genderDemographics.male";
	//ethnic demographics
	public static final String ED_ID = "ethnicDemographics.ID";
	public static final String ED_WHITE = "ethnicDemographics.white";
	public static final String ED_BLACK = "ethnicDemographics.black";
	public static final String ED_HISPANIC = "ethnicDemographics.hispanic";
	public static final String ED_ASIAN = "ethnicDemographics.asian";
	public static final String ED_AM_IND = "ethnicDemographics.american_indian_alaskan_native";
	public static final String ED_HAW_PAC_ISL = "ethnicDemographics.native_hawaiian_pacific_islander";
	public static final String ED_TWO_OR_MORE = "ethnicDemographics.two_or_more";
	public static final String ED_UNKNOWN = "ethnicDemographics.unknown";
	public static final String ED_NONRES = "ethnicDemographics.nonresident";
	//offers
	public static final String O_SCHOOL = "offers.school_ID";
	public static final String O_FIELD = "offers.field_ID";
	//fields of study
	public static final String FOS_ID = "fieldsOfStudy.ID";
	public static final String FOS_NAME = "fieldsOfStudy.name";
