package com.example.onlinebakeryshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinebakeryshop.entity.DataContact;

public interface ContactRepository<ContactData> extends JpaRepository<DataContact, Integer>{

}
