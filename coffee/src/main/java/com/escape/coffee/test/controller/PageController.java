package com.escape.coffee.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/testIndex")
    public String testpage(){
        return "test_page1.html";
    }

}
