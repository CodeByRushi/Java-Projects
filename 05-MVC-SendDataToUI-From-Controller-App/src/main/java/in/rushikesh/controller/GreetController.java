package in.rushikesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//Here we are using 2nd approach to send data from controller to UI i.e. using Model
@Controller
public class GreetController {

	@GetMapping("/greet")
	public String getGreetMsg(Model model) {
		String greetMsg = "Hey, Good Evening!!";
		model.addAttribute("msg", greetMsg);
		return "greet";//returning view name
	}
}
