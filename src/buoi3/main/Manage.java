package buoi3.main;

public class Manage extends Employee {
	
	private Double salaryPercent;
	
	public Manage(Double salaryPercent) {
		this.salaryPercent = salaryPercent;
	}
	
	@Override
	public Double getSalary() {
		Double salary = super.getSalary();
		salary += (salary * salaryPercent) / 100;
		return salary;
	}
	
	public Double getSalaryPercent() {
		return salaryPercent;
	}
	
}
