package com.nexient.freemarkerdemo.service;

import com.nexient.freemarkerdemo.entity.Product;
import com.nexient.freemarkerdemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
