package com.svivu.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureSvivuApplication {
@GetMapping("/getMessage")
    public String getMessage(){
        return "your app is on azure";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringAzureSvivuApplication.class, args);
    }

}
