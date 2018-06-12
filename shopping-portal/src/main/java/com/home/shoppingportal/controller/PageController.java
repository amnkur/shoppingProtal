package com.home.shoppingportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value= {"/", "/home", "/index"})
	public ModelAndView index(){
		ModelAndView view =  new ModelAndView("page");
		view.addObject("msg", "Welcome to Spring");
		return view;
		
	}
}
