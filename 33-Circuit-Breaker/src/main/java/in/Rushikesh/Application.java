package in.Rushikesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//CircuitBreaker not working in 2.7.9
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
