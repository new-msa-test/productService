package com.msatest.productService.products.controller;

import com.msatest.productService.products.dto.ProductDto;
import com.msatest.productService.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product-service/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<String> createProduct(@RequestBody ProductDto productDto) {

        productService.createProduct(productDto);

        return ResponseEntity.ok("상품 등록 성공!");
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> getAllProducts() {

            return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long productId) {
        return ResponseEntity.ok(productService.getProductById(productId));
    }
}
