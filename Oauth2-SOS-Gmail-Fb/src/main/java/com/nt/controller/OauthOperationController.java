package com.nt.controller;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OauthOperationController {
	
	
	@GetMapping("/home")
	public String showHome() {
		return "Hello , Welcome to Home Page of RedBus.com";
	}
	
	@GetMapping("/after")
	public String afterLoginPage() {
		
		return "Successfully Logged into redbus.com";
	}
	@GetMapping("/user")
	public Authentication showUserDetails(Principal principle) {
		
		System.out.println("logged into details"+principle.getName());
		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
		return auth;
		
	}

}
