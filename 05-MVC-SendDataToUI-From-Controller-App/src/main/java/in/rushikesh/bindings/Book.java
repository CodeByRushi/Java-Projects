package in.rushikesh.bindings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Book {
	private int bookID;
	private String bookName;
	private double bookPrice;
	
}
