package com.tts.techtalentblog.controller;

import com.tts.techtalentblog.blogpost.blogpost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class blogpostcontroller {
    @GetMapping("/")
    public String index(blogpost blogpost) {
        return "blogpost/index";
    }
}
