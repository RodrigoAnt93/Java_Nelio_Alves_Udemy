package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Client client;
	private Date moment;
	private OrderStatus status;
	
	private List<OrderItem> orderItem = new ArrayList<OrderItem>();
	
	public Order() {}

	public Order(Client client, Date moment, OrderStatus status) {
		this.client = client;
		this.moment = moment;
		this.status = status;
		
	}
	

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}
	
	public void addItem(OrderItem oi) {
		orderItem.add(oi);
	}
	
	public void removeItem(OrderItem oi) {
		orderItem.remove(oi);
	}
	
	public double total() {
		double total = 0;
		for (OrderItem c : orderItem) {
			total += c.subTotal();
		}
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + sdf2.format(moment) + "\n");
		sb.append("Order status: " + this.status + "\n");
		sb.append("Client: " + client.getName() + "(" + sdf.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
		sb.append("Order items: \n");
		for (OrderItem c : orderItem) {
			sb.append(c.getProduct().getName() + ", $" + c.getPrice() + ", Quantity: " + c.getQuantity() + ", Subtotal: $" + c.subTotal() + "\n");
		}
		sb.append("Total price $" + total());
		return sb.toString();
	}
	


}
