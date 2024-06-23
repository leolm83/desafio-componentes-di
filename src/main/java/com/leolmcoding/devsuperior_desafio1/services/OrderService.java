package com.leolmcoding.devsuperior_desafio1.services;

import com.leolmcoding.devsuperior_desafio1.dtos.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order){
        return order.basic() - (order.basic()*(order.discount()/100)) + shippingService.shipment(order);
    }
}
