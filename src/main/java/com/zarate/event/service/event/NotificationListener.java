package com.zarate.event.service.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.zarate.event.service.Notification;

@Component
public class NotificationListener {
	
	@Autowired
	private Notification notification;

	@EventListener
	public void troopsMovedListener(TroopsMovedEvent event) {
		notification.notifyMessage(event.getTroop());
	}
	
}
