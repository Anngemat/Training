package LearningTim;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;

public class test {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		 LocalDate firstDayOfMonth = LocalDate.of(today.getYear(), today.getMonth(), 1);
		 LocalDate lastDayOfMonth = today.with(TemporalAdjusters.lastDayOfMonth());
		 System.out.println(today);
		 System.out.println(lastDayOfMonth);
	}
}
