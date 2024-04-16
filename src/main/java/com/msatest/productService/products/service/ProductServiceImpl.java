package com.msatest.productService.products.service;

import com.msatest.productService.products.dto.ProductDto;
import com.msatest.productService.products.model.Products;
import com.msatest.productService.products.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    @Override
    public void createProduct(ProductDto productDto) {
        productRepository.save(productDto.toEntity(productDto));
    }

    @Override
    public List<ProductDto> getAllProducts() {
        return productRepository.findAll().stream().map(ProductDto::toDto).toList();
    }

    @Override
    public ProductDto getProductById(Long productId) {

        Products products = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        return ProductDto.toDto(products);
    }

}
