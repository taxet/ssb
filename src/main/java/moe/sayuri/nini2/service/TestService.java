package moe.sayuri.nini2.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    public String helloWorld() {
        return "{\"tag\": \"Hello World!\"}";
    }
}
