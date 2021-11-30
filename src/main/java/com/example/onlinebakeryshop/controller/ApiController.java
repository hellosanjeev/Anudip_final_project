package com.example.onlinebakeryshop.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlinebakeryshop.entity.DataUser;
import com.example.onlinebakeryshop.repository.UserRepository;

@RestController
@RequestMapping("/sign")

public class ApiController {
@Autowired
UserRepository ss;
@GetMapping("/users")
public List<DataUser>get(){
return  ss.findAll();
}

   
}
