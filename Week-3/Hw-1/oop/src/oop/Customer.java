package oop;

public class Customer {
	private int id;
	private String city;
	
	public Customer() {
		System.out.println("Müþteri Nesnesi Baþlatýldý.");
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getId() {
		return id;
	}
	
	public String getCity() {
		return city;
	}
}
