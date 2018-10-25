package com.demo.sample.SampleDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class Sample {

    @GetMapping
    public String initDisp(Model model) {

        return "sample";
    }
}
