package com.ldl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller
@RestController
public class HellowController {
    //请求页面
    @RequestMapping("/hellow")
    public String hellowSpringBoot(){
        return "hellow";
    }
}
