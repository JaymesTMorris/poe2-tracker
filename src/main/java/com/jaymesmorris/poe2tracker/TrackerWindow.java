package com.jaymesmorris.poe2tracker;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class TrackerWindow {
	private final JFrame frame = new JFrame();

	public TrackerWindow(String title) {
		frame.setTitle(title);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
	}

	public void show() {
		frame.setVisible(true);
	}

	public void hide() {
		frame.setVisible(false);
	}
}
