package TaskManager.MVP;

import TaskManager.Core.Models.SendMessage;
import TaskManager.Core.Models.Task;
import TaskManager.Core.Models.Update;
import TaskManager.Core.Models.WakerClock;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void showTasks() {
        for (Task task : model.taskManager.getTaskList()) {
            view.set(task.getInfo());
        }
    }

    public void addMessage() {
        model.taskManager.addTask(
                new SendMessage(view.getDate(), view.getMessageText(), view.getAddressee()));
    }

    public void addUpdate() {
        model.taskManager.addTask(
                new Update(view.getDate()));
    }

    public void addWaker() {
        model.taskManager.addTask(
                new WakerClock(view.getDate(), view.getStartTime()));
    }

    public void removeTask() {
        model.taskManager.removeTask(
                view.getID());
    }

    public void changeTask() {
        model.taskManager.changeTask(
                view.getID(), view.getDate(), view.getPriority());
    }

    public void saveData(){
        model.save();
    }

    public void loadData(){
        model.load();
    }



}
