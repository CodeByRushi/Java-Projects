package in.rushikesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.rushikesh.binding.Product;

@Controller
public class ProductController {

	@GetMapping("/")
	public String showForm(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "book";
	}
	@PostMapping("/product")
	public String getFormSubmission(Product product, Model model) {
		System.out.println(product);
		model.addAttribute("data", product);
		return "success";
	}
}
