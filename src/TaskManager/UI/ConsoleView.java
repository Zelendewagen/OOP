package TaskManager.UI;

import TaskManager.MVP.View;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner scan = new Scanner(System.in);


    @Override
    public String get() {
        return scan.nextLine();
    }

    @Override
    public Integer getID() {
        System.out.printf("ИД: ");
        return Integer.parseInt(scan.nextLine());
    }

    @Override
    public String getDate() {
        System.out.printf("Дата: ");
        return scan.nextLine();
    }

    @Override
    public String getStartTime() {
        System.out.printf("Время срабатывания: ");
        return scan.nextLine();
    }

    @Override
    public String getMessageText() {
        System.out.printf("Текст сообщения: ");
        return scan.nextLine();
    }

    @Override
    public String getAddressee() {
        System.out.printf("Получатель: ");
        return scan.nextLine();
    }

    @Override
    public String getPriority() {
        System.out.printf("Выберите приоритет:\n" +
                "1 - низкий\n" +
                "2 - средний\n" +
                "3 - высокий\n:");
        return scan.nextLine();
    }

    @Override
    public void set(String value) {
        System.out.println(value);
    }
}
