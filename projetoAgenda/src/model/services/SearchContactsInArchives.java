package model.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import model.entities.Contact;
import model.entities.ContactBook;

public class SearchContactsInArchives implements ContactSearchService {
	
	@Override
	public List<Contact> getContactList(ContactBook contactBook) {
		try(Scanner readContacts = new Scanner(new BufferedReader(new FileReader(contactBook.getContactsFile())))){
			while(readContacts.hasNextLine()) {
				String[] contactsString = readContacts.nextLine().split(",");
				contactBook.getContactList().add(new Contact(contactsString[0], contactsString[1]));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage() + "Lista vazia!");
			e.printStackTrace();
		}

		return contactBook.getContactList();
	}
	
	@Override
	public List<Contact> getDeletedContactsList(ContactBook contactBook) {
		try(Scanner readContacts = new Scanner(new BufferedReader(new FileReader(contactBook.getContactsFile())))){
			while(readContacts.hasNextLine()) {
				String[] contactsString = readContacts.nextLine().split(",");
				contactBook.getDeletedContactsList().add(new Contact(contactsString[0], contactsString[1]));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage() + "Lista vazia!");
			e.printStackTrace();
		}

		return contactBook.getDeletedContactsList();
	}
}
