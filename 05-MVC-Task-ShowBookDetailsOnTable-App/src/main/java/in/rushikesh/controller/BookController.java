package in.rushikesh.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.rushikesh.binding.Book;

@Controller
public class BookController {
	@GetMapping("/")
	public String getBookDetails(Model model) {
		Book b1 = new Book(1,"Spring",456.2);
		Book b2 = new Book(2,"Boot",256.2);
		Book b3 = new Book(3,"OS",476.2);
		Book b4 = new Book(4,"TOC",458.2);
		model.addAttribute("bookList",Arrays.asList(b1,b2,b3,b4));
		
		return "book";
	}
}
