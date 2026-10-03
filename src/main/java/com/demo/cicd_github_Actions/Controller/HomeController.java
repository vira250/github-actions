package com.demo.cicd_github_Actions.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "<h1>🚀 Hello Terna!</h1><p>Application successfully deployed via Docker & Cloudflare Tunnel.</p>";

    }

    @GetMapping("/welcome")
    public String welcome() {
        return "<h1>🚀 Hello logic lords!</h1><p>Application successfully deployed via Docker & Cloudflare Tunnel.</p>";

    }
}