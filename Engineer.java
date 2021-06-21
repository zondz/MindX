package tutorial_1;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.stream.Stream;

public class Engineer extends Employee{
	private String branch;
	
	public Engineer(String name, int age, String gender, String address, String branch) {
		super(name, age, gender, address);
		// TODO Auto-generated constructor stub
		this.branch = branch;
	}
	

	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	@Override
	protected boolean validateTimeKeeping(LocalTime time) {
		// TODO Auto-generated method stub
	
		
		boolean checkTime = time.getHour()>=9&&time.getHour()<=18;
		return checkTime;
		
	}

	@Override
	protected boolean validateWorkingDay(DayOfWeek date) {
		// TODO Auto-generated method stub
		System.out.println(date);
		DayOfWeek[] dow = DayOfWeek.values();
		DayOfWeek[] copy = new DayOfWeek[dow.length-2];
		System.arraycopy(dow, 0, copy, 0, copy.length);
//	
		boolean isValidWorkingDay = Stream.of(copy).anyMatch((DayOfWeek day)->{
			return day.equals(date);
			
		});
		return isValidWorkingDay;
	}


	@Override
	public String toString() {
		return "Engineer [branch= " + branch +" name= " +this.getName()+ " age= "+this.getAge()+" address= "+this.getAddress()+ "]" ;
	}


	
}
