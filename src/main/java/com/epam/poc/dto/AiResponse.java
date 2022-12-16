package com.epam.poc.dto;

import java.util.ArrayList;

public class AiResponse {
	private String id;
	private String object;
	private float created;
	private String model;
	ArrayList<Choices> choices = new ArrayList<>();
	Usage UsageObject;

	// Getter Methods

	public String getId() {
		return id;
	}

	public String getObject() {
		return object;
	}

	public ArrayList<Choices> getChoices() {
		return choices;
	}

	public void setChoices(ArrayList<Choices> choices) {
		this.choices = choices;
	}

	public float getCreated() {
		return created;
	}

	public String getModel() {
		return model;
	}

	public Usage getUsage() {
		return UsageObject;
	}

	// Setter Methods

	public void setId(String id) {
		this.id = id;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public void setCreated(float created) {
		this.created = created;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setUsage(Usage usageObject) {
		this.UsageObject = usageObject;
	}
}


