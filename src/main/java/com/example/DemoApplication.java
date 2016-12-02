package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping(value = "/success", method = RequestMethod.GET)
    public Object success() {
        return ApiResult.createSuccessResult("oh my god,success!");
    }

    @RequestMapping(value = "/fail", method = RequestMethod.GET)
    public Object fail() {
        return ApiResult.createErrorResult("oh my god,error!");
    }

    @RequestMapping(value = "/noLogin", method = RequestMethod.GET)
    public Object noLogin() {
        return ApiResult.createNoLoginResult();
    }
}
