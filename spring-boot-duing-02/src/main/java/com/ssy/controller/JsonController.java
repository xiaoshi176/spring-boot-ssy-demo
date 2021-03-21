package com.ssy.controller;

import com.ssy.bean.Food;
import com.ssy.config.FoodConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {

    /*
        通过${}结构获得配置文件中的属性值
     */
//    @Value("${food.rice}")
//    private String rice;
//
//    @Value("${food.meat}")
//    private String meat;

    @Autowired
    private FoodConfig foodConfig;


    @RequestMapping("/json")
    public Food json(){
        Food food = new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        return food;
    }
}
