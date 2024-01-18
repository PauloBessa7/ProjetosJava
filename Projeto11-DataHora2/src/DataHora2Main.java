import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora2Main {

	public static void main(String[] args) {
		
		LocalDate d4 = LocalDate.parse("2022-07-20");
		LocalDateTime d5 = LocalDateTime.parse("2022-07-20T18:05:10.342005100");
		Instant d6 = Instant.parse("2022-07-20T01:05:10Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("d4 = "+d4.format(fmt1));
		System.out.println("d4 = "+fmt1.format(d4));
		System.out.println("d4 = "+d4.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d5 fmt2 = "+d5.format(fmt1));
		System.out.println("d5 fmt2 = "+fmt2.format(d5));
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		System.out.println("d6 = "+fmt3.format(d6));
	}

}
