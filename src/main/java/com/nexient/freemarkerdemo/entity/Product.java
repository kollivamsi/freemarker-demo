package com.nexient.freemarkerdemo.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Table(name="PRODUCT")
public class Product {
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int id;
  
  @Column(name="PRODUCT_NAME")
  private String name;
  
  @Column(name="PRODUCT_DESCRIPTION")
  private String description;
  
  @Column(name="PRODUCT_PRICE")
  private BigDecimal price;
  

}
