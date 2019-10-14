package com.spring.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.app.model.Passengger;
import com.spring.app.repository.PassengerRepository;

@Service
public class PassService {
    
	@Autowired
	private PassengerRepository passengerRepository;

	public Passengger createPassengger(Passengger passengger) {
		return passengerRepository.save(passengger);
	}
}
