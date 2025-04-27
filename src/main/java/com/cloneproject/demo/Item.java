package com.cloneproject.demo;

import jakarta.persistence.Id;
import lombok.ToString;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@ToString
public class Item {
  @Id @GeneratedValue( strategy =  GenerationType.IDENTITY)
  public Long id;
  public String title;
  public Integer price;
}
