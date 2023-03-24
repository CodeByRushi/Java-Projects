package in.Rushikesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Rushikesh.client.BookClient;

@SpringBootApplication
public class Application {

	/*
	 * Before Starting this application, so start "20-CRUD-Using-RESTAPI-H2-Swagger-App"
	 * Because REST APIs are available there
	 * */
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		BookClient bookClient = context.getBean(BookClient.class);
		
		//bookClient.addBook();
		bookClient.invokeGetBooksNew();
		
	}

}
