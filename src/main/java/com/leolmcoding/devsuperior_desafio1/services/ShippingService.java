package com.leolmcoding.devsuperior_desafio1.services;

import com.leolmcoding.devsuperior_desafio1.dtos.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order){
        if(order.basic()<100.00){
            return 20;
        }else if(order.basic()<200){
            return 12.0;
        }else{
            return 0.0;
        }
    }
}
