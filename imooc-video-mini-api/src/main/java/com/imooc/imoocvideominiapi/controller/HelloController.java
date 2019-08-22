package com.imooc.imoocvideominiapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:EaApple
 * @Date:2019/8/22 19:35
 * @Des:
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "你好";
    }
}
