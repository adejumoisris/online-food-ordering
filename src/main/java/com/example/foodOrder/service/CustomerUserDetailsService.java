package com.example.foodOrder.service;

import com.example.foodOrder.enums.USER_ROLE;
import com.example.foodOrder.model.Users;
import com.example.foodOrder.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user =  userRepository.findByEmail(username);
//        the default is customer
        if(user == null) {
            throw new UsernameNotFoundException("user not found with email"+ username);
        }

//        selecting roles for users

        USER_ROLE role = user.getRole();
    List<GrantedAuthority> authorities = new ArrayList<>();
    authorities.add(new SimpleGrantedAuthority(role.toString()));
    return  new User(user.getEmail(), user.getPassword(), authorities);

    }
}
