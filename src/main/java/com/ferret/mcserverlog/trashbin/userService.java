package com.ferret.mcserverlog.trashbin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class userService {
    private final userRepo userRepo;
    @Autowired
    public userService(com.ferret.mcserverlog.trashbin.userRepo userRepo) {
        this.userRepo = userRepo;
    }


    public List<user> GetUsers(){
        return userRepo.findAll();
    }
}
