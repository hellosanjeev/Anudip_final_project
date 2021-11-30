package com.example.onlinebakeryshop.controller;
import javax.servlet.http.HttpSession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.onlinebakeryshop.entity.DataCheckout;
import com.example.onlinebakeryshop.entity.DataUser;
import com.example.onlinebakeryshop.repository.CheckRepository;
import com.example.onlinebakeryshop.repository.ContactRepository;
import com.example.onlinebakeryshop.repository.UserRepository;




@Controller
public class HomeController {
	
	@Autowired
	private UserRepository repo;
	@Autowired
	private CheckRepository check;
	@Autowired
	private ContactRepository con;
	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	
	@GetMapping("/cart")
	public String cart()
	{
		return "cart";
	}
	
	@GetMapping("/cake")
	public String cake()
	{
		return "cake";
	}
	
	@GetMapping("/cupcake")
	public String cupcake()
	{
		return "cupcake";
	}
	
	@GetMapping("/Donut")
	public String nutsandseeds()
	{
		return "Donut";
	}
	
	
	@GetMapping("/checkout")
	public String checkout()
	{
		return "checkout";
	}
	
	@GetMapping("/checkoutnote")
	public String checkoutnote()
	{
		return "checkoutnote";
	}
	
	
	@PostMapping("/register")
	public String register(@ModelAttribute DataUser u, HttpSession session)
	{
		System.out.println(u);
		
		repo.save(u);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/login";
	}
	
	@PostMapping("/checkoutpage")
	public String checkoutpage(@ModelAttribute DataCheckout c, HttpSession session)
	{
		System.out.println(c);
		
		check.save(c);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/checkoutnote";
	}
}
