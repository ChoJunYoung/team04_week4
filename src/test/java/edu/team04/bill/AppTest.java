package edu.team04.bill;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	@Test
	public void testEx1True() {
		double total;

		Calculator Ex = new Calculator(4, 878, "Gold");
		total = Ex.calculateTotalRate();

		assertEquals(total, 83.95, 0.05);
	}

	@Test
	public void testEx2True() {
		double total;

		Calculator Ex = new Calculator(1, 1123, "gold");
		total = Ex.calculateTotalRate();

		assertEquals(total, 105.3, 0.05);
	}

	@Test
	public void testEx3True() {
		double total;

		Calculator Ex = new Calculator(4, 1123, "Gold");
		total = Ex.calculateTotalRate();

		assertEquals(total, 139.3, 0.05);
	}

	@Test
	public void testEx4True() {
		double total;

		Calculator Ex = new Calculator(2, 523, "silver");
		total = Ex.calculateTotalRate();

		assertEquals(total, 63.87, 0.05);
	}

	@Test
	public void testEx5True() {
		double total;

		Calculator Ex = new Calculator(5, 44, "silver");
		total = Ex.calculateTotalRate();

		assertEquals(total, 82.95, 0.05);
	}

	@Test
	public void testEx6True() {
		double total;

		Calculator Ex = new Calculator(5, 521, "silver");
		total = Ex.calculateTotalRate();

		assertEquals(total, 94.29, 0.05);
	}
	
	@Test
	public void testEx7True() {
		double total;

		Calculator Ex = new Calculator(2, 1010, "gold");
		total = Ex.calculateTotalRate();

		assertEquals(total, 68.95, 0.05);	
	}
	
	@Test
	public void testEx8True() {
		double total;

		Calculator Ex = new Calculator(1, 700, "gold");
		total = Ex.calculateTotalRate();

		assertEquals(total, 49.95, 0.05);
	}
	
	@Test
	public void testEx9True() {
		double total;

		Calculator Ex = new Calculator(2, 521, "gold");
		total = Ex.calculateTotalRate();

		assertEquals(total, 64.45, 0.05);
	}
	
	@Test
	public void testEx10True() {
		double total;

		Calculator Ex = new Calculator(2, 531, "silver");
		total = Ex.calculateTotalRate();

		assertEquals(total, 68.19, 0.05);
	}
	
	@Test
	public void testEx11True() {
		double total;

		Calculator Ex = new Calculator(1, 400, "silver");
		total = Ex.calculateTotalRate();

		assertEquals(total, 29.95, 0.05);
	}
	
	@Test
	public void testEx12True() {
		double total;

		Calculator Ex = new Calculator(3, 400, "silver");
		total = Ex.calculateTotalRate();
		assertEquals(total, 72.95, 0.05);
	}
	
	@Test
	public void testApp() {
		String[] args = {"100","3","silver"};
		App.main(args);
	}
}