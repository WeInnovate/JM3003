package com.jm3003.learn.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jm3003.learn.spring.domain.User;

@Controller
public class UserController {

	@RequestMapping("/show-registration-form")
	public String userRegistrationForm(Model model) {
		User u = new User();
		model.addAttribute("user", u);
		return "user-registration";
	}
	
	@RequestMapping("/register-user")
	public String registerUser(@ModelAttribute("user") User u, Model model) {
		System.out.println(u);
		model.addAttribute("user", u);
		return "user-profile";
	}
	
}
