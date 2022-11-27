package xyz.lsy.admin.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminSampleController {

	@RequestMapping("/sample")
	public String sample(Model model) {
		model.addAttribute("sample", "sample2");
		return "sample";
	}
}
