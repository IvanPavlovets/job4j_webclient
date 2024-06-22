package ru.job4j.source;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SourceApplication.class, args);
		log.info("Go to -> :{}", "http://localhost:8080");
	}

}
