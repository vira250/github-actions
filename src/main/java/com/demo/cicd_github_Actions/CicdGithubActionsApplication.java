package com.demo.cicd_github_Actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdGithubActionsApplication {

		@GetMapping("/")
		public String home() {
			return "<h1>🚀 Hello from CI/CD Platform!</h1><p>Application successfully deployed via Docker & Cloudflare Tunnel.</p>";

	}
	public static void main(String[] args) {
		SpringApplication.run(CicdGithubActionsApplication.class, args);
	}

}
