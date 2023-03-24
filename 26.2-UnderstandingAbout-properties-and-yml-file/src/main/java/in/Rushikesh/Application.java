package in.Rushikesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Rushikesh.rest.WelcomeRestController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
//		WelcomeRestController bean = context.getBean(WelcomeRestController.class);
//		
//		bean.getMsg();
	}

}
