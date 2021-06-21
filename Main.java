package tutorial_1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
//LocalDate date = LocalDate.of(2021, 6, 21);
//DayOfWeek day = date.getDayOfWeek();
//System.out.println(Arrays.toString(day.values()));;
//LocalDateTime localDateTime = LocalDateTime.now();
//DayOfWeek dayOfWee = localDateTime.getDayOfWeek();
//System.out.println(dayOfWee);
//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");		
//System.out.println(localDateTime.format(formatter));;
		
// test for engineer
Engineer eng = new Engineer("engineer a", 36,"male","address a","IT");
System.out.println(eng);
boolean isValidTimeKeeping = eng.checkTimeKeeping(LocalTime.of(9, 33));
System.out.println("valid time for engineer  "+isValidTimeKeeping);
boolean isNotValidTimeKeeping = eng.checkTimeKeeping(LocalTime.of(20, 33));
System.out.println("invalid time for engineer  "+isNotValidTimeKeeping);
eng.checkWorkingDay(DayOfWeek.MONDAY);
eng.checkWorkingDay(DayOfWeek.SATURDAY);

System.out.println("******************************************************");
// test for Worker 
Worker worker = new Worker("Worker a",40,"female","address b",3);
System.out.println(worker);
isValidTimeKeeping = worker.checkTimeKeeping(LocalTime.of(22, 0));
System.out.println("valid time for worker  "+isValidTimeKeeping);
isNotValidTimeKeeping =eng.checkTimeKeeping(LocalTime.of(7, 33));
System.out.println("invalid time for worker  "+isNotValidTimeKeeping);
worker.checkWorkingDay(DayOfWeek.SATURDAY);
worker.checkWorkingDay(DayOfWeek.SUNDAY);
System.out.println("******************************************************");
// test for staff
Staff staff = new Staff("Staff a",32,"femake","address c","cleaning");
System.out.println(staff);
isValidTimeKeeping = staff.checkTimeKeeping(LocalTime.of(8, 30));
System.out.println("valid time for staff  "+isValidTimeKeeping);
isNotValidTimeKeeping= staff.checkTimeKeeping(LocalTime.of(17, 31));
System.out.println("invalid time for staff  "+isNotValidTimeKeeping);
staff.checkWorkingDay(DayOfWeek.FRIDAY);
staff.checkWorkingDay(DayOfWeek.SATURDAY);
staff.checkWorkingDay(DayOfWeek.SUNDAY);






	}
}
