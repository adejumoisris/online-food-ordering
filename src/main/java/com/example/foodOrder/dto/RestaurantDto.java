package com.example.foodOrder.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Data
@Embeddable
public class RestaurantDto {

    private String title;
    @Column(length = 1000)
    private List<String> images;
    private String description;

    private Long id;


}
