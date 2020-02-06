package com.nexient.freemarkerdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexient.freemarkerdemo.entity.Product;
import com.nexient.freemarkerdemo.repository.ProductRepository;

@Service
public class ProductService {

  @Autowired
  private ProductRepository productRepository;

  public List<Product> getProducts()
  {
    // TODO Auto-generated method stub
    return productRepository.findAll();
  }
  

}
