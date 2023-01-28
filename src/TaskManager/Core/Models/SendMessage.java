package TaskManager.Core.Models;

public class SendMessage extends Task {

    private String messageText;
    private String addressee;
    private static int number;

    static {
        number = 0;
    }


    public SendMessage(String date, String message, String addressee) {
        super(String.format("Отправить сообщение %d", ++SendMessage.number), "Admin");
        this.setDate(date);
        this.setPriority("1");
        this.messageText = message;
        this.addressee = addressee;
    }

    @Override
    public String getInfo() {
        return String.format("ID: %d, Name: %s, Дата выполнения: %s, Author: %s," +
                        " Текст сообщения: %s, Получатель: %s, Priority: %s",
                this.getId(), getName(), getDate(), getAuthor(),
                this.messageText, this.addressee, getPriority());
    }

    @Override
    public String getMessageText(){
        return messageText;
    }

    @Override
    public String getAddressee(){
        return addressee;
    }


    @Override
    public void start() {
        System.out.printf("Сообщение с текстом '%s' Отправлено: %s ", messageText, addressee);
        System.out.println();
    }
}
