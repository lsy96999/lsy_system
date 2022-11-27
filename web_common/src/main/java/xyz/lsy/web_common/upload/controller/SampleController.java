package xyz.lsy.web_common.upload.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common")
public class SampleController {
	@Value("${common.test.enc}") private String enc;
	@RequestMapping("/enc")
	public String t() {
		return enc;
	}
}
