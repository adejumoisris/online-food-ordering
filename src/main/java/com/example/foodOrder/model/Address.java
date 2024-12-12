package com.example.foodOrder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
@Entity
public class Address  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
