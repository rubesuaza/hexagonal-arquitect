package io.quind.testmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class TestConexionMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestConexionMongoApplication.class, args);
	}

}
