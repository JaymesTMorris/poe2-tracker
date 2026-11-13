package com.jaymesmorris.poe2tracker;

public class ChecklistItem {
	private final int order;
	private String text;
	private boolean completed;

	public ChecklistItem(int order, String text) {
		this.order = order;
		this.text = text;
	}

	public int getOrder() {
		return order;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

}
