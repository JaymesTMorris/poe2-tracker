package com.jaymesmorris.poe2tracker;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import javax.swing.SwingUtilities;

import com.google.gson.Gson;

public class Main {

	public static void main() {
		// Swing isn't thread-safe: all UI work must run on the Event Dispatch Thread.
		SwingUtilities.invokeLater(() -> new TrackerWindow("PoE2 Progress Tracker").show());

		Route route = RouteFactory.createDefaultRoute();

		Gson gson = new Gson();

		try (Writer writer = new FileWriter("route.json")) {
			gson.toJson(route, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
