package com.msatest.productService.products.service;

import com.msatest.productService.products.dto.ProductDto;

import java.util.List;

public interface ProductService {

    void createProduct(ProductDto productDto);

    List<ProductDto> getAllProducts();

    ProductDto getProductById(Long productId);
}
