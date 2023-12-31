package com.shuncosdb.shuncosdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shuncosdb.shuncosdb.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	List<Product> findByModelContaining(String modelTxt);

}