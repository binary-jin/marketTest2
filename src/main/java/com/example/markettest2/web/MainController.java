package com.example.markettest2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="/thymeleaf")
@Controller
public class MainController {
    @GetMapping(value = "/ex")
    public String thymeleaf() {
        return "fragments/layout";
    }
}
