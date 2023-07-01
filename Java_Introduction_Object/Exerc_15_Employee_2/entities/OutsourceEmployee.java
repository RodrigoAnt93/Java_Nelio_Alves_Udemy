package entities;

public class OutsourceEmployee extends Employee {
	
	private Double additionalCharge;
	
	public OutsourceEmployee() {super();}

	public OutsourceEmployee(String name, Integer hour, Double valuePerHour, Double additionalCharge) {
		super(name, hour, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	
	@Override
	public final double payment() {
		return valuePerHour * hour + (additionalCharge / 100 * 110); 
	}
	
	

}
