package com.alp54.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alp54.domain.Hello;

@RestController("/hello")
public class HelloController {
    
    private static long id = 0;

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Hello getHello(@RequestParam(value="message", required=false, defaultValue="hello world!") String message) {
        return new Hello(id++, message);
    }

}