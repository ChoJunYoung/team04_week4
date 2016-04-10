package edu.team04.bill;

public class SilverPlan implements PlanType {

	private double silverBasicRate = 29.95;
	private int silverIncludedMinute = 500;
	private double silverAdditionalLineRate = 21.50;
	private double silverExcessRate = 0.54;
	private double silverFamilyDiscountRate = 5;

	@Override
	public double getBasicMonthlyRate() {
		return silverBasicRate;
	}

	@Override
	public double getExcessMinuteRate() {
		return silverExcessRate;
	}

	@Override
	public int getIncludedMinute() {
		return silverIncludedMinute;
	}

	@Override
	public double getFamilyDiscountRate() {
		return silverFamilyDiscountRate;
	}

	@Override
	public double getAdditionalLineRate() {
		return silverAdditionalLineRate;
	}
}
