package in.Rushikesh.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Rushikesh.props.AppProperties;

@RestController
public class DemoRestController {

	@Autowired
	private AppProperties props;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		Map<String, String> map = props.getMessages();
		String value = map.get("welcome");
		return value;
	}
	@GetMapping("/greet")
	public String getGreetMsg() {
		Map<String, String> map = props.getMessages();
		String value = map.get("greet");
		return value;
	}
	@GetMapping("/wish")
	public String getWishMsg() {
		Map<String, String> map = props.getMessages();
		String value = map.get("wish");
		return value;
	}
}
