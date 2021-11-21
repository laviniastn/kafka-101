package com.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.producer.model.Message;

@RestController
@RequestMapping("kafka")
public class MsgController {

	@Autowired
	private KafkaTemplate<String, Message> kafkaTemplate;

	private static final String TOPIC = "kafka_json";

	@PostMapping(value = "/post", consumes = { "application/json" }, produces = { "application/json" })
	public String post(@RequestBody Message msg) {

		kafkaTemplate.send(TOPIC, msg);

		return "Message published successfully";
	}
}