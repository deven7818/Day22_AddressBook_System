package com.addressbookcollection;

import java.util.List;
import java.util.Scanner;

public class AddNewContact {

	Scanner sc = new Scanner(System.in);
	
	/**
	 * Method to add new contact to Contact list
	 * @param contacts - contact details
	 */
	public void addContact(List<Contact> contacts) {
		System.out.println("Please Enter the first Name : ");
		String firstName = sc.next();
		
		System.out.println("Please Enter the last Name : ");
		String lastName = sc.next();
		
		System.out.println("Please Enter the address : ");
		String address = sc.next();
		
		System.out.println("Please Enter the city : ");
		String city = sc.next();
		
		System.out.println("Please Enter the state : ");
		String state = sc.next();
		
		System.out.println("Please Enter the zip : ");
		String zip = sc.next();
		
		System.out.println("Please Enter the phone Number : ");
		String phoneNumber = sc.next();
		
		System.out.println("Please Enter the email : ");
		String email = sc.next();
		
		/**
		 * Taking input from console to adding new contact to ArrayList contacts
		 */
		Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
		contacts.add(newContact);
	}
}
