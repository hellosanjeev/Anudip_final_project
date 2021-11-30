package com.example.onlinebakeryshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinebakeryshop.entity.DataCheckout;

public interface CheckRepository extends JpaRepository<DataCheckout, Integer> {

}
