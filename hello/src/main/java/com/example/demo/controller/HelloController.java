package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.HelloEntity;
import com.example.demo.service.HelloService;

@Controller
public class HelloController {
	@Autowired
	HelloService helloservice;

    @GetMapping("hello")
    String list(Model model) {
        List<HelloEntity> helloentity = helloservice.findAll();
        model.addAttribute("helloentity", helloentity);
        return "hello";
    }
}