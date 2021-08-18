package com.packt.cardatabase;

import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.domain.Owner;
import com.packt.cardatabase.repository.CarRepository;
import com.packt.cardatabase.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CardatabaseApplication {

	@Autowired
	private CarRepository carRepository;
	@Autowired
	private OwnerRepository ownerRepository;

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);

	}

	@Bean
	CommandLineRunner runner(){

		return args->{

			Owner owner = new Owner();
			owner.setName("John");
			owner.setLastName("Fulk");
			ownerRepository.save(owner);

			Car car = new Car();

			car.setBrand("Ford");
			car.setColor("Red");
			car.setPrice(100000);
			car.setYear(1980);
			car.setModel("Mustang");
			car.setRegisterNumber("AAA999");
			car.setOwner(owner);
			carRepository.save(car);

			Car car2 = new Car();

			car2.setBrand("Volkswagen");
			car2.setColor("Black");
			car2.setPrice(80000);
			car2.setYear(2011);
			car2.setModel("Amarok");
			car2.setRegisterNumber("CCC1299");
			car2.setOwner(owner);
			carRepository.save(car2);



		};
	}

}
