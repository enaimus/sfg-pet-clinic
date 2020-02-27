package com.enaimus.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

    @GetMapping("/oups")
    public String errorView(){
        return "errors/oups";
    }
}
