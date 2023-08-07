package com.codestates.github_test.testController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/")
    public String rootAPI() {
        return "Test Git branch dev to main";
    }
}
