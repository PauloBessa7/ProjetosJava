import java.util.Scanner;

public class Listas5Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos quartos vão ser alugados? ");
		int n = sc.nextInt();
		sc.nextLine();
		Quartos[] quarto = new Quartos[10];
		
		for(int i = 0 ; i<n ; i++) {
			System.out.println("\nRent#"+(i+1));
			
			System.out.printf("Name:");
			String name = sc.nextLine();
			
			
			System.out.printf("Email:");
			String email = sc.next();
			
			
			System.out.printf("Room:");
			int room = sc.nextInt();
			sc.nextLine();
			quarto[room] = new Quartos(name,room,email);
		}
		
		System.out.println("Quartos ocupados:");
		for(int i = 0 ; i<quarto.length ; i++) {
			if(quarto[i]!=(null)) {
				System.out.printf("\n%d: %s, %s",quarto[i].getNumeroQuarto(),quarto[i].getNome(),quarto[i].getEmail());
			}
		}
		
		sc.close();
	}

}
