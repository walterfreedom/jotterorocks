package com.ferret.mcserverlog.walter;

import com.ferret.mcserverlog.model.user;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class userService {
    public List<user> GetUsers(){
        return List.of(new user(1l,"ferret","poggers","joe"));
    }
}
