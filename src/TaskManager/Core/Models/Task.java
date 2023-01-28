package TaskManager.Core.Models;

public abstract class Task implements StartTask {
    protected static int count;
    private int id;
    private String name;
    private String priority;
    private String date;
    private String author;

    static {
        Task.count = 0;
    }

    protected Task(String name, String author) {
        this.name = name;
        this.author = author;
        this.id = count++;
    }


    public String getInfo() {
        return String.format("ID: %d, Name: %s, Дата выполнения: %s, Author: %s, Priority: %s",
                this.getId(), getName(), getDate(), getAuthor(), getPriority());
    }

    public String getName() {
        return name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        switch (priority) {
            case "1":
            case "low":
                this.priority = "low";
                break;
            case "2":
            case "mid":
                this.priority = "mid";
                break;
            case "3":
            case "high":
                this.priority = "high";
                break;
        }
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public String getMessageText() {
        return null;
    }

    public String getAddressee() {
        return null;
    }

    public String getStartTime() {
        return null;
    }

}
