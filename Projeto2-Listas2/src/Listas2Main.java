import java.util.Locale;
import java.util.Scanner;

public class Listas2Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		Produtos[] produto = new Produtos[n];
		double avg = 0.0;
		for(int i=0;i<produto.length;i++) {
			String name = sc.next();
			double price = sc.nextDouble();
			produto[i] = new Produtos(name,price);
			avg+=produto[i].getPrice();
		}
		avg/=n;
		
		System.out.printf("A média dos produtos deu $ %.2f",avg);
		sc.close();

	}

}
