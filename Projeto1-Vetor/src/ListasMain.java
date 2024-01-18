import java.util.Locale;
import java.util.Scanner;

public class ListasMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double med = 0.0;
		for(int i=0;i<n;i++) {
			vect[i] = sc.nextDouble();
			med+=vect[i];
		}
		med/=n;
		System.out.println("========= Os valores foram =======");
		for(int i=0;i<n;i++) {
			System.out.println((i+1)+" - "+vect[i]);
		}
		System.out.println("========= A Média foi "+med+" =======");
		sc.close();
	}

}
