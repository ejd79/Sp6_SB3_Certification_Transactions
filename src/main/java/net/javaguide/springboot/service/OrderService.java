package net.javaguide.springboot.service;

import net.javaguide.springboot.dto.OrderRequest;
import net.javaguide.springboot.dto.OrderResponse;

public interface OrderService {

    OrderResponse placeOrder(OrderRequest orderRequest);

}
