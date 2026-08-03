package com.alex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alex.entity.Product;
import com.alex.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService service;
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable Long id)
	{
		return service.findProduct(id);
	}
	
}
