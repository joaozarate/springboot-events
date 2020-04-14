package com.zarate.event.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zarate.event.service.ViaAemiliaService;

@Controller
public class Battle {
	
	@Autowired
	private ViaAemiliaService service;

	@GetMapping("/war")
	@ResponseBody
	public void war() {

		service.moveTroops();
		
	}

}
