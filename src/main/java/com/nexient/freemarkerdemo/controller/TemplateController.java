package com.nexient.freemarkerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController {

	@GetMapping("/template")
	public String ping() {
		return "OK";
	}
}
