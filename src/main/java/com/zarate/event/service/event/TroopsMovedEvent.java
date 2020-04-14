package com.zarate.event.service.event;

public class TroopsMovedEvent {

	private String troop;

	public TroopsMovedEvent(String troop) {
		super();
		this.troop = troop;
	}

	public String getTroop() {
		return troop;
	}

}
