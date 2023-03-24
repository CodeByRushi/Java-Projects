package in.Rushikesh.bindings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketBookingInfo {
	//This is binding class for ticket booking information (response data)
	private Integer pnrId;
	private String pName;
	private String pSeatNumber;
	private String pTrain;
}
