package com.ferret.mcserverlog.trashbin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/users")
public class UsersController {
    private final userService userService;

    @Autowired
    public UsersController(userService userService){
        this.userService = userService;

    }
    @GetMapping()
    public List<user> users(){
        return userService.GetUsers();
    }
}
