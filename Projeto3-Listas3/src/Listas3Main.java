import java.util.Scanner;

public class Listas3Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Digite um número: ");
			a[i] = sc.nextInt();
		}
		System.out.println("Os valores negativos foram: ");
		for(int i = 0 ; i<a.length;i++) {
			if(a[i]<0) {
				System.out.println(a[i]);
			}
		}
		sc.close();
	}

}
