package com.yfujii01.sqlstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my")
public class MyController {
  @GetMapping
  public String index() {
    return "my index!!!fix!hello!!";
  }
}