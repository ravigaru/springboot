package ravi.varma;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class SpringbootAzureAuthApplication {

	@GetMapping("/login")
	public String login(){
		return "Welcome to Spring Boot Azure AD Open Connect O Auth";
	}
	@GetMapping("/welcome")
	public String welcome(Principal princip){
		System.out.println(princip.getName());		
		return "Welcome";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzureAuthApplication.class, args);
	}

}
