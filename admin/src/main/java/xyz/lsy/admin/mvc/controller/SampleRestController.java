package xyz.lsy.admin.mvc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {
	@Value("${test.common:as}") private String common;
	
	@RequestMapping("/admin/test")
	public String asdf() {
		return common;
	}
}
