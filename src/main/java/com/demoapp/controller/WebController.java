package com.demoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;

@RestController
public class WebController {
	
	@GetMapping("/unsecured")
	public SimpleMessage unsecuredEndpoint()
	{
		return new SimpleMessage("This is an unsecured endpoint, anyone can access.");
	}
	
	@GetMapping("/secured")
	public SimpleMessage securedEndpoint()
	{
		return new SimpleMessage("This is a secured endpoint, need authentication to access.");
	}
	

	private static class SimpleMessage
	{
		@Getter
		private String message;

		public SimpleMessage(String message) {
			this.message = message;
		}
		
	}
	
}
