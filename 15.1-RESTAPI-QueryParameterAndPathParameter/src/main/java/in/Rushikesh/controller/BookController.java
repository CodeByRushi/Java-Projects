package in.Rushikesh.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	//QueryParameter
	@GetMapping("/book")
	public ResponseEntity<String> getBook(@RequestParam("name") String name){
		String msgPayload = "Hey, "+name;
		return new ResponseEntity<>(msgPayload, HttpStatus.OK);
	}
	
	
	//PathParameter
	@GetMapping(value="/book/{bname}")
	public ResponseEntity<String> getBookPrice(@PathVariable("bname") String name){
		return new ResponseEntity<>(name+" book price is 450.12", HttpStatus.OK);
	}
	
	@GetMapping(value="/book/{bname}/author/{author}")
	public ResponseEntity<String> getBookAuthor(@PathVariable("bname") String name, 
			@PathVariable("author") String author ){
		return new ResponseEntity<>(name+" book written by Mr."+ author, HttpStatus.OK);
	}
}
