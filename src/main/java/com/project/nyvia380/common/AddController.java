package com.project.nyvia380.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {

    @RequestMapping("/example")
    public String message(Model model) {
        model.addAttribute("message", "Page Says Hi!");
        return "Page Says hiiii!";
    }
}
