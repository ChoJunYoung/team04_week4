package edu.team04.bill;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
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
		Assert.assertE
	}
}
