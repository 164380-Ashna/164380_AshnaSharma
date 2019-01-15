package io.javabrains.springbootData.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Passenger")
public class Passenger {
	@Id
	String id;
	String passengerName; 
	String email;
	String password;
	//Bookings bookings;
	
	public Passenger() {
		super();
	}
	
	
	public Passenger( String id, String passengerName, String email, String password) {
		super();
		
		this.passengerName = passengerName;
		this.email = email;
		this.password = password;
		this.id=id;
	}

	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	 
	
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", passengerName=" + passengerName + ", email=" + email + ", password="
				+ password + ", bookings=]";
	}
	

}
