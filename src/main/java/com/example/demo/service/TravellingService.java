package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TravellingDao;
import com.example.demo.model.TravellingModel;

@Service
public class TravellingService {
	 
	@Autowired
    TravellingDao trdao;	
	public Iterable<TravellingModel> getCarPrices(String source,String destination){
		System.out.println("--source---"+source);
		System.out.println("--dest---"+destination);
		return trdao.findBySourceAndDestination(source,destination);		
	}
	
	public Iterable<TravellingModel> getAllCarPrices(){
		return trdao.findAll();		
	}

}
