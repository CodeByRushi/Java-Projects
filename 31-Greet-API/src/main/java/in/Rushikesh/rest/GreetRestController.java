package in.Rushikesh.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Rushikesh.client.WelcomeApiClient;

@RestController
public class GreetRestController {

	@Autowired
	private WelcomeApiClient client;
	
	@GetMapping("/greet")
	public String getMsg() {
		
		String msg = client.invokeWelcomeApi();
		
		return "Hey, Good Evening "+msg;
	}
}
