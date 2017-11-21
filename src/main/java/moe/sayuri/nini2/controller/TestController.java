package moe.sayuri.nini2.controller;

import moe.sayuri.nini2.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nini")
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/test")
    public String test(){
        return testService.helloWorld();
    }
}
