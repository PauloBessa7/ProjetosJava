import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora1Main {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.now();
		
		Instant d3 = Instant.now();
		
		LocalDate d4 = LocalDate.parse("2022-07-20");
		LocalDateTime d5 = LocalDateTime.parse("2022-07-20T18:05:10.342005100");
		
		Instant d6 = Instant.parse("2022-07-20T18:05:10Z");
		Instant d7 = Instant.parse("2022-07-20T18:05:10-03:00");
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d8 = LocalDate.parse("09/01/2024",f1);
		
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d9 = LocalDateTime.parse("09/01/2024 21:12",f2);
		
		
		LocalDate d10 = LocalDate.of(2024, 9, 12);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
		System.out.println(d8);
		System.out.println(d9);
		System.out.println(d10);
		System.out.println(d11);
	}

}
