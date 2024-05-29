package com.ameda.kisevu.Githubactions_cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubactionsCicdApplication {

	@GetMapping("/welcome")
	public String message(){
		return "Kevin Ameda Kisevu";
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubactionsCicdApplication.class, args);
	}
}
