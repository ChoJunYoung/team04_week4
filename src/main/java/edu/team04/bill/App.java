package edu.team04.bill;

import java.util.logging.Logger;

public class App {

	private static App appinstance;

	private App() {

	}

	public static App getInstance() {
		if (appinstance == null) {
			appinstance = new App();
		}

		return appinstance;
	}

	public static void main(String[] args) {
		Logger log = Logger.getLogger(App.class.getName());
		int min;
		int line;
		String plan;

		min = Integer.parseInt(args[0]);
		line = Integer.parseInt(args[1]);
		plan = args[2];

		Calculator c = new Calculator(min, line, plan);

		double total = c.calculateTotalRate();

		log.info("your total rate is " + total);
	}
}
