import java.util.Scanner;

public class Matriz2Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int c = sc.nextInt();
		int mat[][] = new int[l][c];
		
		for(int i = 0 ; i<l ; i++) {
			for(int k = 0 ; k<c ; k++) {
				mat[i][k]=sc.nextInt();
			}
		}
		
		int pos = sc.nextInt();
		
		for(int i = 0 ; i<l ; i++) {
			for(int k = 0 ; k<c ; k++) {
				if(mat[i][k]==pos) {
					System.out.println("Posiçao "+i+","+k);
					if(k>0) {
						System.out.println("Esquerda: "+mat[i][k-1]);
					}
					if(k<2) {
						System.out.println("Direita: "+mat[i][k+1]);
					}
					if(i>0) {
						System.out.println("Cima: "+mat[i-1][k]);
					}
					if(i<2) {
						System.out.println("Baixo: "+mat[i+1][k]);
					}
					
				}
			}
		}
		
		
	}

}
