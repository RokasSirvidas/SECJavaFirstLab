package org.rokassirvidas.firstlab.usecases;

import jakarta.annotation.PostConstruct;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.transaction.Transactional;
import org.rokassirvidas.firstlab.entities.Task;
import org.rokassirvidas.firstlab.entities.Worker;
import org.rokassirvidas.firstlab.persistance.TasksDAO;
import org.rokassirvidas.firstlab.persistance.WorkersDAO;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@ViewScoped
@Named
public class UpdateTaskDetails implements Serializable {
    @Inject
    private WorkersDAO workersDAO;

    @Inject
    private TasksDAO tasksDAO;

    private Task task;

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    private List<Worker> workers;

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }
    @PostConstruct
    public void init() {
        System.out.println("Tasks INIT CALLED");
        Map<String, String> requestParameters = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Long taskId = Long.parseLong(requestParameters.get("taskId"));
        task = tasksDAO.getOne(taskId);
        workers = workersDAO.getAll();
    }

    @Transactional
    public void updateTask() {
        task = tasksDAO.update(task);
        tasksDAO.flush();
    }

    @Transactional
    public void removeWorkers() {
        for (Worker worker : task.getWorkers()) {
            if (worker.getSelected()) {
                task = tasksDAO.getOne(task.getId());
                worker = workersDAO.getOne(worker.getId());
                task.getWorkers().remove(worker);
                worker.getTasks().remove(task);
                tasksDAO.flush();
            }
        }
    }

    @Transactional
    public void addWorkers() {
        for (Worker worker : workers) {
            if (worker.getSelected()) {
                task = tasksDAO.getOne(task.getId());
                worker = workersDAO.getOne(worker.getId());
                if (!task.getWorkers().contains(worker)) {
                    task.addWorker(worker);
                    tasksDAO.flush();
                }
            }
        }
    }


}
