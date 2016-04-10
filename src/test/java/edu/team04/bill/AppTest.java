package edu.team04.bill;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

	static final String GOLD_TYPE = "gold";
	static final String SILVER_TYPE = "silver";

	@Test
	public void testEx1True() {
		double total;

		Calculator ex = new Calculator(4, 878, GOLD_TYPE);
		total = ex.calculateTotalRate();

		assertEquals(total, 83.95, 0.05);
	}

	@Test
	public void testEx2True() {
		double total;

		Calculator ex = new Calculator(1, 1123, GOLD_TYPE);
		total = ex.calculateTotalRate();

		assertEquals(total, 105.3, 0.05);
	}

	@Test
	public void testEx3True() {
		double total;

		Calculator ex = new Calculator(4, 1123, GOLD_TYPE);
		total = ex.calculateTotalRate();

		assertEquals(total, 139.3, 0.05);
	}

	@Test
	public void testEx4True() {
		double total;

		Calculator ex = new Calculator(2, 523, SILVER_TYPE);
		total = ex.calculateTotalRate();

		assertEquals(total, 63.87, 0.05);
	}

	@Test
	public void testEx5True() {
		double total;

		Calculator ex = new Calculator(5, 44, SILVER_TYPE);
		total = ex.calculateTotalRate();

		assertEquals(total, 82.95, 0.05);
	}

	@Test
	public void testEx6True() {
		double total;

		Calculator ex = new Calculator(5, 521, SILVER_TYPE);
		total = ex.calculateTotalRate();

		assertEquals(total, 94.29, 0.05);
	}

	@Test
	public void testApp() {
		String[] args = { "100", "3", SILVER_TYPE };
		App.main(args);
	}
}
