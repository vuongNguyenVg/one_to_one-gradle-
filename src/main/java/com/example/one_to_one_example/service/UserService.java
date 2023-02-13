package com.example.one_to_one_example.service;
import com.example.one_to_one_example.entity.User;

public interface UserService {
   void save(User user);
   User findById(Long id);
}