package com.epam.poc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AiRequest {

	@JsonProperty("model")
	String aiModel;

	@JsonProperty("prompt")
	String query;

	@JsonProperty("max_tokens")
	int textLength;

	public String getAiModel() {
		return aiModel;
	}

	public void setAiModel(String aiModel) {
		this.aiModel = aiModel;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public int getTextLength() {
		return textLength;
	}

	public void setTextLength(int textLength) {
		this.textLength = textLength;
	}

	@Override
	public String toString() {
		return "AiRequest [aiModel=" + aiModel + ", query=" + query + ", textLength=" + textLength + "]";
	}

}
