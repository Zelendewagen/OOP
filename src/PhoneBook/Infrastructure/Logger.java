package PhoneBook.Infrastructure;

import PhoneBook.Config;

import java.io.FileWriter;
import java.util.Date;

public class Logger {
    private static String path = Config.pathLog;

    public Logger() {
    }

    public void log(String move) {
        try (FileWriter writer = new FileWriter(path, true)) {
            writer.append(move + ", " + new Date() + "\n");
            writer.flush();
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }
}
