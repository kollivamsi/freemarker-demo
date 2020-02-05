package com.nexient.freemarkerdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexient.freemarkerdemo.entity.Product;
import com.nexient.freemarkerdemo.service.ProductService;

@RestController
public class ProductController {

  @Autowired
  private ProductService productService;
  
  @GetMapping
  public List<Product> getProducts() {
    return this.productService.getProducts();
  }
}
