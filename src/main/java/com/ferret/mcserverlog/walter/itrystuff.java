package com.ferret.mcserverlog.walter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class itrystuff {

    @RequestMapping(value = "/mac",method = RequestMethod.POST)
    public String calculate(@ModelAttribute macmodel macmodel){

        return "mac";
    }
}
