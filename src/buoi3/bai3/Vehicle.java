package buoi3.bai3;

public class Vehicle {
	private String brand;
	
	private String model;
	
	private String year;
	
	public void getVehicleInfomation() {
		System.out.println("brand = " + brand + ", model = " + model + ", year "+ year);
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
}
