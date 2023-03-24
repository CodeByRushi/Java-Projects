package in.Rushikesh.service;

import java.util.List;
import org.springframework.stereotype.Service;
import in.Rushikesh.entity.Book;
import in.Rushikesh.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository repo;
	
	BookServiceImpl(BookRepository repo){
		this.repo = repo;
	}
	@Override
	public String upsertBook(Book book) {
		
		Integer bookId = book.getBookId();//Extract the id first to check if exist or not
		
		repo.save(book);
		
		if(bookId == null)
			return "Record Inserted.";
		else
			return "Record updated.";
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> list = repo.findAll();
		
		return list;
	}

	@Override
	public String deleteBook(Integer bookId) {
		repo.deleteById(bookId);
		return "Book Deleted";
	}

}
