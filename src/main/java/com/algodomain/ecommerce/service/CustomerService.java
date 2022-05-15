package com.algodomain.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.algodomain.ecommerce.entity.Product;
import com.algodomain.ecommerce.repository.ProductRepository;

@Service
public class CustomerService {

	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllProductsByProductName(String productName){
		return productRepository.findByProductName(productName);
	}

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public List<Product> getAllProductsByProductType(String productType) {
		return productRepository.findByProductType(productType);
	}

	public List<Product> getAllProductsByProductCategory(String productCategory) {
		return productRepository.findByProductCategory(productCategory);
	}

	public List<Product> getAllProductsByMinPrice() {
		return productRepository.findAll(Sort.by(Sort.Direction.ASC, "productPrice"));
	}

	public List<Product> getAllProductsByMaxPrice() {
		return productRepository.findAll(Sort.by(Sort.Direction.DESC, "productPrice"));
	}
}
