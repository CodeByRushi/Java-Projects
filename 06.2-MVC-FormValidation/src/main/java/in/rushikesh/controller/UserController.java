package in.rushikesh.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.rushikesh.binding.User;

@Controller
public class UserController {

	@GetMapping("/")
	public String showForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "user";
	}
	@PostMapping("/user")
	public String getFormSubmission(@Valid User user,  BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "user";
		}
		System.out.println(user);
		model.addAttribute("data", user);
		return "success";
	}
}
