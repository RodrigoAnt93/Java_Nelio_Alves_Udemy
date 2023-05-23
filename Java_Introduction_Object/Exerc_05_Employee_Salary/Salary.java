package entities;

public class Salary {
	public String name;
	public double gross_salary;
	public double tax;
	
	public double net_salary() {
		return gross_salary - tax;}
	
	public void increase_salary(double percentage) {
		gross_salary += gross_salary / 100 * percentage;}
}
