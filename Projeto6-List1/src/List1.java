import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<>(); 
		
		list.add("Maria");
		list.add("Pedro");
		list.add("Paulo");
		list.add("Ana");
		list.add(2, "Marco");
		list.remove(1);	
		list.removeIf(x -> x.charAt(0)=='M');
		System.out.println(list.size());
		for(String x : list) {
			
			System.out.println(x.indexOf(x)+x);
		}

	}

}
