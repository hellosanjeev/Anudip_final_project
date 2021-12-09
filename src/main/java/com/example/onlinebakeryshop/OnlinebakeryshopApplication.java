package com.example.onlinebakeryshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlinebakeryshopApplication {
	

	public static void main(String[] args) {
		try{
		SpringApplication.run(OnlinebakeryshopApplication.class, args);
		}
		catch(Exception e){
		  System.out.println("Port 8080 is in use...");
		  System.out.println(e);
		}
		finally{
		 System.out.println("If you encounter any problem is occur in application contact to admin or developer ");
		}
		
	}

}
