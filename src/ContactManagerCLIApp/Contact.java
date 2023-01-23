package ContactManagerCLIApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Contact {

//    private String name;
//    private String phoneNumber;
//    private static String contactsDir = "src/ContactManagerCLIApp/";
//    private static String contactsFile = "Contacts.txt";
//    Path mainDirectory = Paths.get(contactsDir);
//    static Path mainFile = Paths.get(contactsDir, contactsFile);
//
//
//    public Contact(String name, String phoneNumber){
//        this.name = name;
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public String getPhoneNumber(){
//        return phoneNumber;
//    }
//
//    public void AddContact() throws IOException {
//        String name = String.format("|%-20s|", this.getName());
//        String number = String.format("%-20s|", this.getPhoneNumber());
//        Files.write(
//                mainFile,
//                Arrays.asList(name+number),
//                StandardOpenOption.APPEND
//        );
//    }
//
//    public static void showContacts() throws IOException {
//        List<String> contactList = Files.readAllLines(mainFile);
//
//        if(contactList.size() != 0){
//            System.out.println("\n___________________________________________");
//            System.out.println("|        NAME        |       NUMBER       |");
//            for (int i = 0; i <= contactList.size(); i +=1) {
//                if (i == contactList.size()){
//                    System.out.println("-------------------------------------------\n\n");
//                }
//                else {
//                    System.out.println("|--------------------|--------------------|");
//                    System.out.println(contactList.get(i));
//                }
//            }
//        }
//        else {
//            System.out.println("No Contacts to show!");
//        }
//    }
//
//    public static void searchContacts(String name) throws IOException{
//        List<String> contactList = Files.readAllLines(mainFile);
//        boolean contactFound = false;
//        int contactIndex = 0;
//
//        for (int i = 0; i < contactList.size(); i++){
//            if(contactList.get(i).contains(name)){
//                contactFound = true;
//                contactIndex = i;
//            }
//        }
//
//        if (contactFound){
//            System.out.println(contactList.get(contactIndex));
//        } else {
//            System.out.println("Contact not found");
//        }
//    }
//
//    public static void deleteContact(String name) throws IOException{
//        List<String> contactList = Files.readAllLines(mainFile);
//
//        boolean contactFound = false;
//        int contactIndex = 0;
//
//        for (int i = 0; i < contactList.size(); i++){
//            System.out.println(contactList.get(i));
//            if(contactList.get(i).contains(name)){
//
//                contactFound = true;
//                contactIndex = i;
//            }
//        }
//
//        if (contactFound){
//            contactList.remove(contactIndex);
//            Files.write(
//                    mainFile,
//                    contactList
//            );
//        } else {
//            System.out.println("Contact not found");
//        }
//    }

    private String name;
    private String phoneNumber;
    private static String contactsDir = "src/ContactManagerApp/";
    private static String contactsFile = "Contacts.txt";
    Path mainDirectory = Paths.get(contactsDir);
    static Path mainFile = Paths.get(contactsDir, contactsFile);

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void AddContact() throws IOException {
        String name = String.format("|%-20s|", this.getName());
        String number = String.format("%-20s|", this.getPhoneNumber());
        Files.write(
                mainFile,
                Arrays.asList(name+number),
                StandardOpenOption.APPEND
        );
    }

    public static void showContacts() throws IOException {
        List<String> contactList = Files.readAllLines(mainFile);

        if(contactList.size() != 0){
            System.out.println("\n___________________________________________");
            System.out.println("|        NAME        |       NUMBER       |");
            for (int i = 0; i <= contactList.size(); i +=1) {
                if (i == contactList.size()){
                    System.out.println("-------------------------------------------\n\n");
                }
                else {
                    System.out.println("|--------------------|--------------------|");
                    System.out.println(contactList.get(i));
                }
            }
        }
    }

    // For regex below found help here: https://stackoverflow.com/questions/11149759/remove-all-non-alphabetic-characters-from-a-string-array-in-java
    public static void searchContacts(String name) throws IOException{
        List<String> contactList = Files.readAllLines(mainFile);

        boolean contactMatch = false;
        int contactIndex = 0;
        String possibleResults = "";

        for (int i = 0; i < contactList.size(); i++){
            name = name.replaceAll("[^a-zA-Z]", "");
            String compareName = contactList.get(i);
            compareName = compareName.replaceAll("[^a-zA-Z]", "");
            if(compareName.equals(name)){
                contactMatch = true;
                contactIndex = i;
            } else if(compareName.contains(name)){
                possibleResults = possibleResults + " " + compareName;
            }
        }

        if (contactMatch){
            System.out.println(contactList.get(contactIndex));
        } else if(possibleResults != ""){
            System.out.println("We found multiple possible matches:" + possibleResults + "\nPlease search again using the FULL NAME.\n");
        } else {
            System.out.println("Contact not found");
        }
    }

    public static void deleteContact(String name) throws IOException {
        List<String> contactList = Files.readAllLines(mainFile);
        boolean contactMatch = false;
        int contactIndex = 0;
        String possibleResults = "";

        for (int i = 0; i < contactList.size(); i++) {
            name = name.replaceAll("[^a-zA-Z]", "");
            String compareName = contactList.get(i);
            compareName = compareName.replaceAll("[^a-zA-Z]", "");
            if (compareName.equals(name)) {
                contactMatch = true;
                contactIndex = i;
            } else if (compareName.contains(name)) {
                possibleResults = possibleResults + " " + compareName;
            }
        }

        if (contactMatch) {
            contactList.remove(contactIndex);
            Files.write(
                    mainFile,
                    contactList
            );
        } else if (possibleResults != "") {
            System.out.println("We found multiple possible matches:" + possibleResults + "\nPlease try your delete again using the FULL NAME.\n");
        } else {
            System.out.println("Contact not found.\n");
        }
    }



} // contact class end curly brace
