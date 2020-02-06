package com.nexient.freemarkerdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

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
