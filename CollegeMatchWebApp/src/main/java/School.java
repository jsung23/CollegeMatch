package main.java;

import java.util.ArrayList;

/**
 * Represents a school record
 * 
 * @author Geoff
 *
 */
public class School {
	private int ID;
	private String name;
	private String website;
	private Location location;
	private double admissionRate;
	private int avgCost;
	private double sat25;
	private double sat75;
	private double satAvg;
	private double act25;
	private double act75;
	private double actAvg;
	private int avgEarnings;
	private int stdBodySz;
	private int popProg1ID;
	private int popProg2ID;
	private int popProg3ID;
	private int popProg4ID;
	private int popProg5ID;
	private String popProg1;
	private String popProg2;
	private String popProg3;
	private String popProg4;
	private String popProg5;
	private int tuitionIn;
	private int tuitionOut;
	private double medDebt;
	private int avgFamIncome;
	private int medFamIncome;
	private int avgAge;
	private double firstGenStudentShare;
	private boolean distanceLearning;
	private double maleShare;
	private double femaleShare;
	private String levelString;
	private double white;
	private double black;
	private double hispanic;
	private double asian;
	private double american_indian_alaskan_native;
	private double multiethnic;
	private double unknown_ethnicity;
	private double nonresident;
	private double native_hawaiian_pacific_islander;
	
	/*
	 * returns distance learning boolean
	 */
	public boolean isDistanceLearning() {
		return distanceLearning;
	}
	public void setDistanceLearning(boolean distanceLearning) {
		this.distanceLearning = distanceLearning;
	}
	/*
	 * returns level
	 */
	public String getLevelString() {
		return levelString;
	}
	public void setLevelString(String levelString) {
		this.levelString = levelString;
	}
	/*
	 * return the ID
	 */
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}
	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}
	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}
	/**
	 * @return the admissionRate
	 */
	public double getAdmissionRate() {
		return admissionRate;
	}
	/**
	 * @param admissionRate the admissionRate to set
	 */
	public void setAdmissionRate(double admissionRate) {
		this.admissionRate = admissionRate;
	}
	/**
	 * @return the avgCost
	 */
	public int getAvgCost() {
		return avgCost;
	}
	/**
	 * @param avgCost the avgCost to set
	 */
	public void setAvgCost(int avgCost) {
		this.avgCost = avgCost;
	}
	/**
	 * @return the sat25
	 */
	public double getSat25() {
		return sat25;
	}
	/**
	 * @param sat25 the sat25 to set
	 */
	public void setSat25(double sat25) {
		this.sat25 = sat25;
	}
	/**
	 * @return the sat75
	 */
	public double getSat75() {
		return sat75;
	}
	/**
	 * @param sat75 the sat75 to set
	 */
	public void setSat75(double sat75) {
		this.sat75 = sat75;
	}
	/**
	 * @return the satAvg
	 */
	public double getSatAvg() {
		return satAvg;
	}
	/**
	 * @param satAvg the satAvg to set
	 */
	public void setSatAvg(double satAvg) {
		this.satAvg = satAvg;
	}
	/**
	 * @return the act25
	 */
	public double getAct25() {
		return act25;
	}
	/**
	 * @param act25 the act25 to set
	 */
	public void setAct25(double act25) {
		this.act25 = act25;
	}
	/**
	 * @return the act75
	 */
	public double getAct75() {
		return act75;
	}
	/**
	 * @param act75 the act75 to set
	 */
	public void setAct75(double act75) {
		this.act75 = act75;
	}
	/**
	 * @return the actAvg
	 */
	public double getActAvg() {
		return actAvg;
	}
	/**
	 * @param actAvg the actAvg to set
	 */
	public void setActAvg(double actAvg) {
		this.actAvg = actAvg;
	}
	/**
	 * @return the avgEarnings
	 */
	public int getAvgEarnings() {
		return avgEarnings;
	}
	/**
	 * @param avgEarnings the avgEarnings to set
	 */
	public void setAvgEarnings(int avgEarnings) {
		this.avgEarnings = avgEarnings;
	}
	/**
	 * @return the stdBodySz
	 */
	public int getStdBodySz() {
		return stdBodySz;
	}
	/**
	 * @param stdBodySz the stdBodySz to set
	 */
	public void setStdBodySz(int stdBodySz) {
		this.stdBodySz = stdBodySz;
	}
	/*
	 * getters and setters for popular program IDs
	 */
	public int getPopProg1ID() {
		return popProg1ID;
	}
	public void setPopProg1ID(int popProg1ID) {
		this.popProg1ID = popProg1ID;
	}
	public int getPopProg2ID() {
		return popProg2ID;
	}
	public void setPopProg2ID(int popProg2ID) {
		this.popProg2ID = popProg2ID;
	}
	public int getPopProg3ID() {
		return popProg3ID;
	}
	public void setPopProg3ID(int popProg3ID) {
		this.popProg3ID = popProg3ID;
	}
	public int getPopProg4ID() {
		return popProg4ID;
	}
	public void setPopProg4ID(int popProg4ID) {
		this.popProg4ID = popProg4ID;
	}
	public int getPopProg5ID() {
		return popProg5ID;
	}
	public void setPopProg5ID(int popProg5ID) {
		this.popProg5ID = popProg5ID;
	}
	/**
	 * @return the popProg1
	 */
	public String getPopProg1() {
		return popProg1;
	}
	/**
	 * @param popProg1 the popProg1 to set
	 */
	public void setPopProg1(String popProg1) {
		this.popProg1 = popProg1;
	}
	/**
	 * @return the popProg2
	 */
	public String getPopProg2() {
		return popProg2;
	}
	/**
	 * @param popProg2 the popProg2 to set
	 */
	public void setPopProg2(String popProg2) {
		this.popProg2 = popProg2;
	}
	/**
	 * @return the popProg3
	 */
	public String getPopProg3() {
		return popProg3;
	}
	/**
	 * @param popProg3 the popProg3 to set
	 */
	public void setPopProg3(String popProg3) {
		this.popProg3 = popProg3;
	}
	/**
	 * @return the popProg4
	 */
	public String getPopProg4() {
		return popProg4;
	}
	/**
	 * @param popProg4 the popProg4 to set
	 */
	public void setPopProg4(String popProg4) {
		this.popProg4 = popProg4;
	}
	/**
	 * @return the popProg5
	 */
	public String getPopProg5() {
		return popProg5;
	}
	/**
	 * @param popProg5 the popProg5 to set
	 */
	public void setPopProg5(String popProg5) {
		this.popProg5 = popProg5;
	}
	/**
	 * @return the tuitionIn
	 */
	public int getTuitionIn() {
		return tuitionIn;
	}
	/**
	 * @param tuitionIn the tuitionIn to set
	 */
	public void setTuitionIn(int tuitionIn) {
		this.tuitionIn = tuitionIn;
	}
	/**
	 * @return the tuitionOut
	 */
	public int getTuitionOut() {
		return tuitionOut;
	}
	/**
	 * @param tuitionOut the tuitionOut to set
	 */
	public void setTuitionOut(int tuitionOut) {
		this.tuitionOut = tuitionOut;
	}
	/*
	 * @param debt
	 */
	public void setMedianDebt(double debt) {
		this.medDebt = debt;
	}
	/*
	 * @return medDebt
	 */
	public double getMedianDebt() {
		return this.medDebt;
	}
	/*
	 * @param avgIncome
	 */
	public void setAvgFamilyIncome(int avgIncome) {
		this.avgFamIncome = avgIncome;
	}
	/*
	 * @return avgFamIncome
	 */
	public int getAvgFamilyIncome() {
		return this.avgFamIncome;
	}
	/*
	 * @param medIncome
	 */
	public void setMedianFamIncome(int medIncome) {
		this.medFamIncome = medIncome;
	}
	/*
	 * @return medFamIncome
	 */
	public int getMedianFamIncome(int medIncome) {
		return this.medFamIncome;
	}
	/*
	 * @param avg entry age
	 */
	public void setEntryAge(int age) {
		this.avgAge = age;
	}
	/*
	 * @return avg entry age
	 */
	public int getEntryAge() {
		return this.avgAge;
	}
	/*
	 * @param 1st generation student share of student body
	 */
	public void setFirstGenStudentShare(double firstGen) {
		this.firstGenStudentShare = firstGen;
	}
	/*
	 * @return 1st generation student double
	 */
	public double getFirstGenStudentShare() {
		return this.firstGenStudentShare;
	}
	/*
	 * @param male student share
	 */
	public void setGenderShare(double maleStudentShare, double femaleStudentShare) {
		this.maleShare = maleStudentShare;
		this.femaleShare = femaleStudentShare;
	}
	/*
	 * @return male student share
	 */
	public double getMaleShare() {
		return this.maleShare;
	}
	public double getFemaleShare() {
		return this.femaleShare;
	}
	public double getWhite() {
		return white;
	}
	public void setWhite(double white) {
		this.white = white;
	}
	public double getBlack() {
		return black;
	}
	public void setBlack(double black) {
		this.black = black;
	}
	public double getHispanic() {
		return hispanic;
	}
	public void setHispanic(double hispanic) {
		this.hispanic = hispanic;
	}
	public double getAsian() {
		return asian;
	}
	public void setAsian(double asian) {
		this.asian = asian;
	}
	public double getAmerican_indian_alaskan_native() {
		return american_indian_alaskan_native;
	}
	public void setAmerican_indian_alaskan_native(double american_indian_alaskan_native) {
		this.american_indian_alaskan_native = american_indian_alaskan_native;
	}
	public double getMultiethnic() {
		return multiethnic;
	}
	public void setMultiethnic(double multiethnic) {
		this.multiethnic = multiethnic;
	}
	public double getUnknown_ethnicity() {
		return unknown_ethnicity;
	}
	public void setUnknown_ethnicity(double unknown_ethnicity) {
		this.unknown_ethnicity = unknown_ethnicity;
	}
	public double getNonresident() {
		return nonresident;
	}
	public void setNonresident(double nonresident) {
		this.nonresident = nonresident;
	}
	public double getNative_hawaiian_pacific_islander() {
		return native_hawaiian_pacific_islander;
	}
	public void setNative_hawaiian_pacific_islander(double native_hawaiian_pacific_islander) {
		this.native_hawaiian_pacific_islander = native_hawaiian_pacific_islander;
	}
	
}
