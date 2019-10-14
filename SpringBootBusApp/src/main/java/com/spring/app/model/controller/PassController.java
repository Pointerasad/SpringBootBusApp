package com.spring.app.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.model.Passengger;
import com.spring.app.service.PassService;

@RestController
public class PassController {
    @Autowired
	private PassService passService;
    
    @PostMapping(value = "/create")
    public Passengger createPassengger(@RequestBody Passengger passengger) {
    	return passService.createPassengger(passengger);
    }
}
