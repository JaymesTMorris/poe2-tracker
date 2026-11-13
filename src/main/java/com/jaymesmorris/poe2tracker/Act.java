package com.jaymesmorris.poe2tracker;

import java.util.ArrayList;
import java.util.List;

public class Act {
	private final List<ChecklistItem> checklist;
	private final List<RegexEntry> regexList;
	private int numberOfItemsAdded;
	private int numberOfEntriesAdded;

	public Act() {
		checklist = new ArrayList<>();
		regexList = new ArrayList<>();
		numberOfItemsAdded = 0;
		numberOfEntriesAdded = 0;
	}

	public void addChecklistItem(String text) {
		ChecklistItem newItem = new ChecklistItem(numberOfItemsAdded++, text);
		checklist.add(newItem);
	}

	public void addRegexEntry(String name, String pattern) {
		RegexEntry newEntry = new RegexEntry(numberOfEntriesAdded++, name, pattern);
		regexList.add(newEntry);
	}
}
