package com.example.foodOrder.repository;

import com.example.foodOrder.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {

    public Users findByEmail(String username);
}
