package entities;

public class OrdermItem {
	private int quantity;
	private double price;
	
	private Product product = new Product();
	
	public double subTotal() {
		return this.price;
	}
	
	public OrdermItem() {
		
	}
	
	
	public OrdermItem(int quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = quantity*product.getPrice();
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return product.getName()+", $"+product.getPrice()+" Quantity: "+quantity+" subTotal: $"+subTotal() ;
	}

	
	
	
}
