package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufacture;
	
	public UsedProduct() {super();}

	public UsedProduct(String name, Double price, Date manufacture) {
		super(name, price);
		this.manufacture = manufacture;
	}

	public Date getManufacture() {
		return manufacture;
	}

	public void setManufacture(Date manufacture) {
		this.manufacture = manufacture;
	}
	
	public final String priceTag() {
		return name + "(used) $ " + String.format("%.2f", price) + 
				" (Manufacture date: " + sdf.format(manufacture) + ")";
	}
	

}
