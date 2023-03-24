package in.rushikesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Here we are using 3rd approach to send data from controller to UI i.e. @ResponseBody
@Controller
public class WishController {

	@GetMapping("/wish")
	@ResponseBody
	public String getWishMsg() {
		String msg = "Hey, All the best";
		return msg;
	}
}
