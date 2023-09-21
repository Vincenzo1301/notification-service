package hm.edu.notification.service.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @KafkaListener(topics = "order", groupId = "notification")
    public void listenTopicOrder(ConsumerRecord<String, String> record) {
        String message = record.value();
        long timestamp = record.timestamp();

        System.out.println("Received Message: " + message);
        System.out.println("Timestamp: " + timestamp);
    }
}
