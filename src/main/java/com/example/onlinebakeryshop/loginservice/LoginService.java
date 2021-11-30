package com.example.onlinebakeryshop.loginservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinebakeryshop.logindomain.Login;
import com.example.onlinebakeryshop.loginrepository.LoginRepository;



@Service
public class LoginService {
@Autowired
private LoginRepository repo;
  
  public Login login(String username, String password) {
  Login user = repo.findByEmailAndPassword(username, password);
   return user;
  }
 
}
