package ContactManagerCLIApp;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ContactMain {

    public static void main(String[] args) throws IOException {
        contactsApp();
    }

    public static void contactsApp() throws IOException{
        System.out.println("Contacts List Manager 1.0\n");
        System.out.println("Please make a selection from the list below:");
        System.out.println("1: Add: Add a new contact to the contact list");
        System.out.println("2: All: Show all contacts currently in your contacts list");
        System.out.println("3: Search: Search for a specific contact by name");
        System.out.println("4: Delete: Delete a specific contact from your contacts list");
        System.out.println("5: Exit: Exit the contacts list manager app\n");

        String userInput = Input.getString();
        userInput = userInput.toLowerCase();

        switch (userInput){ // enhanced switch statement
            case ("add"), ("1") -> {
                System.out.println("Enter new contact name:");
                String name = Input.getString();
                System.out.println("Enter phone number for " + name);
                String number = Input.getString();
                Contact toAdd = new Contact(name, number);
                toAdd.AddContact();
                contactsApp();
            }
            case ("all"), ("2") -> {
                Contact.showContacts();
                contactsApp();
            }
            case ("search"), ("3") -> {
                System.out.println("Enter the name of the contact you wish to search for");
                String name = Input.getString();
                Contact.searchContacts(name);
                contactsApp();
            }

        }



//        if(userInput.equals("add") || userInput.equals("1")){
//            System.out.println("Enter new contact name:");
//            String name = Input.getString();
//            System.out.println("Enter phone number for " + name);
//            String number = Input.getString();
//            Contact toAdd = new Contact(name, number);
//            toAdd.AddContact();
//            contactsApp();
//        } else if (userInput.equals("all")){
//            Contact.showContacts();
//            contactsApp();
//        } else if (userInput.equals("search")){
//            System.out.println("Enter the name of the contact you wish to search for");
//            String name = Input.getString();
//            Contact.searchContacts(name);
//            contactsApp();
//        }

    } // end of contacts app curly brace


}
