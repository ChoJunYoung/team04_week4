package edu.team04.bill;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
	@Test
	public void test(){
		double total;
		Calculator c = new Calculator(4,1000, "silver");
		total = c.calculateTotalRate();
	
	}
	
}
