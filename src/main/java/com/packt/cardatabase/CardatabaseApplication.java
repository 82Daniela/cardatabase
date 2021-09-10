package com.packt.cardatabase;

import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.domain.Owner;
import com.packt.cardatabase.domain.User;
import com.packt.cardatabase.repository.CarRepository;
import com.packt.cardatabase.repository.OwnerRepository;
import com.packt.cardatabase.repository.UserRepository;
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

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);

	}

	@Bean
	CommandLineRunner runner(){

		return args->{

			User user = new User();
			user.setUsername("user");
			user.setPassword("\"$2a$04$1.YhMIgNX/8TkCKGFUONWO1waedKhQ5KrnB30fl0Q01QKqmzLf.Zi\"");
			user.setRole("USER");


		};
	}

}
