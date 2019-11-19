package com.bluecollar.springbootdemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class IndexController {
    @RequestMapping("/index")
    public String test() {
        return "hello ! XF~s";
    }
}
