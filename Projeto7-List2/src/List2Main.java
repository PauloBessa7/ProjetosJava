import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Funcionarios;
public class List2Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionarios> funcionario = new ArrayList<>();
		
		System.out.printf("Quantos funcionários vão ser? ");
		int a = sc.nextInt();
		for(int i=0 ; i<a ; i++) {
			System.out.println("\nFuncionário #"+(i+1));
			System.out.printf("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.printf("Name: ");
			String name = sc.nextLine();
			System.out.printf("Salário: R$");
			double salario = sc.nextDouble();
			
			Funcionarios func = new Funcionarios(id,name,salario);
			
			funcionario.add(func);
		}
		System.out.printf("Diigite o id do funcionarios que vai ter o salário aumentado: ");
		int idFunc = sc.nextInt();
		Integer pos = posicao(funcionario,idFunc);
		if( pos==null ) {
			System.out.println("Esse funcionario nao existe");
		}else {
			System.out.printf("Digite a porcentagem %%");
			int percent = sc.nextInt();
			
			funcionario.get(pos).aumentoSalario(percent);
		}
		
		System.out.println("\n\nLista de funcionarios");
		for(Funcionarios func : funcionario) {
			System.out.println(func);
		}
		
		sc.close();
	}
	
	public static Integer posicao(List<Funcionarios> list, int id) {
		for(int i = 0 ; i<list.size(); i++) {
			if(list.get(i).getId()==id) {
				return i;
			}
		}
		return null;
	}
}
