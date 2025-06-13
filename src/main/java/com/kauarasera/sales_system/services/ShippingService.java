package com.kauarasera.sales_system.services;

import com.kauarasera.sales_system.entity.OrderEntity;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(OrderEntity order){
        double discount = 0.0;

        if (order.getBasic() < 100) {
            discount = 20.0;
        } else if (order.getBasic() < 200) {
            discount =  12.0;
        } else {
            discount = 0.0;
        }

        return discount;
    }
}