package com.tts.techtalentblog.controller;

import com.tts.techtalentblog.blogpost.BlogPost;
import com.tts.techtalentblog.repo.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class blogpostcontroller {

    @Autowired
    private BlogPostRepository BlogPostRepository;

    @GetMapping(value="/")
    public String index(BlogPost blogpost) {
        return "blogpost/index";
    }
    private BlogPost blogpost;

    @PostMapping(value = "/")
    public String addNewBlogPost(BlogPost blogPost, Model model) {
        BlogPostRepository.save (new BlogPost(blogpost.getTitle(), blogpost.getAuthor(), blogpost.getBlogEntry()));
        model.addAttribute("title", blogpost.getTitle());
        model.addAttribute("author", blogpost.getAuthor());
        model.addAttribute("blogEntry", blogpost.getBlogEntry());
        return "blogpost/result";
    }
}
