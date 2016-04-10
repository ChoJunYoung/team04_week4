package edu.team04.bill;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	private GoldPlan tGoldPlan;
    
	@Test
    public void testGoldPlan() {
    	tGoldPlan = new GoldPlan();
    	Assert.assertEquals(1000, tGoldPlan.getIncludedMinute());
    	Assert.assertEquals(49.95, tGoldPlan.getBasicMonthlyRate(), 0);
    	Assert.assertEquals(0.45, tGoldPlan.getExcessMinuteRate(), 0);
    	Assert.assertEquals(14.5, tGoldPlan.getAdditionalLineRate(), 0);
    	Assert.assertEquals(5, tGoldPlan.getFamilyDiscountRate(), 0);
    }
}
