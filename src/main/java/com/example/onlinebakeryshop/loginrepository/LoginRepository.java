package com.example.onlinebakeryshop.loginrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinebakeryshop.logindomain.Login;

public interface LoginRepository extends JpaRepository<Login, Long>{
	Login findByEmailAndPassword(String email, String password);
}
