package com.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class ConfigClientController {

	@Value("${my.greeting: default value}")
	private String message;

	public ConfigClientController() {

	}

	@GetMapping("/client")
	public String getConfig() {
		return "my.greeting:" + message;
	}

	@GetMapping("/")
	public String isActive() {
		return "Running";
	}

}
