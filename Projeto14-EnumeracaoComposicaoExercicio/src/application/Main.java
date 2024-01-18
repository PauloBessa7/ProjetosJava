package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Departamento;
import entities.HoraContrato;
import entities.Senioridade;
import entities.Trabalhador;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter department`s name: ");
		Departamento department = new Departamento(sc.next());
		// String department = sc.next(); --> forma diferente
		System.out.println("Enter the worker data: ");
		System.out.printf("name: ");
		String name = sc.next();
		System.out.printf("Level: ");
		Senioridade level = Senioridade.valueOf(sc.next());
		// String level = sc.next(); --> forma diferente
		System.out.printf("Base salary: ");
		double baseSalary =sc.nextDouble();
		
		Trabalhador worker = new Trabalhador(name, level, baseSalary, department);
		// Trabalhador worker = new Trabalhador(name, Senioridade.valueOf(level), baseSalary, new Departamento(department)); --> forma diferente
		
		System.out.printf("How many contracts to this worker? ");
		int num_contracts = sc.nextInt();
		for(int a = 0 ; a<num_contracts;a++) {
			System.out.println("\nEnter contract #"+(a+1)+" data: ");
			System.out.printf("Date: (dd/MM/yyyy): ");
			String dateString = sc.next();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			System.out.printf("Value per hour ");
			double valuePerHour = sc.nextDouble();
			System.out.printf("Duration : ");
			Integer hour = sc.nextInt();
			
			LocalDate date = LocalDate.parse(dateString, formatter);
			
			HoraContrato contrato = new HoraContrato(date, valuePerHour, hour);
			worker.addContrato(contrato);
			
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculeta income (MM/yyyy): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: "+worker.getNome());
		System.out.println("Departmant: "+worker.getDepartamento().getNome());
		System.out.println("Income for "+monthAndYear+" : $"+String.format("%.2f",  worker.encome(year, month)));
		
		
		
		sc.close();

	}

}
