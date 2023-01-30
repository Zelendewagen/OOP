package PhoneBook.UI;

import PhoneBook.Infrastructure.Logger;
import PhoneBook.MVP.Model;
import PhoneBook.MVP.Presenter;
import PhoneBook.MVP.View;

public class App {
    Presenter presenter;
    View view;
    Model model;
    Logger logger;

    public App() {
        view = new ConsoleView();
        model = new Model();
        presenter = new Presenter(model, view);
        logger = new Logger();
    }

    public void start() {
        int id;
        logger.log("start program");
        while (true) {
            System.out.print("\n=======\n");
            System.out.print("Выберите дейсткие:\n" +
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
                    logger.log("addContact");
                    break;
                case "3":
                    id = view.getID();
                    if (presenter.checkList(id)) {
                        presenter.showContact(id);
                        System.out.print("Что нужно изменть?\n" +
                                "1 - Имя\n" +
                                "2 - Номер\n" +
                                "3 - Комментарий\n");
                        switch (view.getValue()) {
                            case "1":
                                presenter.changeContactName(id);
                                logger.log("changeContactName ID: " + id);
                                break;
                            case "2":
                                presenter.changeContactNumber(id);
                                logger.log("changeContactNumber ID: " + id);
                                break;
                            case "3":
                                presenter.changeContactComment(id);
                                logger.log("changeContactComment  ID: " + id);
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
                        logger.log("delete contact ID: " + id);
                    }
                    break;
                case "5":
                    presenter.load();
                    logger.log("load database");
                    break;
                case "6":
                    presenter.save();
                    logger.log("save database");
                    break;
                case "7":
                    logger.log("close program");
                    return;
                default:
                    System.out.println("Неверное значение!");
            }
        }
    }
}
