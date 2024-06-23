package com.leolmcoding.devsuperior_desafio1;

import com.leolmcoding.devsuperior_desafio1.dtos.Order;
import com.leolmcoding.devsuperior_desafio1.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DevsuperiorDesafio1Application implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DevsuperiorDesafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		try(Scanner sc = new Scanner(System.in)){

			int code = sc.nextInt();
			double basic = sc.nextDouble();
			double discount = sc.nextDouble();
			Order order = new Order(code,basic,discount);
			System.out.println("Pedido Código "+order.code());
			System.out.println("Valor total: R$ "+orderService.total(order));
		}
	}
}
