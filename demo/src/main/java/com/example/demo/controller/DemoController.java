package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoController
 * @Description
 * @Author gaoyu
 * @Date 2020/9/30 12:31
 * @Version 1.0
 **/
@RestController
public class DemoController {
    @GetMapping("get")
    public String get(){
        return "hello,world";
    }
}
