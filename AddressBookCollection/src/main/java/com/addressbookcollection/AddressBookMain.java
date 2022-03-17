package com.addressbookcollection;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Creating new Contact in address book with first and last names, address,city, state, zip, phone number and email.
 *
 */

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program...!!!");
		/*
		 * created list for contact info
		 */
		List<Contact> contact = new ArrayList<Contact>();
		/*
		 * Passing the parameters to object of contact 
		 */
		Contact newContact = new Contact("Deven", "Mali", "Dhule", "Pune", "Maharastra", "424005", "945366356","deven@gmail.com");
		/*
		 * adding contact to list
		 */
		contact.add(newContact);
		System.out.println(contact);
	}
}
