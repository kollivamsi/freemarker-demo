package com.nexient.freemarkerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TemplateController {

	@GetMapping("/hello/{name}")
	public ModelAndView hello(@PathVariable(value="name") String name) {
		ModelAndView model = new ModelAndView();
		model.addObject("name", name);
		model.setViewName("hello");
		return model;
	}
}
