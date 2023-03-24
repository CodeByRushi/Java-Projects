package in.Rushikesh.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.Rushikesh.entity.Book;
import in.Rushikesh.service.BookService;

@RestController
public class BookRestController {
	BookService service;

	public BookRestController(BookService service) {
		this.service = service;
	}

	@PostMapping("/book")
	public ResponseEntity<String> addBook(@RequestBody Book book) {

		String msg = service.upsertBook(book);
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}
	
	@PutMapping("/book")
	public ResponseEntity<String> updateBook(@RequestBody Book book){
		String msg = service.upsertBook(book);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@GetMapping("/book")
	public ResponseEntity<List<Book>> getBooks(){
		List<Book> allBooks = service.getAllBooks();
		
		return new ResponseEntity<List<Book>>(allBooks, HttpStatus.OK);
	}
	
	@DeleteMapping("/book/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer bookId){
		String msg = service.deleteBook(bookId);
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
