package com.example.product;

import com.example.product.entity.Product;
import com.example.product.repostirory.ProductRepostirory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductApplication {

	@Autowired
	private ProductRepostirory productRepostirory;

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				for (int i = 1; i <= 10; i++) {
					productRepostirory.save(new Product(i, "Product" + i));

				}
			}
		};

	}
}
