package PhoneBook.UI;

import PhoneBook.MVP.View;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner scan = new Scanner(System.in);


    @Override
    public void print(String value) {
        System.out.println(value);
    }

    @Override
    public String getValue() {
        return scan.nextLine();
    }

    @Override
    public Integer getID(){
        System.out.printf("Укаджите ID контакта: ");
        return Integer.parseInt(scan.nextLine());
    }

    @Override
    public String getName() {
        System.out.printf("Name: ");
        return scan.nextLine();
    }

    @Override
    public String getNumber() {
        System.out.printf("Number: ");
        return scan.nextLine();
    }

    @Override
    public String getComment() {
        System.out.printf("Comment: ");
        return scan.nextLine();
    }
}
