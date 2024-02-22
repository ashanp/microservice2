package com.test.servive2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {
	
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Service 2!";
    }

}
