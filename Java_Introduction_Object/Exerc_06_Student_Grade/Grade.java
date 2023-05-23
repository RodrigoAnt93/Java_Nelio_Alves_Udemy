package entities;

public class Grade {
	public String nome;
	public double grade_one;
	public double grade_two;
	public double grade_three;
	
	public double evaluate_grade() {
		double total = grade_one + grade_two + grade_three;
		return total;
	}

}
