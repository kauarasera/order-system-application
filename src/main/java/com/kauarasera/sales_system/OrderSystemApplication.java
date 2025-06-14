package com.kauarasera.sales_system;

import com.kauarasera.sales_system.entity.OrderEntity;
import com.kauarasera.sales_system.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderSystemApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args){
		SpringApplication.run(OrderSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		OrderEntity order = new OrderEntity(2280, 800.0, 10.0);
		double total = orderService.total(order);

		System.out.println("Order code = " + order.getCode());
		System.out.println("Total value = " + String.format("%.2f", total));
	}
}
