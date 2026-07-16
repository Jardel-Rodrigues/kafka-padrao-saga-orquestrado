package com.br.softstream.product_validation_service.utils;

import org.springframework.stereotype.Component;

import com.br.softstream.product_validation_service.dto.EventDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@AllArgsConstructor
public class JsonUtil {
	
	private final ObjectMapper objectMapper;
	
	public String toJson(Object object) {
		try {
			return objectMapper.writeValueAsString(object);
		} catch (Exception e) {
			return e.getMessage();
		}
	}


	public EventDTO toEvent(String json) {
		try {
			return objectMapper.readValue(json, EventDTO.class);
		} catch (Exception e) {
			return null;
		}
	}

}
