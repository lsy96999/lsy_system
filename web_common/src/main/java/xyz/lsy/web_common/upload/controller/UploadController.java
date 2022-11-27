package xyz.lsy.web_common.upload.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/upload")
public class UploadController {
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
}
