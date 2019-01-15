package io.javabrains.springbootData.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.javabrains.springbootData.model.Passenger;

public interface PassengerRepository extends MongoRepository<Passenger, String> {


}
