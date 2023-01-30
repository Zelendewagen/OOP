package PhoneBook.MVP;

import PhoneBook.Config;
import PhoneBook.Infrastructure.Phonebook;
import PhoneBook.Models.Contact;

import java.io.*;
import java.util.List;

public class Model {
    private Phonebook phonebook;
    private static String path = Config.pathDb;

    public Model() {
        phonebook = new Phonebook();
    }


    public void addContact(Contact contact) {
        phonebook.addContact(contact);
    }

    public void removeContact(int id) {
        for (Contact contact : phonebook.getPhonebook()) {
            if (contact.getId() == id) {
                phonebook.removeContact(contact);
                break;
            }
        }
    }


    public Contact getContact(int id) {
        return phonebook.getContact(id);
    }

    public List<Contact> getPhonebook() {
        return phonebook.getPhonebook();
    }

    public void load() {
        try {
            phonebook.getPhonebook().clear();
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String str = reader.readLine();
            while (str != null) {
                phonebook.addContact(new Contact(reader.readLine(), reader.readLine(), reader.readLine()));
                str = reader.readLine();
            }
            fileReader.close();
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void save() {
        try (FileWriter writer = new FileWriter(path, false)) {
            for (Contact contact : phonebook.getPhonebook()) {
                writer.append(contact.getName() + "\n" +
                        contact.getNumber() + "\n" +
                        contact.getComment() + "\n");
            }
            writer.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
