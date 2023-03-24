package in.rushikesh;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	@JsonProperty(value = "ID")
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
	private Author author;
}
