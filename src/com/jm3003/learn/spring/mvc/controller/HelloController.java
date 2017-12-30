package com.jm3003.learn.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String helloWorld() {
		return "index";
	}
	
	@RequestMapping("/greet")
	public String greetMe(@RequestParam("name") String userName, Model model) {
		System.out.println(userName);
		model.addAttribute("nm", userName);
		return "greeting";
	}
	
	/*@RequestMapping("/greet")
	public String greetMe(HttpServletRequest request, Model model) {
		String userName = request.getParameter("name");
		System.out.println(userName);
		model.addAttribute("nm", userName);
		return "greeting";
	}
*/
	@RequestMapping("/printMyName/{myName}")
	public String printMyName(@PathVariable("myName") String userName, Model model ) {
		model.addAttribute("nm", userName);
		return "your-name";
	}
}
