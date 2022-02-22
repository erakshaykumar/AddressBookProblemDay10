package com.bridgelabz.addressbookproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	static Scanner scanner = new Scanner(System.in);
	ArrayList<Contact> person = new ArrayList<>();

	// add new person record to array list after taking input

	public void addPerson() {
		System.out.println("Enter the First Name");
		String firstName = scanner.next();
		System.out.println("Enter the Last Name");
		String lastName = scanner.next();
		System.out.println("Enter the Address");
		String address = scanner.next();
		System.out.println("Enter the City");
		String city = scanner.next();
		System.out.println("Enter the State");
		String state = scanner.next();
		System.out.println("Enter the Zip");
		int zipcode = scanner.nextInt();
		System.out.println("Enter the PhoneNumber");
		String phoneNo = scanner.next();
		System.out.println("Enter the Email");
		String email = scanner.next();

		// creating constructor
		Contact contact = new Contact(firstName, lastName, address, city, zipcode, state, phoneNo, email);

		// add the above list to to Contacts array list
		person.add(contact);

		// printing contacts object data inside
		System.out.println(contact);

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBook address = new AddressBook();
		address.addPerson();

	}

}
