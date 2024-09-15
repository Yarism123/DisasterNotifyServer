package org.example.disasternotifyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class DisasterNotifyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisasterNotifyServerApplication.class, args);
	}

}
