package com.jaymesmorris.poe2tracker;

import javax.swing.SwingUtilities;

public class Main {

	public static void main() {
		// Swing isn't thread-safe: all UI work must run on the Event Dispatch Thread.
		SwingUtilities.invokeLater(() -> new TrackerWindow("PoE2 Progress Tracker").show());
	}

}
