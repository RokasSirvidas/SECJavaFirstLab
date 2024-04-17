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
public class UpdateWorkerDetails implements Serializable {
    @Inject
    private WorkersDAO workersDAO;

    @Inject
    private TasksDAO tasksDAO;
    private Worker worker;

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Worker getWorker() {
        return worker;
    }

    private Task newTask = new Task();

    public Task getNewTask() {
        return newTask;
    }

    public void setNewTask(Task newTask) {
        this.newTask = newTask;
    }



    @PostConstruct
    private void init(){
        System.out.println("UpdateWorkerDetails INIT CALLED");
        Map<String, String> requestParameters = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Long workerId = Long.parseLong(requestParameters.get("workerId"));
        this.worker = workersDAO.getOne(workerId);
    }
    @Transactional
    public String updateWorker(){
        workersDAO.update(worker);
        return "workers.xhtml?branchId=" + this.worker.getBranch().getId() + "&faces-redirect=true";
    }

    @Transactional
    public void createTask() {
        worker = workersDAO.update(worker);
        newTask.addWorker(worker);
        tasksDAO.persist(newTask);
        tasksDAO.flush();
    }
}
