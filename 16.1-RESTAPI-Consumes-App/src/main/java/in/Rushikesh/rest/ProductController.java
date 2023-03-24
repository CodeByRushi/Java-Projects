package in.Rushikesh.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.Rushikesh.binding.Product;

@RestController
public class ProductController {
	
	@PostMapping(value = "/product",
			consumes={"application/xml","application/json"})
	public ResponseEntity<String> addProduct(@RequestBody Product product){
		System.out.println(product);
		
		//logic to store in db
		
		return new ResponseEntity<>("Product Successfully stored", HttpStatus.CREATED);
	}
	
	@PostMapping(value = "/products",
			consumes={"application/xml","application/json"})
	public ResponseEntity<String> addProducts(@RequestBody List<Product> products){
		System.out.println(products);
		
		//logic to store in db
		
		return new ResponseEntity<>("Products Successfully stored", HttpStatus.CREATED);
	}
	
}
