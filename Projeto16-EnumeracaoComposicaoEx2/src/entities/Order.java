package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private LocalDate date2 = LocalDate.now();
	private OrderStatus status;
	
	private List<OrdermItem> Itens = new ArrayList<>();

	public Order(LocalDate date, OrderStatus status) {
		this.date2 = date;
		this.status = status;
	}

	public Order() {
	}

	public LocalDate getDate() {
		return date2;
	}

	public void setDate(LocalDate date) {
		this.date2 = date;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrdermItem> getItens() {
		return Itens;
	}

//	public void setItens(List<OrdermItem> itens) {
//		Itens = itens;
//	}
	
	public void addItem(OrdermItem Itens) {
		this.Itens.add(Itens);
	}
	
	public void removeItem(OrdermItem Itens) {
		this.Itens.remove(Itens);
	}
	
	public double total() {
		double soma =0.0;
		for(OrdermItem i : Itens) {
			soma+=i.getPrice();
		}
		return soma;
	}
	
	
	 @Override
	    public String toString() {
	        StringBuilder result = new StringBuilder("Lista de Itens:\n");

	        for (OrdermItem item : Itens) {
	            result.append(item.getProduct().getName()+", $"+item.getProduct().getPrice()+", quantity: "+item.getQuantity()+" subTotal: $"+item.getPrice()+"\n");
	        }

	        return result.toString();
	    }
	
	
}
