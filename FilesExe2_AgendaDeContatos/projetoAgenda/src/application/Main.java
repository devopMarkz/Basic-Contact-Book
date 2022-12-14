package application;

import java.io.File;
import java.util.Scanner;

import entities.ContactBook;

public class Main {
	
	// Arquivos dos contatos
	public static File contactBookFile = new File("c:\\Repositório local\\Basic Contact Book\\FilesExe2_AgendaDeContatos\\contactFile\\contactBook.csv");
	private static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		Phone phone = new Phone(new ContactBook(), introduction());
		phone.chosenOption();
	}
	
	public static int introduction () {
		System.out.print("**************** WELCOME TO YOUR CONTACT BOOK! ****************\n");
		System.out.println("Choose the options below to continue using the contact book:");
		System.out.print("1: Access contact book | 2: Add contact | 3: Exit the application -> ");
		
		return input.nextInt();
	}

}
