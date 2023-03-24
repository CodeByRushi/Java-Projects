package in.rushikesh.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.rushikesh.bindings.NoDataFoundException;

@RestController
public class BookRestController {

	@GetMapping("/book")
	public String doSomeAction() {
		String msg = "Action in progress";
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			
			throw new ArithmeticException(e.getMessage());
		}
		return msg;
	}
	
	
	@GetMapping("/book/{name}")
	public String doAction(@PathVariable String name) {
		if(name.equals("alchemist")) {
			return "available";
		}
		else {
			throw new NoDataFoundException("Invalid book name");
		}
	}
	
}
