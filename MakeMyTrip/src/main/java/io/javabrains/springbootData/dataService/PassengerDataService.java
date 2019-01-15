package io.javabrains.springbootData.dataService;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootData.model.Passenger;
import io.javabrains.springbootData.repository.PassengerRepository;

@RestController
public class PassengerDataService {


	/*private MongoOperations mongoOps;*/
	private static final String PASSENGER_COLLECTION = "Passenger";
	
	/*public PassengerDAOImpl(MongoOperations mongoOps){
		this.mongoOps=mongoOps;
	}
	*/
	@Autowired
	private PassengerRepository passengerDAO;
	
	@RequestMapping(method=RequestMethod.POST, value="passenger/create")
	public void addPassenger(@RequestBody Passenger passenger) {
		passengerDAO.save(passenger);
		
	}
	
	/*public List<Passenger> getAllPassenger() {
		return this.mongoOps.findAll(Passenger.class, PASSENGER_COLLECTION);
	} 
	*/
	@RequestMapping(method=RequestMethod.GET, value="passenger/get/{id}")
	public Optional<Passenger> getPassenger(@PathVariable String id) {
		return passengerDAO.findById(id);
	}
	/*
	public void updatePassenger(Passenger passenger) {
		this.mongoOps.save(passenger, PASSENGER_COLLECTION);
	}
	
	public void deletePassenger(int id) {
		Query query = new Query(Criteria.where("_id").is(id));
		this.mongoOps.remove(query, Passenger.class, PASSENGER_COLLECTION);	
	} 

}
*/
}
