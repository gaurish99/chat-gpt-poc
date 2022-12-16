package com.epam.poc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.epam.poc.dto.AiRequest;
import com.epam.poc.dto.AiResponse;
import com.epam.poc.service.AiControllerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@Service
public class AiControllerServiceImpl implements AiControllerService {

	private final RestTemplate restTemplate;

	@Autowired
	public AiControllerServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public String consumeAPI(AiRequest aiRequest) throws JsonMappingException, JsonProcessingException {

		final ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String requestBodyString;
		String response = "";
		try {
			requestBodyString = ow.writeValueAsString(aiRequest);
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.setBearerAuth("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");

			HttpEntity<String> entity = new HttpEntity<>(requestBodyString, headers);

			response = restTemplate.postForObject("https://api.openai.com/v1/completions", entity, String.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		@SuppressWarnings("unused")
		AiResponse aiResponse = new ObjectMapper().readValue(response, AiResponse.class);

		return aiResponse.getChoices().get(0).getText();

	}

}
