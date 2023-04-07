package com.jsm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsm.service.PriceService;

@RestController
public class PriceController {
	
	@Autowired
	PriceService service;
	
	@GetMapping("/gsprice")
	public List<Double> getPrice() throws InterruptedException{
		return service.getPrice();
	}
}
