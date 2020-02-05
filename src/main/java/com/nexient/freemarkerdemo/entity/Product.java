package com.nexient.freemarkerdemo.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
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

  public Product()
  {
  }

  public Product(int id, String name, String description, BigDecimal price)
  {
    super();
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public BigDecimal getPrice()
  {
    return price;
  }

  public void setPrice(BigDecimal price)
  {
    this.price = price;
  }
  
  
}
