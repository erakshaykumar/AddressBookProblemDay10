package com.bridgelabz.addressbookproblems;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	HashMap<String, AddressBook> addressbook = new HashMap<>();

	/*
	 * Add Multiple Address book
	 * 
	 */

	public void addMultipleAddressBook() {
		while (true) {

			System.out.println("Enter selection \n1)To Access Address Book\n2)exit");
			int selection = sc.nextInt();
			switch (selection) {
			case 1:
				String name = sc.next();
				if (addressbook.containsKey(name)) {
					System.out.println("Entered Addressbook name already present");
				} else {
					AddressBook address = new AddressBook();
					System.out.println("Welcome to addressbook" + name);
					addressbook.put(name, address);
				}
				break;

			case 2:
				System.out.println("exiting");
				System.exit(0);
			}

		}

	}

	public static void main(String[] args) {
		Main main = new Main();
		main.addMultipleAddressBook();
	}

}
