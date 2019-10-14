package com.spring.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.app.model.Passengger;

@Repository
public interface PassengerRepository extends JpaRepository<Passengger, Integer> {

}
