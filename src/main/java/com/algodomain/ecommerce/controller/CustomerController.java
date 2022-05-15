package com.algodomain.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.algodomain.ecommerce.entity.Product;
import com.algodomain.ecommerce.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/products/all")
	public List<Product> getAllProducts(){
		return customerService.getAllProducts();
	}
	
	@GetMapping("/products/all/productName/{productName}")
	public List<Product> getAllProductsByProductName(@PathVariable String productName){
		return customerService.getAllProductsByProductName(productName);
	}
	
	@GetMapping("/products/all/productType/{productType}")
	public List<Product> getAllProductsByProductType(@PathVariable String productType){
		return customerService.getAllProductsByProductType(productType);
	}
	
	@GetMapping("/products/all/productCategory/{productCategory}")
	public List<Product> getAllProductsByProductCategory(@PathVariable String productCategory){
		return customerService.getAllProductsByProductCategory(productCategory);
	}
	
	@GetMapping("/products/all/price/min")
	public List<Product> getAllProductsByMinPrice(){
		return customerService.getAllProductsByMinPrice();
	}
	
	@GetMapping("/products/all/price/max")
	public List<Product> getAllProductsByMaxPrice(){
		return customerService.getAllProductsByMaxPrice();
	}
}
