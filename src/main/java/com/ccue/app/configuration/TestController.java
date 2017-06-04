package com.ccue.app.configuration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zk on 17.6.4.
 */
@Controller
@RequestMapping("/")
public class TestController {

    @RequestMapping("index")
    public String testRequest() {
        System.out.println("request");
        return "index";
    }
}
