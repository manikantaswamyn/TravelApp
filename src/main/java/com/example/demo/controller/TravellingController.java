package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TravellingModel;
import com.example.demo.service.TravellingService;

@RestController

//manikanta swamy namana

@RequestMapping("/travel")
public class TravellingController {
	
	@Autowired
	TravellingService service;
	@GetMapping("/journey")
	public Iterable<TravellingModel> fetchCarPrices(@RequestParam  String source,  @RequestParam  String destination){
		System.out.println("--source---"+source);
		System.out.println("--dest---"+destination);

		return service.getCarPrices(source, destination);
    }
	
	@GetMapping("/prices")
	public Iterable<TravellingModel> fetchAllCarPrices(){
		

		return service.getAllCarPrices();
    }
	

}
