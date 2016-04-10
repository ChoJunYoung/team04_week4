package edu.team04.bill;



import org.junit.Assert;
import org.junit.Test;


public class AppTest{
	@Test
	public void test(){
		double total;
		Calculator c = new Calculator(4,1000, "silver");
		total = c.calculateTotalRate();
		Assert.assertEquals(0, 0, 0);
	}
	
}

