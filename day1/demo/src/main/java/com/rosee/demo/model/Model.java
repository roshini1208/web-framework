package com.rosee.demo.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Model 
{
    @GetMapping("/welcome")
    public String mess()
    {
        return "hi roshini";
    }
}
