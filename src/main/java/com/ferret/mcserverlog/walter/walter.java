package com.ferret.mcserverlog.walter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.*;
import java.util.Scanner;
@Controller
public class walter {

    @RequestMapping("/walter")
    public String getWalter(Model theModel) throws FileNotFoundException {
        //😎
        String data = "";
        File file = new File("/home/opc/paperserver/logs/latest.log");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine())
            data = data+"\n"+sc.nextLine();
        data= data.replaceAll("\\d*\\.\\d*\\.\\d*\\.\\d*", "[REDACTED]");
        data= data.replaceAll("\\[\\d*:\\d*:\\d*\\]*", "\n");

        theModel.addAttribute("verycoolattribute", data);
        return "pog";
    }
}
