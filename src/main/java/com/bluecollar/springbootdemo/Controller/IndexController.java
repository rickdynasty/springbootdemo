package com.bluecollar.springbootdemo.Controller;

import com.bluecollar.springbootdemo.pojo.User;
import com.bluecollar.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Controller
@RestController
public class IndexController {
    @Autowired
    UserService userService;

    @GetMapping("/show")
    public List<User> getUser(int age) {
        return userService.getUser(age);
    }

    @RequestMapping("/index")
    public Map<String, String> Index() {
        Map map = new HashMap<String, String>();
        map.put("北京", "北方城市");
        map.put("深圳", "南方城市");
        return map;
    }
}
