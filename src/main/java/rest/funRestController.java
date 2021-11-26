package rest;

import org.springframework.web.bind.annotation.GetMapping;

public class funRestController {
    @GetMapping("/walter")
    public String walter(){
        return "Walter";
    }
}
