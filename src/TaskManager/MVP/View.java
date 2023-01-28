package TaskManager.MVP;

import java.util.Scanner;

public interface View {
    String get();

    Integer getID();

    String getDate();

    String getStartTime();

    String getMessageText();

    String getAddressee();

    String getPriority();

    void set(String value);

}
