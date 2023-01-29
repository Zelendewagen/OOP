package PhoneBook.Infrastructure;

import PhoneBook.Models.Contact;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Contact> phonelist;

    public Phonebook(){
        this.phonelist = new ArrayList<>();
    }

    public void addContact(Contact contact){
        phonelist.add(contact);
    }

    public void removeContact(int id){
        phonelist.remove(id);
    }

    public Contact getContact(Integer id){
        return phonelist.get(id);
    }

    public List<Contact> getPhonebook(){
        return phonelist;
    }
}
