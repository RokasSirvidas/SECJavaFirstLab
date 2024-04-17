package org.rokassirvidas.firstlab.usecases;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;
import org.rokassirvidas.firstlab.entities.Task;
import org.rokassirvidas.firstlab.persistance.BranchesDAO;
import org.rokassirvidas.firstlab.persistance.TasksDAO;

import java.util.List;

@Model
public class Tasks {

    @Inject
    private TasksDAO tasksDAO;

    private List<Task> tasks;

    public List<Task> getTasks() {
        return tasks;
    }

    @PostConstruct
    public void init() {
        tasks = tasksDAO.getAll();
    }


}
