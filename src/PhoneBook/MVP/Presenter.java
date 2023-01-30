package PhoneBook.MVP;

import PhoneBook.Models.Contact;

public class Presenter {
    private View view;
    private Model model;


    public Presenter(Model model, View view) {
        this.view = view;
        this.model = model;
    }


    public boolean checkList(int id) {
        if (model.getPhonebook().size() < 1) {
            view.print("Список пуст");
            return false;
        }
        if (model.getContact(id) != null) {
            return true;
        } else {
            view.print("Нет контакта с таким ИД");
            return false;
        }
    }

    public void showContacts() {
        if (model.getPhonebook().size() > 0) {
            for (Contact contact : model.getPhonebook()) {
                view.print(contact.getInfo());
            }
        } else {
            view.print("Список пуст");
        }
    }

    public void showContact(int id) {
        view.print(model.getContact(id).getInfo());
    }

    public void addContact() {
        model.addContact(new Contact(view.getName(), view.getNumber(), view.getComment()));
    }

    public void changeContactName(Integer id) {
        model.getContact(id).setName(view.getName());
    }

    public void changeContactNumber(Integer id) {
        model.getContact(id).setNumber(view.getNumber());
    }

    public void changeContactComment(Integer id) {
        model.getContact(id).setComment(view.getComment());
    }

    public void deleteContact(int id) {
        model.removeContact(id);
    }

    public void load() {
        model.load();
    }

    public void save() {
        model.save();
    }
}
