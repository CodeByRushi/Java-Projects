package in.Rushikesh.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@Value("${messages.welcome}")
	private String msg;
	
	@Value("${messages.greet}")
	private String greetMsg;
	
	@GetMapping("/")
	public String getMsg() {
		return msg;
	}
	
}
