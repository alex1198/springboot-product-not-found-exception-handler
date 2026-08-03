package com.alex.service;

import org.springframework.stereotype.Service;

import com.alex.entity.Product;
import com.alex.exception.ProductNotFoundException;

@Service
public class ProductService {
	
	public Product findProduct(Long productId)
	{
		if ( productId == 101L)
		{
			return new Product(101L, "Laptop");
		}
		
		throw new ProductNotFoundException("Product Not Found");
	}

}
