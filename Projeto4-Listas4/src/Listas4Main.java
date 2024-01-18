import java.util.Scanner;

public class Listas4Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serão digitadas");
		int n = sc.nextInt();
		
		Pessoa[] pessoa = new Pessoa[n];
		
		for(int i = 0 ; i<pessoa.length;i++) {
			System.out.println("Dados da "+(i+1)+"a pessoa:");
			System.out.println("Nome:");
			String nome = sc.next();
			System.out.println("Idade:");
			int age = sc.nextInt();
			System.out.println("Altura:");
			double altura = sc.nextDouble();
			pessoa[i] = new Pessoa(nome,age,altura);
		}
		sc.close();
		double porcMenor16 = 0;
		double medAltura = 0.0;
		for(int i = 0 ; i<pessoa.length;i++) {
			if(pessoa[i].getAge()<16) {
				porcMenor16+=1;
			}
			medAltura+=pessoa[i].getHeight();
		}
		medAltura/=n;
		porcMenor16=(porcMenor16/n)*100;
		System.out.printf("Altura média : %.2f",medAltura);
		System.out.println("\nPessoas com menos de 16 anos : "+porcMenor16+"%");
		
	}

}
