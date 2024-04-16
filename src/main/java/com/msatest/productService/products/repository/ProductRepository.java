package com.msatest.productService.products.repository;

import com.msatest.productService.products.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long>{
}
