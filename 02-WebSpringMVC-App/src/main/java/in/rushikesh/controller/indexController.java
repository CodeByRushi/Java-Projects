package in.rushikesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {

	@GetMapping("/")
	public ModelAndView getIndexPage() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Hey user, This is index page");
		mav.setViewName("index");
		return mav;
	}
}
