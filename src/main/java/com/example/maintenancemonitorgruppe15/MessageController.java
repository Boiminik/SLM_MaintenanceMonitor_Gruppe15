package com.example.maintenancemonitorgruppe15;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    String message = "Everything works as expected"; //default message
    String currentMessage= message;

    @RequestMapping("/api/message")
    public String showMessage(){ //displays the chosen message
        return currentMessage;
    }

    @RequestMapping("/api/message/set")
    public String setMessage(@RequestParam String customMessage){ //changes currentMessage to the desired message
        currentMessage= customMessage;
        return "ok";
    }

    @RequestMapping("/api/message/reset")
    public String resetMessage(){
        currentMessage = message; //resets any set custom message to the default message; does nothing if already default
        return "ok";
    }


}
