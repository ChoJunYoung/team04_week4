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
    }
}
