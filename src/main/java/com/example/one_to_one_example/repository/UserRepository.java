package com.example.one_to_one_example.repository;


import com.example.one_to_one_example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}