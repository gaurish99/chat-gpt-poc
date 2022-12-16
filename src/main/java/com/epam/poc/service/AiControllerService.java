package com.epam.poc.service;

import com.epam.poc.dto.AiRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface AiControllerService {

	public String consumeAPI(AiRequest aiRequest) throws JsonMappingException, JsonProcessingException;

}
