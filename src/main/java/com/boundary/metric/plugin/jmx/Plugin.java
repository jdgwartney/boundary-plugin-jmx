package com.boundary.metric.plugin.jmx;

import java.util.Random;

public class Plugin {

	public Plugin() {
	}

	public static void main(String args[]) throws InterruptedException {

		while (true) {

			int random = new Random().nextInt(100);

			System.out.println("JMX_ATTRIBUTE " + random + " localhost");
			Thread.sleep(5000);
		}
	}
}
