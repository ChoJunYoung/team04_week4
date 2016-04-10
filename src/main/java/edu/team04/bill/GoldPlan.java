package edu.team04.bill;

public class GoldPlan implements PlanType {

	private double goldBasicRate = 49.95;
	private int goldIncludedMinute = 1000;
	private double goldExcessRate = 0.45;
	private double goldAdditionalLineRate = 14.5;
	private double goldFamilyDiscountRate = 5;

	@Override
	public double getBasicMonthlyRate() {
		return goldBasicRate;
	}

	@Override
	public double getExcessMinuteRate() {
		return goldExcessRate;
	}

	@Override
	public double getAdditionalLineRate() {
		return goldAdditionalLineRate;
	}

	@Override
	public int getIncludedMinute() {
		return goldIncludedMinute;
	}

	@Override
	public double getFamilyDiscountRate() {
		return goldFamilyDiscountRate;
	}
}