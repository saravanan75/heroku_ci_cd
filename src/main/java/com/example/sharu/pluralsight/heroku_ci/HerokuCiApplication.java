package com.example.sharu.pluralsight.heroku_ci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HerokuCiApplication {
	@GetMapping("/hellops")
	//Code Changed
	public String helloHeroku()
	{
		return "Hello from pluralsight course on Heroku CI/CD.";
	}
	public static void main(String[] args)
	{
		SpringApplication.run(HerokuCiApplication.class, args);
	}

}
