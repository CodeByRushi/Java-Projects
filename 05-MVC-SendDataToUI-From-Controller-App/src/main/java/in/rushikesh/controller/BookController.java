package in.rushikesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.rushikesh.bindings.Book;

@Controller
public class BookController {

	@GetMapping("/books")
	public String getBooks(Model model) {
		Book book = new Book(1, "Spring", 450.23);
		
		model.addAttribute("book",book);
		return "book";
	}
}
