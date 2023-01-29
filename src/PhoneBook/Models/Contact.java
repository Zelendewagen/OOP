package PhoneBook.Models;

public class Contact {
    protected static int count;
    private int id;
    private String name;
    private String number;
    private String comment;

    static {
        count = 0;
    }

    public Contact(String name, String number, String comment) {
        this.name = name;
        this.number = number;
        this.comment = comment;
        id = count++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getInfo() {
        return "Id: " + id
                + ", Name: " + name
                + ", Number: " + number
                + ", Comment: " + comment;
    }

}
