package com.ivandjoh.multithreading.repository;

import com.ivandjoh.multithreading.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { }
