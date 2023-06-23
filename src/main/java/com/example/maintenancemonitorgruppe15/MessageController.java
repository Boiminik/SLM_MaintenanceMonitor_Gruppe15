package com.example.maintenancemonitorgruppe15;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    String message = "Everything works as expected"; //default message

    @RequestMapping("/api/message")
    public String showMessage(){ //displays the chosen message
        return message;
    }
}
