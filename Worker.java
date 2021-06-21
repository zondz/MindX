package tutorial_1;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.stream.Stream;

public class Worker extends Employee{
	private int level; 
	
	public Worker(String name, int age, String gender, String address, int level) {
		super(name, age, gender, address);
		// TODO Auto-generated constructor stub
		this.level = level;
	}

	// getter and setter
	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	@Override
	protected boolean validateTimeKeeping(LocalTime time) {
		// TODO Auto-generated method stub
		
	
	boolean checkTime = (time.getHour() >=22  && time.getHour()<= 24)||(time.getHour()>=0&&time.getHour()<=6);
	return checkTime;
	}

	@Override
	protected boolean validateWorkingDay(DayOfWeek date) {
		// TODO Auto-generated method stub
		System.out.println(date);
		return true;
	}

	@Override
	public String toString() {
		return "Worker [level=" + level + " name= "+this.getName()+" age= "+this.getAge()+" gender= "+this.getGender()+" address= "+this.getAddress() +"]";
	}
	

}
