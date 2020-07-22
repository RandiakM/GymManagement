package GymManagement;

import gym.*;
import java.util.ArrayList;
import java.util.Scanner;

public class myGymManager implements GymManager{
	private ArrayList<defaultMember> members = new ArrayList<>();

	private Scanner in1 = new Scanner(System.in);
	private Scanner in2 = new Scanner(System.in);
	
	

	@Override
	public void addMember() {

		System.out.println("Enter Name");
		String name = in1.nextLine();
		System.out.println("Enter Member Id");
		int Id = in2.nextInt();
		System.out.println("Enter Address");
		String address = in1.nextLine();
		System.out.println("Enter Phone No");
		int phoneNo = in2.nextInt();

		defaultMember member = new defaultMember(name,Id, address, phoneNo);
		members.add(member);

		//student member add krnwa mn mehema
		//defaultMember member = new studentMember(name, address, phoneNo, School, Grade);

		//over60 member add krnwa mn mehema
		//defaultMember member = new over60Member(name, address, phoneNo, age);
	}

	@Override
	public void listAllMembers() {

	}

	@Override
	public void deleteMember() {

	}

	public static int inInt(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
}
