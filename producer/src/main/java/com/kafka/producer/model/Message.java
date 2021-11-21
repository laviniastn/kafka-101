package com.kafka.producer.model;

public class Message {

	private String name;
	private String content;

	public Message(String name, String content) {
		this.name = name;
		this.content = content;
	}

	public Message() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Message{");
		sb.append("name='").append(name).append('\'');
		sb.append(", content='").append(content).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
