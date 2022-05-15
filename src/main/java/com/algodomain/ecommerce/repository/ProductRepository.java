package com.algodomain.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algodomain.ecommerce.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByProductName(String productName);
	List<Product> findByProductType(String productType);
	List<Product> findByProductCategory(String productCategory);
	List<Product> findBySellerName(String sellerName);
}
