package tutorial_1;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Staff extends Employee {
	private String currentTask;
	public Staff(String name, int age, String gender, String address, String currentTask) {
		super(name, age, gender, address);
		// TODO Auto-generated constructor stub
		this.currentTask = currentTask;
	}
	
	public String getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(String currentTask) {
		this.currentTask = currentTask;
	}

	@Override
	protected boolean validateTimeKeeping(LocalTime time) {
		// TODO Auto-generated method stub
		System.out.println(time);
		LocalTime startTime = LocalTime.of(8, 30);
		LocalTime endTime = LocalTime.of(17, 30);
		return time.compareTo(startTime)>=0&&time.compareTo(endTime)<=0;
	}

	@Override
	protected boolean validateWorkingDay(DayOfWeek date) {
		// TODO Auto-generated method stub
		return !date.equals(DayOfWeek.SUNDAY);
	}

	@Override
	public String toString() {
		return "Staff [currentTask= " + currentTask +" name= "
	+this.getName()+" age= "+this.getAge()+" gender= "
	+this.getGender()+" address= "+this.getAddress()
	+" current_task= "+this.currentTask+ "]";
	}

}
