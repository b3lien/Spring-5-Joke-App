package com.mk.jokeapp.controllers;

import com.mk.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MotherInLawController {

    private JokeService jokeService;

    @Autowired
    public MotherInLawController(@Qualifier("motherInLawImpl") JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/mother-in-law")
    public String getJoke (Model model) {
        model.addAttribute("mJokes", jokeService.getJoke());
        return "mother";
    }
}
