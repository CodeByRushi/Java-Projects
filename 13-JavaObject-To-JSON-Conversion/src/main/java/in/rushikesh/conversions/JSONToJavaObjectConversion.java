package in.rushikesh.conversions;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.rushikesh.Book;

public class JSONToJavaObjectConversion {

	public static void main(String[] args) throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		Book book = mapper.readValue(new File("Book.json"), Book.class);
		System.out.println(book);
	}
}
