package GymManagement;

import gym.*;

public class studentMember extends defaultMember {

	String SchoolName;
	String Grade;
	
	public studentMember(String Name,int Id, String Address, int phoneNo, String School, String Grade) {
		
	super(Name,Id,Address,phoneNo);
	this.SchoolName = School;
	this.Grade = Grade;
	}
	
	public String getSchoolName() {
		return SchoolName;
		
	}
	public void setSchoolName(String School) {
		this.SchoolName = School;
	}
	
	public String getGrade() {
		return Grade;
		
	}
	public void setGrade(String Grade) {
		this.Grade = Grade;
	}
}
