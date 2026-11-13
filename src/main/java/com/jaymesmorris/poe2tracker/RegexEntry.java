package com.jaymesmorris.poe2tracker;

public class RegexEntry {
	private final int order;
	private String name;
	private String pattern;

	public RegexEntry(int order, String name, String pattern) {
		this.order = order;
		this.name = name;
		this.pattern = pattern;
	}

	public int getOrder() {
		return this.order;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPattern() {
		return this.pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

}
