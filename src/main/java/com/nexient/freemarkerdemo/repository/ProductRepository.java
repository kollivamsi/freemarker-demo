package com.nexient.freemarkerdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexient.freemarkerdemo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
