package com.supriya.java.notes;

public class MyFirstCode {

	public String human = "Female";
	public int age = 28;
	public double height = 5.6;

	public String empName;
	public int salay;

	public static void main(String[] args) {

		System.out.println("learning what is class >> class is a blue print "
				+ "and it is a combination of variables and menthods");

		MyFirstCode myCode = new MyFirstCode();
		System.out.println(myCode.human);
		System.out.println(myCode.age);
		System.out.println(myCode.height);

		System.out.println(myCode.empName);// print null
		System.out.println(myCode.salay);// print 0
	}

}
