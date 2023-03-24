package in.rushikesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public ModelAndView geWelcomeMsg() {
		
		ModelAndView mvn = new ModelAndView();
		mvn.addObject("msg", "Welcome Spring MVC first Project....");
		mvn.setViewName("index");
		
		return mvn;
	}
}
