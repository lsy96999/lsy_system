package xyz.lsy.admin.mvc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {
	@Value("${test.common:as}") private String common;
	@Value("${real.common:as}") private String real;
	@Value("${real.prof:as}") private String prof;
	
	@RequestMapping("/admin/test")
	public String asdf() {
		return common;
	}
	
	@RequestMapping("/admin/real")
	public String real() {
		return real;
	}
	
	@RequestMapping("/admin/prof")
	public String prof() {
		return prof;
	}
}
