package com.qq.mallmgt.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by hyq on 2024-8-1 10:54.
 */
@RestController
@RequestMapping("")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "success";
    }
}
