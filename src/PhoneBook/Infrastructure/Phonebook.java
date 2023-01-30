package PhoneBook.Infrastructure;

import PhoneBook.Models.Contact;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Contact> phonelist;

    public Phonebook() {
        this.phonelist = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        phonelist.add(contact);
    }

    public void removeContact(Contact contact) {
        phonelist.remove(contact);
    }

    public Contact getContact(Integer id) {
        for (Contact contact : phonelist) {
            if (contact.getId() == id){
                return phonelist.get(id);
            }
        }
        return null;
    }

    public List<Contact> getPhonebook() {
        return phonelist;
    }
}
