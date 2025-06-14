package com.kauarasera.sales_system.services;

import com.kauarasera.sales_system.entity.OrderEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(OrderEntity orderEntity) {

        double basic = orderEntity.getBasic();
        double discount = orderEntity.getDiscount();
        double discounted = basic - (basic * discount / 100);
        double shippingFee = shippingService.shipment(orderEntity);

        return discounted + shippingFee;

    }
}
