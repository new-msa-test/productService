package com.msatest.productService.products.kafka.consumer;

import com.msatest.productService.products.kafka.dto.OrderDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderKafkaConsumer {

    @KafkaListener(topics = "order-topic", groupId = "order-group")
    public void orderConsume(String orderDto) {
        log.info("Order String consumed : {}", orderDto);
    }

    @KafkaListener(topics = "order-object-topic", groupId = "order-group", containerFactory = "orderDtoListener")
    public void orderConsume(OrderDto orderDto) {
        log.info("Order Object consumed : {}", orderDto.toString());
    }

//    @KafkaListener(topics = "order-object-topic", groupId = "order-group", containerFactory = "orderListDtoListener")
//    public void orderConsume(List<OrderDto> orderDto) {
//        log.info("Order Object consumed : {}", orderDto.toString());
//    }
}
