package in.Rushikesh.client;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.Rushikesh.bindings.Book;

@Service
public class BookClient {
	
	public void saveBook() {
		Book book = new Book();
		book.setBookName("Azure");
		book.setBookPrice(566.30);
		
		String url = "http://localhost:8080/book";
		WebClient client = WebClient.create();
		
		String block = client.post()
							.uri(url)
							.bodyValue(book)
							.retrieve()
							.bodyToMono(String.class)
							.block();
		
		System.out.println(block);
		
	}
	public void getAllBooks() {
		WebClient client = WebClient.create();
		String url = "http://localhost:8080/book";
		Book[] block = client.get()
			.uri(url)
			.retrieve()
			.bodyToMono(Book[].class)
			.block(); //sync communication
		for(Book b : block) {
			System.out.println(b);
		}
	}
	
	
	//Async REST client
	public void getBooks() {
		WebClient client = WebClient.create();
		String url = "http://localhost:8080/book";
		
		client.get()
			.uri(url)
			.retrieve()
			.bodyToMono(Book[].class)
			.subscribe(BookClient::respHandler); //Async communication
		
		System.out.println("***********Request sent***************");
		
	}
	public static void respHandler(Book[] book) {
		for(Book b : book) {
			System.out.println(b);
		}
	}
}
