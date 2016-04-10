package edu.team04.bill;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

	private GoldPlan tGoldPlan;
	private SilverPlan tSilverPlan;

	@Test
	public void testGoldPlan() {
		tGoldPlan = new GoldPlan();
		assertEquals(1000, tGoldPlan.getIncludedMinute());
		assertEquals(49.95, tGoldPlan.getBasicMonthlyRate(), 0);
		assertEquals(0.45, tGoldPlan.getExcessMinuteRate(), 0);
		assertEquals(14.5, tGoldPlan.getAdditionalLineRate(), 0);
		assertEquals(5, tGoldPlan.getFamilyDiscountRate(), 0);
	}

	@Test
	public void testSilverPlan() {
		tSilverPlan = new SilverPlan();
		assertEquals(29.95, tSilverPlan.getBasicMonthlyRate(), 0);
		assertEquals(500, tSilverPlan.getIncludedMinute(), 0);
		assertEquals(21.50, tSilverPlan.getAdditionalLineRate(), 0);
		assertEquals(0.54, tSilverPlan.getExcessMinuteRate(), 0);
		assertEquals(5, tSilverPlan.getFamilyDiscountRate(), 0);
	}

}
