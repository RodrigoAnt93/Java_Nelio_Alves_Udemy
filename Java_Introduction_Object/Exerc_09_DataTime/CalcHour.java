package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalcHour {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("1993-08-06");
		LocalDateTime d02 = LocalDateTime.parse("1993-08-06T01:30:26");
		Instant d03 = Instant.parse("1993-08-06T01:30:26Z");	
		
		LocalDate pastWeekLocalDate = d01.minusDays(7);
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
		
		Instant pastWeekLocalDateInstant = d03.plus(7, ChronoUnit.DAYS);
		Instant nextWeekLocalDateInstant = d03.minus(7, ChronoUnit.DAYS);
		
		System.out.println(pastWeekLocalDate);
		System.out.println(nextWeekLocalDate);
		System.out.println();
		System.out.println(pastWeekLocalDateTime);
		System.out.println(nextWeekLocalDateTime);
		System.out.println();
		System.out.println(pastWeekLocalDateInstant);
		System.out.println(nextWeekLocalDateInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d02);
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
		Duration t3 = Duration.between(nextWeekLocalDateInstant, d03);

		
		System.out.println();
		System.out.println(t1.toDays());
		System.out.println(t2.toDays());
		System.out.println(t3.toDays());
	}

}
