package com.webapp.demo.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexResource {

    @GetMapping
    public String welcome(){
        return "Welcome - WebDemo API";
    }
}
