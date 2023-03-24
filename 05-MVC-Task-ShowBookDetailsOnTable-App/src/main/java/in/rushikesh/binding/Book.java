package in.rushikesh.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor

public class Book {
	private int bookId;
	private String bookName;
	private double bookPrice;
}
