package tutorial_1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public abstract class Employee {
private String name;
private int age;
private String gender;
private String address;


	
public Employee(String name, int age, String gender, String address) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.address = address;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getGender() {
	return gender;
}


public void setGender(String gender) {
	this.gender = gender;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


// thời gian chấm công -> trả ra success or fails
public boolean checkTimeKeeping(LocalTime time) {
		return this.validateTimeKeeping(time);
		
	}

public void checkWorkingDay(DayOfWeek date) {
	if(this.validateWorkingDay(date)) {
		System.out.println("This is a Working day");
	}
	else{
		System.out.println("This is NOT a working day");
		};
}
	
abstract protected boolean validateTimeKeeping(LocalTime date);

abstract protected boolean validateWorkingDay(DayOfWeek date) ;


@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
}


}

