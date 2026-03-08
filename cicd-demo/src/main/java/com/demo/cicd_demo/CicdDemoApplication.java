package com.demo.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class CicdDemoApplication {

    @GetMapping("/")
    public String home() {
        return "CI/CD Pipeline Working 🚀";
    }

    public static void main(String[] args) {
        SpringApplication.run(CicdDemoApplication.class, args);
    }
}