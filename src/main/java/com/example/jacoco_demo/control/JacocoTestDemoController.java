package com.example.jacoco_demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JacocoTestDemoController {


    @RequestMapping("/")
    public String tets(){
        System.out.println("hello world");
        return "hello";
    }


    @RequestMapping("/test2")
    public String tets2(){
        System.out.println("hello world test2");
        return "hello test2";
    }
}
