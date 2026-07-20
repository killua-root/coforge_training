package com.coforge.pms.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.pms.model.Product;
import com.coforge.pms.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService service;

	@RequestMapping("home")
	public ModelAndView loadHomePage() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHomePage");

		return mv;
	}

	@RequestMapping(method = RequestMethod.POST, value = "product", params = "Insert")
	public ModelAndView addProduct(@ModelAttribute Product product) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHomePage");
		String status = service.addProduct(product);
		mv.addObject("result", status);
		return mv;

	}

	@RequestMapping(method = RequestMethod.POST, value = "product", params = "Update")
	public ModelAndView updateProduct(@ModelAttribute Product product) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHomePage");
		String status = service.updateProduct(product);
		mv.addObject("result", status);
		return mv;

	}
	@RequestMapping(method = RequestMethod.POST, value = "product", params = "Delete")
	public ModelAndView deleteProduct(@RequestParam int pid) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHomePage");
		String status = service.deleteProduct(pid);
		mv.addObject("result", status);
		return mv;

	}
	@RequestMapping(method = RequestMethod.POST, value = "product", params = "Find")
	public ModelAndView findProduct(@RequestParam int pid) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHomePage");
		String status = service.findProduct(pid);
		mv.addObject("result", status);
		return mv;

	}
	@RequestMapping(method = RequestMethod.POST, value = "product", params = "FindAll")
	public ModelAndView deleteProduct() {
		ModelAndView mv = new ModelAndView();
		Collection<Product> products = service.findAllProducts();
		mv.addObject("result", products);
		return mv;

	}
	

}