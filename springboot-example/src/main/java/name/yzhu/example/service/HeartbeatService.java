package name.yzhu.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class HeartbeatService {

    @Autowired
    private SimpMessagingTemplate template;

    @Scheduled(fixedRate = 5000) // 每5秒发送一次心跳
    public void sendHeartbeat() {
        template.convertAndSend("/topic/heartbeat", "ping");
    }
}
