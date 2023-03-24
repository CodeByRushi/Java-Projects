package in.rushikesh.conversions;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.rushikesh.Author;
import in.rushikesh.Book;

public class JavaObjectToJSONConverter {

	public static void main(String[] args) throws Exception{
		Book book = new Book(1,"Spring", 56.23, new Author("Rushikesh"));
		
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("Book.json"), book);
		System.out.println("Json Created..");

	}

}
