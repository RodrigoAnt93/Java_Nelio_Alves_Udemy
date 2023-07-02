package entities;

public class Corporete extends Person{
	
	private int employeeNumbers;
	
	public Corporete() {super();}

	public Corporete(String name, Double annualIncome, int employeeNumbers) {
		super(name, annualIncome);
		this.employeeNumbers = employeeNumbers;
	}

	public int getEmployeeNumbers() {
		return employeeNumbers;
	}

	public void setEmployeeNumbers(int employeeNumbers) {
		this.employeeNumbers = employeeNumbers;
	}

	@Override
	public double tax() {
		if (employeeNumbers > 10) {
			return annualIncome / 100 * 14;
		}
		else {
			return annualIncome / 100 * 16;
		}
	}

}
