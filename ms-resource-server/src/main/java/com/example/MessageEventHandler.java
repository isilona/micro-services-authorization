package com.example;

import java.util.Date;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler(Message.class)
public class MessageEventHandler {

	@HandleBeforeCreate
	public void beforeCreate(Message message) {
		message.createdAt = new Date();
		message.username = SecurityContextHolder.getContext().getAuthentication().getName();
	}
}
