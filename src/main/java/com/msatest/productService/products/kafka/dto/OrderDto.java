package com.msatest.productService.products.kafka.dto;

import lombok.*;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class OrderDto {
    private Long id;
    private String orderCode;
    private List<ProductOrderDto> productList;
    private Long userId;
}
