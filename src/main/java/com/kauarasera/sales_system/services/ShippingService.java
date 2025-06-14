package com.kauarasera.sales_system.services;

import com.kauarasera.sales_system.entity.OrderEntity;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(OrderEntity order){
        double shippingFee;

        if (order.getBasic() < 100) {
            shippingFee = 20.0;
        } else if (order.getBasic() < 200) {
            shippingFee =  12.0;
        } else {
            shippingFee = 0.0;
        }

        return shippingFee;
    }
}