package buoi3.main;

public class Employee {
	private String name;
	
	private Double monthlySalary;
	
	private Integer numberOfWorkDays;
	
	protected final Integer TOTAL_WORK_DAYS = 26;
	
	public Double getSalary() {
		Double salary = (monthlySalary / TOTAL_WORK_DAYS) * numberOfWorkDays;
		return salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(Double monthlySalary) {
		if (monthlySalary == null) {
			this.monthlySalary = 0.0;
			return;
		}
		this.monthlySalary = monthlySalary;
	}

	public Integer getNumberOfWorkDays() {
		return numberOfWorkDays;
	}

	public void setNumberOfWorkDays(Integer numberOfWorkDays) {
		this.numberOfWorkDays = numberOfWorkDays;
	}

}
