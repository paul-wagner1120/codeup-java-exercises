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

    private String name;
    private String phoneNumber;
    private static String contactsDir = "src/ContactManagerCLIApp/";
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

    public static void searchContacts(String name) throws IOException{
        List<String> contactList = Files.readAllLines(mainFile);

        boolean contactFound = false;
        int contactIndex = 0;

        for (int i = 0; i < contactList.size(); i++){
            if(contactList.get(i).contains(name)){
                contactFound = true;
                contactIndex = i;
            }
        }

        if (contactFound){
            System.out.println(contactList.get(contactIndex));
        } else {
            System.out.println("Contact not found");
        }
    }

    public static void deleteContact() throws IOException{

    }

}
