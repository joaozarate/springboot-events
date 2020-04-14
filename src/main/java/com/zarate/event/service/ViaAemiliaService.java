package com.zarate.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.zarate.event.service.event.TroopsMovedEvent;

@Component
public class ViaAemiliaService {

	@Autowired
	private ApplicationEventPublisher publisher;

	public void moveTroops() {

		System.out.println("Move your troops.");

		publisher.publishEvent(new TroopsMovedEvent("Anthony's troops"));

	}

}
