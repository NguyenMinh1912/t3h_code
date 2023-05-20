package buoi3.bai3;

public class Car extends Vehicle {

	private Integer numberOfSeats;
	
	public Car(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public void getVehicleInfomation() {
		super.getVehicleInfomation();
		System.out.println("Số chỗ ngồi " + numberOfSeats);
	}
	
	public Integer getNumberOfSeats() {
		return this.numberOfSeats;
	}

	@Override
	public String toString() {
		return "Car [numberOfSeats=" + numberOfSeats + "]";
	}
	
	
	
}
