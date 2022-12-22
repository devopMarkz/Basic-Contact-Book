package model.services;

import java.util.List;

import model.entities.Contact;
import model.entities.ContactBook;

public interface ContactSearchService {
	
	public List<Contact> getContactList(ContactBook contactBook);
	
	public List<Contact> getDeletedContactsList(ContactBook contactBook);

}
