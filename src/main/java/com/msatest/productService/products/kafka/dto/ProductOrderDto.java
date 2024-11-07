package com.msatest.productService.products.kafka.dto;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ProductOrderDto {
    private Long productId;
    private int quantity;
}