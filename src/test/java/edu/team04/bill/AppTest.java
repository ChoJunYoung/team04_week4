package edu.team04.bill;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

	static final String GOLD_TYPE = "gold";
	static final String SILVER_TYPE = "silver";

	@Test
	public void testex1True() {
		double total;

		Calculator ex = new Calculator(4, 878, GOLD_TYPE);
		total = ex.calculateTotalRate();

		assertEquals(total, 83.95, 0.05);
	}

	@Test
	public void testex2True() {
		double total;

		Calculator ex = new Calculator(1, 1123, GOLD_TYPE);
		total = ex.calculateTotalRate();

		assertEquals(total, 105.3, 0.05);
	}

	@Test
	public void testex3True() {
		double total;

		Calculator ex = new Calculator(4, 1123, GOLD_TYPE);
		total = ex.calculateTotalRate();

		assertEquals(total, 139.3, 0.05);
	}

	@Test
	public void testex4True() {
		double total;

		Calculator ex = new Calculator(2, 523, SILVER_TYPE);
		total = ex.calculateTotalRate();

		assertEquals(total, 63.87, 0.05);
	}

	@Test
	public void testex5True() {
		double total;

		Calculator ex = new Calculator(5, 44, SILVER_TYPE);
		total = ex.calculateTotalRate();

		assertEquals(total, 82.95, 0.05);
	}

	@Test
	public void testex6True() {
		double total;

		Calculator ex = new Calculator(5, 521, SILVER_TYPE);
		total = ex.calculateTotalRate();

		assertEquals(total, 94.29, 0.05);
	}

	@Test
	public void testex7True() {
		double total;

		Calculator ex = new Calculator(2, 1010, GOLD_TYPE);
		total = ex.calculateTotalRate();

		assertEquals(total, 68.95, 0.05);
	}

	@Test
	public void testex8True() {
		double total;

		Calculator ex = new Calculator(1, 700, GOLD_TYPE);
		total = ex.calculateTotalRate();

		assertEquals(total, 49.95, 0.05);
	}

	@Test
	public void testex9True() {
		double total;

		Calculator ex = new Calculator(2, 521, GOLD_TYPE);
		total = ex.calculateTotalRate();

		assertEquals(total, 64.45, 0.05);
	}

	@Test
	public void testex10True() {
		double total;

		Calculator ex = new Calculator(2, 531, SILVER_TYPE);
		total = ex.calculateTotalRate();

		assertEquals(total, 68.19, 0.05);
	}

	@Test
	public void testex11True() {
		double total;

		Calculator ex = new Calculator(1, 400, SILVER_TYPE);
		total = ex.calculateTotalRate();

		assertEquals(total, 29.95, 0.05);
	}

	@Test
	public void testex12True() {
		double total;

		Calculator ex = new Calculator(3, 400, SILVER_TYPE);
		total = ex.calculateTotalRate();
		assertEquals(total, 72.95, 0.05);
	}

	@Test
	public void testApp() {
		String[] args = { "100", "3", SILVER_TYPE };
		App.main(args);
	}
}
