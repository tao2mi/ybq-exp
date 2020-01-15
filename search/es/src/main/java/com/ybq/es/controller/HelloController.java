package com.ybq.es.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 87661
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/hello")
    public Object hello() {
        return "hello";
    }
}
