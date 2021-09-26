package com.peyzhang.swaggerfinasj.contrul;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author peyzhang
 * @Date 9/22/2021 9:33 AM
 * @description:
 */
@RestController
public class HelloWordContrul {
    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello";
    }

}
