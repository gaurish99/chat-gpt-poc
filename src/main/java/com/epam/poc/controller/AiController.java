package com.epam.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.poc.dto.AiRequest;
import com.epam.poc.service.AiControllerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
@RequestMapping("")
public class AiController {

	private final AiControllerService aiControllerService;

	@Autowired
	public AiController(AiControllerService aiControllerService) {
		this.aiControllerService = aiControllerService;
	}
	
	@PostMapping("/generate")
	public String getAnswers(@RequestBody AiRequest aiRequest) throws JsonMappingException, JsonProcessingException
	{
		return aiControllerService.consumeAPI(aiRequest);
		
	}

}
