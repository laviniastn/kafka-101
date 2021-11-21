package com.kafka.consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.kafka.consumer.model.*;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics = "kafka", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
	
	@KafkaListener(topics = "kafka_json", groupId = "group_json",
            containerFactory = "messageKafkaListenerFactory")
    public void consumeJson(Message message) {
        System.out.println("Consumed JSON Message: " + message);
    }

}
