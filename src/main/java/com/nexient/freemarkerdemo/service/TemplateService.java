package com.nexient.freemarkerdemo.service;

import com.nexient.freemarkerdemo.controller.ProductController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class TemplateService {

  @Autowired 
  private ProductController productController;

  public ModelAndView hello(String name)
  {
    ModelAndView model = new ModelAndView();
    model.addObject("name", name);
    model.setViewName("hello");
    return model;
  }
  
  public ModelAndView products()
  {
    ModelAndView model = new ModelAndView();
    model.addObject("products", productController.getProducts());
    model.setViewName("products");
    return model;
  }
  
}
