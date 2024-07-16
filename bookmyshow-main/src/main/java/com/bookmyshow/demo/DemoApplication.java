package com.bookmyshow.demo;

import com.bookmyshow.demo.controllers.UserController;
import com.bookmyshow.demo.dtos.SignUpUserRequestDto;
import com.bookmyshow.demo.models.BaseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private UserController userController;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SignUpUserRequestDto request = new SignUpUserRequestDto();
		request.setEmail("Sugam@gmail.com");
		request.setName("Sugam");
		request.setPassword("sugamSsecret");
		userController.signUp(request);


		userController.login("Sugam@gmail.com",
				"sugamSsecret");
	}
}
