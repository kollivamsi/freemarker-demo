package com.nexient.freemarkerdemo.pojo;

import java.math.BigDecimal;

public class Product {
  private Integer id;
  private String name;
  private String description;
  private BigDecimal price;

  public Product()
  {
  }

  public Product(Integer id, String name, String description, BigDecimal price)
  {
    super();
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
  }

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
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
