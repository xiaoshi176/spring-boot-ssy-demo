package com.ssy;

import com.ssy.config.FoodConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @EnableConfigurationProperties({FoodConfig.class})
 * 告诉主程序入口类  要自动引入配置文件   配置文件对应的类作为它的参数
 */


//程序入口，
//声明我们的入口类，并且是springboot项目的
@SpringBootApplication
@EnableConfigurationProperties({FoodConfig.class})
public class DemoApplication {
    public static void main(String[] args) {

        //使用SpringApplication类的静态方法   启动springboot程序
        //方法的参数  程序的入口类   main函数的参数
        SpringApplication.run(DemoApplication.class,args);
    }
}
