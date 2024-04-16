package com.msatest.productService.products.dto;

import com.msatest.productService.products.model.Products;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {

    private Long id;
    private String name;
    private String description;
    private int price;
    private int stock;
    private String category;

    public Products toEntity(ProductDto productDto) {
        return Products.builder()
                .name(productDto.name)
                .description(productDto.description)
                .price(productDto.price)
                .stock(productDto.stock)
                .category(productDto.category)
                .build();
    }

    public static ProductDto toDto(Products product) {
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .stock(product.getStock())
                .category(product.getCategory())
                .build();
    }
}
