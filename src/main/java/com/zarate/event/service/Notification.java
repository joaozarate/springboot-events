package com.zarate.event.service;

import org.springframework.stereotype.Component;

@Component
public class Notification {
	
	public void notifyMessage(String message) {
		System.out.println("The " + message + " was moved.");
	}

}
