package com.csmarton.springxml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(@RequestParam(name = "mood", defaultValue = "happy") String mood, Model model ) {
        model.addAttribute("mood", mood);

        return "test";
    }
}
