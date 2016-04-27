package edu.team04.bill;

interface PlanType{
	double getBasicMonthlyRate();

	double getExcessMinuteRate();

	int getIncludedMinute();

	double getFamilyDiscountRate();

	double getAdditionalLineRate();
	
}