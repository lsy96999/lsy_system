package xyz.lsy.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("xyz.lsy")
public class AdminApplication {
	static {
//		System.setProperty("spring.config.name","application,application-admin");
	}
	public static void main(String[] args) {
//		System.setProperty("spring.config.name","application,application-admin");
//		System.setProperty("spring.config.name","application,application-admin,application-web_common");
		SpringApplication.run(AdminApplication.class, args);
	}
}
