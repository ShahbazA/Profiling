package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/api/home")
public class MyController {

    @GetMapping(value = "/dev")
    public @ResponseBody
    String test(){
        return "Dev";
    }

    @GetMapping("/local")
    public String hello() {
        return "Local";
    }

    @PostMapping("/post-method")
    public ResponseEntity<String> postMethod(@RequestBody String str) {
        return ResponseEntity.ok(str);
    }

}