package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @RequestMapping("/info")
    @ResponseBody
    public String info(HttpServletRequest request) {

        return "welcome to chongqing";

    }

    @RequestMapping("/eat")
    @ResponseBody
    public String eat(HttpServletRequest request) {

        return "I am eating.";

    }

}
