package com.adelmo.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by znb on 17-9-8.
 */

@Controller
@SpringBootApplication
public class Application {

    @ResponseBody
    @RequestMapping("/")
    public String home() {
        return "hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
