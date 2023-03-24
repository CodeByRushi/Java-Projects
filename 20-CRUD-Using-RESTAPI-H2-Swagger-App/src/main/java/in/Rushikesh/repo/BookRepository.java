package in.Rushikesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import in.Rushikesh.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	
	
}
