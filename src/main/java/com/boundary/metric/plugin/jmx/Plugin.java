package com.boundary.metric.plugin.jmx;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

public class Plugin {

	public Plugin() {
	}

	public static void main(String args[]) throws InterruptedException, UnknownHostException {

		while (true) {

			int random = new Random().nextInt(100);
			String hostname = InetAddress.getLocalHost().getHostName();

			System.out.println("JMX_ATTRIBUTE " + random + " " + hostname);
			Thread.sleep(5000);
		}
	}
}
