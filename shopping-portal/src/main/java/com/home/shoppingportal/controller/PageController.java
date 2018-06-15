package com.home.shoppingportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value= {"/", "/home", "/index"})
	public ModelAndView index(){
		ModelAndView view =  new ModelAndView("page");
		view.addObject("title", "Home");
		view.addObject("userClick", "Home");
		return view;
		
	}
	@RequestMapping(value= {"/about"})
	public ModelAndView about(){
		ModelAndView view =  new ModelAndView("page");
		view.addObject("title", "About Us");
		view.addObject("userClick", "About");
		return view;
		
	}
	@RequestMapping(value= {"/listProduct"})
	public ModelAndView listProduct(){
		ModelAndView view =  new ModelAndView("page");
		view.addObject("title", "View Products");
		view.addObject("userClick", "listProduct");
		return view;
		
	}
	@RequestMapping(value= {"/contact"})
	public ModelAndView contact(){
		ModelAndView view =  new ModelAndView("page");
		view.addObject("title", "Contact Us");
		view.addObject("userClick", "Contact");
		return view;
		
	}
}
