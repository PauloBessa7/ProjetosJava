package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderStatus;
import entities.OrdermItem;
import entities.Product;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (dd/MM/yyyy): ");
		DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(sc.next(),fmt);
		
		Client c1 = new Client(name,email,date);
		System.out.println();
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		System.out.print("How many itens to this order? : ");
		Integer n = sc.nextInt();
		
		LocalDate now = LocalDate.now();
		Order ordem = new Order(now,status);
		
		for(int i=0 ; i<n ; i++) {
			System.out.println("Enter #"+(i+1)+" item data: ");
			System.out.print("Product name: ");
			String nameProc = sc.next();
			System.out.print("Product price: ");
			double priceProc = sc.nextDouble();
			System.out.print("Product quantity: ");
			int quantityProc = sc.nextInt();
			System.out.println();
			Product product = new Product(nameProc,priceProc);
			OrdermItem orderProduct = new OrdermItem(quantityProc,priceProc,product);
			ordem.addItem(orderProduct);
		}
		System.out.println();
		System.out.println("Order Summary: ");
		System.out.println("Ordem moment "+ordem.getDate().format(fmt));
		System.out.println("Order Status: "+ordem.getStatus());
		System.out.println("Client: "+c1.getName()+" "+c1.getDate().format(fmt)+" - "+c1.getEmail());
		System.out.println("Ordem Itens: ");
		System.out.println(ordem.toString());
		System.out.println("Total Price: $"+String.format("%.2f", ordem.total()));
		
		
	}

}
