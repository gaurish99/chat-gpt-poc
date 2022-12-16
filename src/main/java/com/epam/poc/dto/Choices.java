package com.epam.poc.dto;

public class Choices {

	private String text;
	private float index;
	private String logprobs = null;
	private String finish_reason;

	// Getter Methods

	public String getText() {
		return text;
	}

	public float getIndex() {
		return index;
	}

	public String getLogprobs() {
		return logprobs;
	}

	public String getFinish_reason() {
		return finish_reason;
	}

	// Setter Methods

	public void setText(String text) {
		this.text = text;
	}

	public void setIndex(float index) {
		this.index = index;
	}

	public void setLogprobs(String logprobs) {
		this.logprobs = logprobs;
	}

	public void setFinish_reason(String finish_reason) {
		this.finish_reason = finish_reason;
	}

}
