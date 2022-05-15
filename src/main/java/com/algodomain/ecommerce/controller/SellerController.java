package com.algodomain.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algodomain.ecommerce.entity.Product;
import com.algodomain.ecommerce.response.LongResponse;
import com.algodomain.ecommerce.service.SellerService;

@RestController
public class SellerController {

	@Autowired
	SellerService sellerService;
	
	@PostMapping("/seller/products/add")
	public LongResponse addProduct(@RequestBody Product product) {
		return sellerService.addProduct(product);
	}
	
	@GetMapping("/seller/products/sellerName/{sellerName}")
	public List<Product> getAllProductsBySellerName(@PathVariable String sellerName){
		return sellerService.getAllProductsBySellerName(sellerName);
	}
	
	@PutMapping("/seller/products/update")
	public LongResponse updateProduct(@RequestBody Product product) {
		return sellerService.updateProduct(product);
	}
	
	@DeleteMapping("/seller/products/delete/{productId}")
	public LongResponse deleteProduct(@PathVariable Long productId) {
		return sellerService.deleteProduct(productId);
	}
}
