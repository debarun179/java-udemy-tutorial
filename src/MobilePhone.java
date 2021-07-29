import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    public static void main(String[] args) {
        MobilePhone mb = new MobilePhone();
        mb.readOption();
        //mb.printContacts();
    }
    public void readOption(){
        int choice = 0;
        boolean moreInput = true;
        while (moreInput) {
            printInstructions();
            choice = scanner.nextInt();
            String name = "";
            String oldname = "";
            String newname = "";
            String newphoneno = "";
            String phoneno = "";
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Quitting...");
                    moreInput = false;
                    break;
                case 2:
                    printContacts();
                    System.out.println("Hit Enter to see the options");
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Enter Name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter Phone: ");
                    phoneno = scanner.nextLine();
                    addContact(new Contact(name,phoneno));
                    System.out.println("Hit Enter to see the options");
                    scanner.nextLine();
                    break;

                case 4:
                    System.out.print("Enter Old Name: ");
                    oldname = scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    newname = scanner.nextLine();
                    System.out.println("Enter New Number: ");
                    newphoneno = scanner.nextLine();
                    updateContact(new Contact(oldname,phoneno),new Contact(newname,newphoneno));
                    System.out.println("Hit Enter to see the options");
                    scanner.nextLine();
                    break;
            }
        }

    }
    public void printInstructions(){
        System.out.println("\n Please enter a choice from the options below. ");
        System.out.println("\t 1. Quit");
        System.out.println("\t 2. Print contacts");
        System.out.println("\t 3. Add a new contact");
        System.out.println("\t 4. Update an existing contact");
        System.out.println("\t 5. Remove a contact");
        System.out.println("\t 6. Find a contact");
    }
    private int findContact(Contact contact){
        return contactList.indexOf(contact);
    }

    private int findContact(String contactName){
        for (int i=0; i<contactList.size();i++){
            if (contactList.get(i).getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact){
        if (findContact(contact)>=0){
            return contact.getName();
        }
        else {
            return null;
        }
    }

    public void addContact(Contact contact){
        if (contact==null){
            System.out.println("Contact name or phone no. cannot be null when adding a new contact");
        } else if (findContact(contact)>=0){
            System.out.println("Contact already exists and therefore cannot add !!");
        }
        else {
            contactList.add(contact);
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if (findContact(oldContact)==-1){
            System.out.println("Contact"+oldContact.getName()+" to update does not exist");
            return false;
        }
        contactList.set(findContact(oldContact),newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact)>=0){
            contactList.remove(contact);
            return true;
        }
        else {
            System.out.println("Specified contact does not exist and cant be removed");
            return false;
        }
    }

    public void printContacts(){
        int noOfContacts = contactList.size();
        if (noOfContacts<=0) {
            System.out.println("No contacts exist !!");
        }

    }

}
