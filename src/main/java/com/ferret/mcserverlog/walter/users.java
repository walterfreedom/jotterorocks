package com.ferret.mcserverlog.walter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class users {
    @GetMapping("/users")
    public List<String> users(){
        return List.of("jottero","kiwi");
    }
}
