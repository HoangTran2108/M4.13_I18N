package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseController {
  @GetMapping("/")
  public ModelAndView index() {
    return new ModelAndView("index");
  }
  @GetMapping("/a")
  public ModelAndView index1() {
    return new ModelAndView("a");
  }
}