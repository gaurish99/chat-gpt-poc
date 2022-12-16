package com.epam.poc.dto;

public class Usage {
	private float prompt_tokens;
	private float completion_tokens;
	private float total_tokens;

	// Getter Methods

	public float getPrompt_tokens() {
		return prompt_tokens;
	}

	public float getCompletion_tokens() {
		return completion_tokens;
	}

	public float getTotal_tokens() {
		return total_tokens;
	}

	// Setter Methods

	public void setPrompt_tokens(float prompt_tokens) {
		this.prompt_tokens = prompt_tokens;
	}

	public void setCompletion_tokens(float completion_tokens) {
		this.completion_tokens = completion_tokens;
	}

	public void setTotal_tokens(float total_tokens) {
		this.total_tokens = total_tokens;
	}
}