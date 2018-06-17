package com.home.shoppingportal.controller;

import javax.naming.Context;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.home.backend.dao.CategoryDAO;
import com.home.backend.dto.Category;

@Controller
public class PageController {

	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping(value= {"/", "/home", "/index"})
	public ModelAndView index(){
		ModelAndView view =  new ModelAndView("page");
		view.addObject("title", "Home");
		view.addObject("categoriesPage", categoryDAO.listCategory());
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

	@RequestMapping(value= {"/contact"})
	public ModelAndView contact(){
		ModelAndView view =  new ModelAndView("page");
		view.addObject("title", "Contact Us");
		view.addObject("userClick", "Contact");
		return view;
		
	}
	
	@RequestMapping(value= {"/show/all/products"})
	public ModelAndView showAllProducts(){
		ModelAndView view =  new ModelAndView("page");
		view.addObject("title", "All Products");
		view.addObject("categoriesPage", categoryDAO.listCategory());
		view.addObject("userClick", "listAllProducts");
		return view;
		
	}
	
	@RequestMapping(value= {"/show/category/{id}/products"})
	public ModelAndView showCategoryProducts(@PathVariable("id") Integer id){
		ModelAndView view =  new ModelAndView("page");
		Category category = null;
		
		category = categoryDAO.getCategory(id);
		view.addObject("title", category.getName());
		view.addObject("categoriesPage", categoryDAO.listCategory());
		view.addObject("categoryProducts", category);
		view.addObject("userClick", "listAllCategoryProducts");
		return view;
		
	}
	
}
