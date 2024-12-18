package com.example.foodOrder.model;

import com.example.foodOrder.dto.RestaurantDto;
import com.example.foodOrder.enums.USER_ROLE;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  id;
    private String fullName;
    private String email;
    private String password;
    private USER_ROLE role = USER_ROLE.ROLE_CUSTOMER;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private List<Order> orders = new ArrayList<>();
    @ElementCollection
    private List<RestaurantDto> restaurants = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address> addresses = new ArrayList<>();

    public List<Address> getAddresses() {
        return addresses;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<RestaurantDto> getRestaurants() {
        return restaurants;
    }

    public USER_ROLE getRole() {
        return role;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void setRestaurants(List<RestaurantDto> restaurants) {
        this.restaurants = restaurants;
    }

    public void setRole(USER_ROLE role) {
        this.role = role;
    }
}
