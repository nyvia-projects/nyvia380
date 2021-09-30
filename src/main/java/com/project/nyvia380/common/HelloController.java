package com.project.nyvia380.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/s")
    public String display() {
        return "example.jsp";
    }
}
