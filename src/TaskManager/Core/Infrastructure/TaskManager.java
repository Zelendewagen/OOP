package TaskManager.Core.Infrastructure;

import TaskManager.Core.Models.Task;

import java.util.*;

public class TaskManager {
    private List<Task> taskList;


    public TaskManager() {
        this.taskList = new ArrayList<>();
    }


    public void addTask(Task task) {
        taskList.add(task);
    }

    public void removeTask(int id) {
        if (taskList.size() < 1) return;
        taskList.remove(id);
    }

    public void changeTask(int id, String date, String priority) {
        for (Task task : taskList) {
            if (task.getId() == id) {
                task.setDate(date);
                task.setPriority(priority);
            }
        }
    }

    public Task getTask(int id) {
        for (Task task : taskList) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    public List<Task> getTaskList() {
        return this.taskList;
    }

    public void startManager() {
        for (Task task : taskList) {
            if (task.getDate().equals("everyday") || task.getDate().equals("today")) {
                task.start();
            }
        }
    }

}
