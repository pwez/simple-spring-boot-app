package com.eytan.simplespringbootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRESTController {

    @GetMapping(path = "/")
    public String index () {
        return "Hello World";
    }

}
