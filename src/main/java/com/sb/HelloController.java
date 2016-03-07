package com.sb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sujal on 3/3/2016.
 */

@Controller
public class HelloController {

    @RequestMapping("/test")
    @ResponseBody
    public String hello(){
        System.out.println("TEsting this");
        return "Hello world";
    }

    @RequestMapping("/result")
    public String getResultPage(){
        return "resultPage";
    }
}
