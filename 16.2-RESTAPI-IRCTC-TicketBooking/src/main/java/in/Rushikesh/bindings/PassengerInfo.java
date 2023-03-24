package in.Rushikesh.bindings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassengerInfo {
	//This is binding class for request data
	private String email;
	private String name;
	private String age;
	private String gender;
}
