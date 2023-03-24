package in.Rushikesh.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.Rushikesh.bindings.Book;

@Service
public class BookClient {

	public void addBook() {
		Book book = new Book();
		book.setBookName("AWS");
		book.setBookPrice(120.45);
		
		String url = "http://localhost:8080/book"; 
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<String> postForEntity = rt.postForEntity(url, book, String.class);
		
		System.out.println(postForEntity.getBody());
		
	}
	public void invokeGetBooksNew() {
		String apiUrl = "http://localhost:8080/book";

		RestTemplate rt = new RestTemplate();
		ResponseEntity<Book[]> forEntity = rt.getForEntity(apiUrl, Book[].class);
		Book[] body = forEntity.getBody();
		for(Book book : body) {
			System.out.println(book);
		}
	}
}

