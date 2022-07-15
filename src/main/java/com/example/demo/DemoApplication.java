package com.example.demo;

import com.example.demo.entities.Laptop;
import com.example.demo.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		/*SpringApplication.run(DemoApplication.class, args);

		Saludo saludo = new Saludo();

		saludo.holaMundo();*/

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null, "Dell", "Gaming", 999.99);
		Laptop laptop2 = new Laptop(null, "Lenovo", "office", 1499.99);

		repository.save(laptop1);
		repository.save(laptop2);

		repository.findAll();
	}

}
