package com.ferret.mcserverlog.walter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class walter {
    @GetMapping("/walter")
    public String getWalter(){
        return "walter";
    }
    @GetMapping("/ferret")
    public String getFerret(){
        return  "Ferret";
    }
}
