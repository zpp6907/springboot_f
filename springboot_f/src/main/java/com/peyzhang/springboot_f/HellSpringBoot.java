package com.peyzhang.springboot_f;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@Controller
public class HellSpringBoot {
    @RequestMapping("/")
    public String hello(HashMap<String, Object> map) {
        map.put("hello","欢迎来到此页面");
        return "CssDemo001";
    }
}
