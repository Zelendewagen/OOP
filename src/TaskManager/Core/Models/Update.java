package TaskManager.Core.Models;

public class Update extends Task {
    private static int number;

    static {
        number = 0;
    }

    public Update(String date) {
        super(String.format("Обновнение %d", ++Update.number), "Admin");
        this.setDate(date);
        this.setPriority("3");

    }


    @Override
    public void start() {
        System.out.println("Updating...");
    }
}
