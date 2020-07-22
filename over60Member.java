package GymManagement;

import gym.*;

public class over60Member extends defaultMember {

	int Age;
	
	public over60Member(String Name,int Id, String Address, int phoneNo, int Age) {
		
		super(Name,Id,Address,phoneNo);
		this.Age=Age;
		}
	
	public int getAge() {
		return Age;
		
	}
	public void setAge(int age) {
		this.Age = age;
	}
}
