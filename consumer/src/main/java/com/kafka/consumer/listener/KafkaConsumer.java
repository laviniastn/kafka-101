package com.kafka.consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics = "kafka", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }

}
