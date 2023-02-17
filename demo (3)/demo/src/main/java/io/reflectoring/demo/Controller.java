package io.reflectoring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
        @GetMapping("/welcome")
    public String welcome(){
        return "Hello into the world of Spring Boot";
    }
}
