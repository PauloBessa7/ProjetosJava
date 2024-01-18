import java.util.Scanner;

public class Matriz1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
				
		int[][] a = new int[i][i];
		
		for(int l = 0 ; l<i ; l++) {
			for (int c = 0 ; c<i ; c++) {
				a[l][c] = sc.nextInt();
			}
		}
		System.out.println("Diagonal principal: ");
		for(int k = 0 ; k<i ; k++){
			System.out.printf("%d ",a[k][k]);
		}
		
		int negativos = 0;
		for(int l = 0 ; l<i ; l++) {
			for (int c = 0 ; c<i ; c++) {
				if(a[l][c]<0) {
					negativos++;
				}
			}
		}
		System.out.println("\nnumeros negativos "+negativos);
	}

}
