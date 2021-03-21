package com.duying.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 返回json形式的字符串 @Controller和@ResponseBody的组合
 * 返回json形式的响应结果，而不是视频（jsp html）
 */
@RestController
public class JsonController {

    @RequestMapping("/json")
    public String json(){
        return "hello json";
    }
}
