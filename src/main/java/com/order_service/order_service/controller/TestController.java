package com.order_service.order_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class TestController {




    @GetMapping("/hello")
    public String test(){
   return "test order service port 8082";
    }
}
