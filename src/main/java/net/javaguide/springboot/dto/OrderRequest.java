package net.javaguide.springboot.dto;

import lombok.Getter;
import lombok.Setter;
import net.javaguide.springboot.entity.Order;
import net.javaguide.springboot.entity.Payment;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
