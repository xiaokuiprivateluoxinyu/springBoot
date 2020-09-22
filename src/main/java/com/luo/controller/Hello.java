package com.luo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date:2020-09-22
 */
@RestController
public class Hello {

    @RequestMapping("/hello")
    public String say(){
        return "helloWord!";
    }
}
