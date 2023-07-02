package entities;

public class Individual extends Person{
	
	private Double healthSpending;
	
	public Individual() {super();}

	public Individual(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public double tax() {
		if (annualIncome <= 20000.0) {
			if (healthSpending > 0) {
				return (annualIncome / 100 * 15) - (healthSpending / 100 * 50);
			}
			else {
				return annualIncome / 100 * 15;
			}
		}
		else {
			if (healthSpending > 0) {
				return (annualIncome / 100 * 25) - (healthSpending / 100 * 50);
			}
			else {
				return annualIncome / 100 * 25;
			}
		}
	}

}
