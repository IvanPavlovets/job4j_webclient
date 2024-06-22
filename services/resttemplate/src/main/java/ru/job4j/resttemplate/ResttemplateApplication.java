package ru.job4j.resttemplate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ResttemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResttemplateApplication.class, args);
		log.info("Go to -> :{}", "http://localhost:8080");
	}

}
