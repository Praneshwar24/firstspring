package constructor.injection;

public class Address {
	String city;
	String state;
	String country;
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String toString() {
		return "City is "+city+"\n"+"State is "+state+"\n Country is "+country;
	}






}
