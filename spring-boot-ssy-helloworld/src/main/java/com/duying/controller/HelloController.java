package com.duying.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 控制类   业务逻辑  请求分发  组装响应
 */
@Controller
public class HelloController {

    //指定方法和请求之间的映射关系
    @RequestMapping("/hello")
    @ResponseBody //直接用 @controller会去找视图，加上这个代表我们找的十一JSON数据
    public String hello(){
        return "Hello 算是";
    }
}
