package TaskManager.MVP;

import TaskManager.Core.Infrastructure.TaskManager;
import TaskManager.Core.Models.SendMessage;
import TaskManager.Core.Models.Task;
import TaskManager.Config;
import TaskManager.Core.Models.Update;
import TaskManager.Core.Models.WakerClock;


import java.io.*;

public class Model {
    TaskManager taskManager;
    private int index;
    private static String path = Config.path;

    public Model() {
        taskManager = new TaskManager();
        index = 0;
    }

    public void load() {
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String name = reader.readLine();
            while (name != null) {
                if (name.equals("SendMessage")) {
                    SendMessage task = new SendMessage(reader.readLine(),reader.readLine(),reader.readLine());
                    String priority = reader.readLine();
                    task.setPriority(priority);
                    taskManager.addTask(task);
                    name = reader.readLine();
                }
                if (name.equals("Update")) {
                    Update task = new Update(reader.readLine());
                    String priority = reader.readLine();
                    System.out.println(priority);
                    task.setPriority(priority);
                    taskManager.addTask(task);
                    name = reader.readLine();
                }
                if (name.equals("WakerClock")) {
                    WakerClock task = new WakerClock(reader.readLine(),reader.readLine());
                    String priority = reader.readLine();
                    task.setPriority(priority);
                    taskManager.addTask(task);
                    name = reader.readLine();
                }
            }
            reader.close();
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save() {
        try (FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < taskManager.getTaskList().size(); i++) {
                Task task = taskManager.getTask(i);
//                writer.append(String.format("%s\n", task.getInfo().substring(7)));
                switch (task.getClass().getSimpleName()) {
                    case "SendMessage":
                        writer.append("SendMessage\n");
                        writer.append(task.getDate() + "\n");
                        writer.append(task.getMessageText() + "\n");
                        writer.append(task.getAddressee() + "\n");
                        writer.append(task.getPriority() + "\n");
                        break;
                    case "Update":
                        writer.append("Update\n");
                        writer.append(task.getDate() + "\n");
                        writer.append(task.getPriority() + "\n");
                        break;
                    case "WakerClock":
                        writer.append("WakerClock\n");
                        writer.append(task.getDate() + "\n");
                        writer.append(task.getStartTime() + "\n");
                        writer.append(task.getPriority() + "\n");
                        break;
                    default:
                        writer.append("KEK");
                        break;
                }
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Task currentTask() {
        if (index >= 0) {
            return taskManager.getTask(index);
        } else return null;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


}
