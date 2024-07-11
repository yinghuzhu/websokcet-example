package name.yzhu.example.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping("/heartbeat")
    @SendTo("/topic/heartbeat")
    public String heartbeat(String message) {
        return "Heartbeat received: " + message;
    }
}
