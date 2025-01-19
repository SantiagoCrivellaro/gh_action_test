package com.actions;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hola mundo";
    }


}
