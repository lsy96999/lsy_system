package xyz.lsy.web_common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("xyz.lsy")
public class WebCommonApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebCommonApplication.class, args);
	}
}
