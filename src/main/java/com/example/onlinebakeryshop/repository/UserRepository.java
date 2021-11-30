package com.example.onlinebakeryshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinebakeryshop.entity.DataUser;

public interface UserRepository extends JpaRepository<DataUser, Integer>{

}
