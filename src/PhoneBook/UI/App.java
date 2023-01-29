package PhoneBook.UI;

import PhoneBook.MVP.Model;
import PhoneBook.MVP.Presenter;
import PhoneBook.MVP.View;

public class App {
    Presenter presenter;
    View view;
    Model model;

    public App() {
        view = new ConsoleView();
        model = new Model();
        presenter = new Presenter(model, view);
    }

    public void start() {
        int id;
        while (true) {
            System.out.printf("\n=======\n");
            System.out.printf("Выберите дейсткие:\n" +
                    "1 - Показать список контактов\n" +
                    "2 - Добавить контакт\n" +
                    "3 - Изменить контакт\n" +
                    "4 - Удалить контакт\n" +
                    "5 - Загрузить\n" +
                    "6 - Сохранить\n" +
                    "7 - Выход\n");
            switch (view.getValue()) {
                case "1":
                    presenter.showContacts();
                    break;
                case "2":
                    presenter.addContact();
                    break;
                case "3":
                    id = view.getID();
                    if (presenter.checkList(id)) {
                        presenter.showContact(id);
                        System.out.printf("Что нужно изменть?\n" +
                                "1 - Имя\n" +
                                "2 - Номер\n" +
                                "3 - Комментарий\n");
                        switch (view.getValue()) {
                            case "1":
                                presenter.changeContactName(id);
                                break;
                            case "2":
                                presenter.changeContactNumber(id);
                                break;
                            case "3":
                                presenter.changeContactComment(id);
                                break;
                            default:
                                System.out.println("Неверное значение!");
                        }
                    }
                    break;
                case "4":
                    id = view.getID();
                    if (presenter.checkList(id)) {
                        presenter.deleteContact(id);
                    }
                    break;
                case "5":
                    presenter.load();
                    break;
                case "6":
                    presenter.save();
                    break;
                case "7":
                    return;
                default:
                    System.out.println("Неверное значение!");
            }
        }
    }
}
