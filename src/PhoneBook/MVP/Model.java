package PhoneBook.MVP;

import PhoneBook.Config;
import PhoneBook.Infrastructure.Phonebook;
import PhoneBook.Models.Contact;

import java.util.List;

public class Model {
    public Phonebook phonebook;
    public static String path = Config.pathDb;

    public Model() {
        phonebook = new Phonebook();
    }


    public void addContact(Contact contact) {
        phonebook.addContact(contact);
    }

    public void removeContact(int id) {
        phonebook.removeContact(id);
    }


    public Contact getContact(int id) {
        return phonebook.getContact(id);
    }

    public List<Contact> getPhonebook() {
        return phonebook.getPhonebook();
    }

    public void load() {

    }

    public void save() {

    }

}
