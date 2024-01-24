package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Post;
import entities.comment;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		comment c1 = new comment("Tenha uma boa viagem!");
		comment c2 = new comment("Wow, incrivel");
		
		LocalDateTime date = LocalDateTime.parse("21/06/2018 13:05",fmt);
		
		Post p1 = new Post(date,"Viajando para Indonésia","Vou visitar esse país foda",12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1.toString());
		
		comment c3 = new comment("Poderia ser para os Estados Unidos");
		comment c4 = new comment("Massa demais");
		
		LocalDateTime date2 = LocalDateTime.parse("21/06/2018 13:05",fmt);
		
		Post p2 = new Post(date2,"Viajando o Brasil","Vou visitar esse país legal demais",122);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println();
		
		System.out.println(p2.toString());
		
		

	}

}
