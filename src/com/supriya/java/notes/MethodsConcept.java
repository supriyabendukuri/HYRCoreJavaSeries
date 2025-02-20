package com.supriya.java.notes;

public class MethodsConcept {

	static int currentBalence = 5000;

	public void depositAmount(int amount) {
		currentBalence = currentBalence + amount;
		System.out.println("Amount deposit successfully");

	}

	public void withdrawnAmount(int amount) {
		currentBalence = currentBalence - amount;
		System.out.println("Amount withdrawn successfully");

	}

	public static int getCurrentBalence() {
		return currentBalence;

	}

	public static void main(String[] args) {
		System.out.println(getCurrentBalence());
		MethodsConcept methodConcept = new MethodsConcept();
		methodConcept.depositAmount(1000);
		System.out.println(getCurrentBalence());
		methodConcept.withdrawnAmount(2000);
		System.out.println(getCurrentBalence());
	}

}
