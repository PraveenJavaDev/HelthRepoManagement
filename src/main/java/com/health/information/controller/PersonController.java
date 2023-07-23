package com.health.information.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.function.EntityResponse.Builder;

import com.health.information.model.PersonRegistration;

@Controller
public class PersonController {
	

	@RequestMapping(value = {"/","/login"}, method=RequestMethod.GET)
	public String redirctingtoLoginPage() {
		System.out.println("application running fine");
		return "login";

	}
	@RequestMapping("/registration")
	public String redirectingRegisterpage() {
		System.out.println("application running fine");
		return "registration";

	}

	@RequestMapping("/regeisterUser")
	public String UserRegister(@ModelAttribute PersonRegistration rigister, @RequestParam String name,
			@RequestParam String email, @RequestParam String pass, @RequestParam String re_pass, @RequestParam String contact,Model m) {
		System.out.println(rigister.toString());
		if (!pass.equals(re_pass)) {
			m.addAttribute("message", "password and repeatepassword  is not matching please enter again");
			return "welcome";
		}

		
		return "login";

	}
	

}
