/*Ability to edit
*Ability to delete contact in address book using first name
* i/p from user for choice operation
*/
package com.bridgelabz.addressbookproblems;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class AddressBook {
	public static void main(String[] args) {
		System.out.println("Welcome to the address book system");
		ArrayList<Contact> array = new ArrayList<Contact>();
		try (Scanner sc = new Scanner(System.in)) {
			try (Scanner sc1 = new Scanner(System.in)) {
				int choice;
				do {
					System.out.println("1.INSERT" + "\n2.DISPLAY" + "\n3.EDIT" + "\n4.Delete");
					System.out.println("Enter your 1st choice");
					choice = sc.nextInt();

					switch (choice) {
					// To Add Contact
					case 1:
						System.out.print("Enter First Name: ");
						String firstName1 = sc1.nextLine();
						System.out.print("Enter last Name: ");
						String lastName = sc1.nextLine();
						System.out.print("Enter your address: ");
						String address = sc1.nextLine();
						System.out.print("Enter your city: ");
						String city = sc1.nextLine();
						System.out.print("Enter your state: ");
						String state = sc1.nextLine();
						System.out.print("Enter zip code : ");
						int zipcode = sc.nextInt();
						System.out.print("Enter phone number: ");
						String phoneNo = sc1.nextLine();
						System.out.print("Enter your email: ");
						String email = sc1.nextLine();
						Contact contact = new Contact(firstName1, lastName, address, city, state, zipcode, phoneNo,
								email);
						array.add(contact);
						break;
					// To Display Contact
					case 2:
						java.util.Iterator<Contact> iterator = array.iterator();
						while (iterator.hasNext()) {
							contact = iterator.next();
							System.out.println(array);
							break;
						}
						// To Edit Contact
					case 3:
						boolean found = false;
						System.out.println("Enter first name of the person for update ");
						firstName1 = sc1.nextLine();
						System.out.println("------------------------------------");

						ListIterator<Contact> listIterator = array.listIterator();
						/*
						 * It is a java iterator which is used to traverse all types of lists including
						 * ArrayList, Vector, LinkedList, Stack
						 */

						while (listIterator.hasNext()) {
							contact = listIterator.next();
							/*
							 * Entering the condition if firstname matches
							 */
							if (contact.getFirstName().equals(firstName1)) {

								System.out.print("Enter new first Name: ");
								firstName1 = sc1.nextLine();
								System.out.print("Enter new last Name: ");
								lastName = sc1.nextLine();
								System.out.print("Enter your new address: ");
								address = sc1.nextLine();
								System.out.print("Enter your new city: ");
								city = sc1.nextLine();
								System.out.print("Enter your state: ");
								state = sc1.nextLine();
								System.out.print("Enter zip code : ");
								zipcode = sc.nextInt();
								System.out.print("Enter phone number: ");
								phoneNo = sc1.nextLine();
								System.out.print("Enter your email ID: ");
								email = sc1.nextLine();
								listIterator.set(new Contact(firstName1, lastName, address, city, state, zipcode,
										phoneNo, email));
								found = true;
							}
						}
						System.out.println("_____________________________________");

						if (!found) {
							System.out.println("Record not found");
						} else {
							System.out.println("Record is updated successfully");
						}
						System.out.println("_______________________________________");
						break;
					// To Delete Contact
					case 4:
						found = false;
						System.out.println("Enter first name of the person for delete ");
						firstName1 = sc1.nextLine();
						System.out.println("____________________________________");
						iterator = array.iterator();
						while (iterator.hasNext()) {
							contact = iterator.next();
							if (contact.getFirstName().equals(firstName1)) {
								iterator.remove();
								found = true;
							}
						}
						System.out.println("____________________________________");
						if (!found) {
							System.out.println("Record not found");
						} else {
							System.out.println("Record is deleted successfully");
						}
						System.out.println("_____________________________________");
						break;

					default:
						System.out.println("default");

					}
				} while (choice != 0);
				System.out.println("Invalid Choice!!"); // Print Invalid Result In Contact
			}
		}
	}
}
