package com.nexient.freemarkerdemo.controller;

import com.nexient.freemarkerdemo.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TemplateController {

  @Autowired
  private TemplateService templateService;

  @GetMapping("/hello/{name}")
  public ModelAndView hello(@PathVariable(value = "name") String name)
  {
    return templateService.hello(name);
  }

  @GetMapping("/products")
  public ModelAndView products()
  {
    return templateService.products();
  }
}
