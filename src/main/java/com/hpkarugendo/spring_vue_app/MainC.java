package com.hpkarugendo.spring_vue_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainC {
    @GetMapping("/api/springvueapp/ test")
    public String index(){
        return "Spring Vue App";
    }
}
