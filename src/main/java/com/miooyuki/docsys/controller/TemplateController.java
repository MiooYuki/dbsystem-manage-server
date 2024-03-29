package com.miooyuki.docsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/thymeleaf")
public class TemplateController {

    @PostMapping("/test")
    public String test(Model model, @RequestBody Map<String, String> data) {
        model.addAttribute("html", data.get("html"));
        return "index";
    }

}
