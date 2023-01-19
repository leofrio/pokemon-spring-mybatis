package com.firstThymeLeaf.first.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/test")
public class DemoController {
    @GetMapping()
    public String getTemplate(@RequestParam(name = "name",required = false,defaultValue = "world") String name, Model model) {
        model.addAttribute("name",name);
        return "thymeleafTemplate";
    }
}
