package TaskManager.UI;

import TaskManager.MVP.Model;
import TaskManager.MVP.Presenter;
import TaskManager.MVP.View;
import java.util.Scanner;

public class App {
    Presenter presenter;
    View view;
    Model model;

    public App() {
        view = new ConsoleView();
        model = new Model();
        presenter = new Presenter(view, model);
    }

    public void start() {
        try (Scanner test = new Scanner(System.in)) {
            while (true) {
                System.out.printf("\n=======\n");
                System.out.println("Выберите действие:\n" +
                        "1 - Добавить задачу\n" +
                        "2 - Удалить задачу\n" +
                        "3 - Изменить задачу\n" +
                        "4 - Показать текущие задачи\n" +
                        "5 - Загрузить\n" +
                        "6 - Сохранить\n" +
                        "7 - Выход");
                switch (view.get()) {
                    case "1":
                        view.set("Выберите тип задачи: \n" +
                                "1 - Сообщение\n" +
                                "2 - Обновление\n" +
                                "3 - Будильник");
                        switch (view.get()) {
                            case "1":
                                presenter.addMessage();
                                break;
                            case "2":
                                presenter.addUpdate();
                                break;
                            case "3":
                                presenter.addWaker();
                                break;
                            default:
                                System.out.println("нет такой команды");
                                break;
                        }
                        break;
                    case "2":
                        presenter.removeTask();
                        break;
                    case "3":
                        presenter.changeTask();
                        break;
                    case "4":
                        view.set("Список задач: ");
                        presenter.showTasks();
                        break;
                    case "5":
                        presenter.loadData();
                        break;
                    case "6":
                        presenter.saveData();
                        break;
                    case "7":
                        return;

                    default:
                        System.out.println("нет такой команды");
                        break;
                }
            }
        }
    }


    private static int checkInt() {
        boolean temp = true;
        while (temp) {
            System.out.print("Введите число: ");
            Scanner scanner = new Scanner(System.in);
            try {
                int n = Integer.parseInt(scanner.nextLine());
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Введено не число !");
            }
        }
        return 0;
    }
}
