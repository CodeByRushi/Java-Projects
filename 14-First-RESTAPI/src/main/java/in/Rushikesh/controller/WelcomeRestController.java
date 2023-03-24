package in.Rushikesh.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg(){
		String reqBody = "Hey User";
		return new ResponseEntity<String>(reqBody, HttpStatus.OK);
	}
	
	@GetMapping("/wish")
	public String getWishMsg() {
		return "Hey, all the best!!!";
	}
	
	//We are taking one Query Parameter
	
	@GetMapping("/courses")
	public ResponseEntity<String> getCourses(@RequestParam(name = "course") String cname){
		String payload = "We are providing "+cname+" courses";
		return new ResponseEntity<String>(payload, HttpStatus.OK);
	}
	
	//we are taking two query parameter
	@GetMapping("/syllabus")
	public ResponseEntity<String> getSyllabus(@RequestParam(name="subject") String sname,
			@RequestParam(name="trainer") String tname){
		String payload = "Subject is "+sname+" and trainer name is "+tname;
		return new ResponseEntity<String>(payload, HttpStatus.OK);
	}
}
