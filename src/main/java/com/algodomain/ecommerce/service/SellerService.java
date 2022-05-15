package com.algodomain.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algodomain.ecommerce.entity.Product;
import com.algodomain.ecommerce.repository.ProductRepository;
import com.algodomain.ecommerce.response.LongResponse;

@Service
public class SellerService {

	@Autowired
	ProductRepository productRepository;

	public LongResponse addProduct(Product product) {
		Product entity = productRepository.save(product);
		return new LongResponse(true, "Product Added", entity.getProductId());
	}

	public List<Product> getAllProductsBySellerName(String sellerName) {
		return productRepository.findBySellerName(sellerName);
	}

	public LongResponse updateProduct(Product product) {
		productRepository.save(product);
		return new LongResponse(true, "Product Updated", product.getProductId());
	}

	public LongResponse deleteProduct(Long productId) {
		productRepository.deleteById(productId);
		return new LongResponse(true, "Product Deleted", productId);
	}
}
