package TaskManager.Core.Models;

public class WakerClock extends Task {
    private static int number;
    private String startTime;

    static {
        number = 0;
    }




    public WakerClock(String date, String startTime) {
        super(String.format("Будильник %d", ++WakerClock.number), "Admin");
        this.setDate(date);
        this.setPriority("2");
        this.startTime = startTime;

    }

    public WakerClock(String date, String startTime, String priority) {
        super(String.format("Будильник %d", ++WakerClock.number), "Admin");
        this.setDate(date);
        this.startTime = startTime;
        this.setPriority(priority);

    }


    @Override
    public void start() {
        System.out.printf("Работает будильник %s", this.number);
        System.out.println();
    }

    @Override
    public String getStartTime(){
        return startTime;
    }
    @Override
    public String getInfo() {
        return String.format("ID: %d, Name: %s, Дата выполнения: %s %s, Author: %s, Priority: %s",
                getId(), getName(), getDate(), startTime, getAuthor(), getPriority());
    }
}
