package org.rokassirvidas.firstlab.usecases;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.inject.Model;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.rokassirvidas.firstlab.entities.Branch;
import org.rokassirvidas.firstlab.entities.Worker;
import org.rokassirvidas.firstlab.persistance.BranchesDAO;
import org.rokassirvidas.firstlab.persistance.WorkersDAO;

import java.io.Serializable;
import java.util.Map;

@Model
public class BranchWorkers implements Serializable {
    @Inject
    private BranchesDAO branchesDAO;

    @Inject
    private WorkersDAO workersDAO;

    private Branch branch;

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    private Worker workerToCreate = new Worker();

    public Worker getWorkerToCreate() {
        return workerToCreate;
    }

    public void setWorkerToCreate(Worker workerToCreate) {
        this.workerToCreate = workerToCreate;
    }

    @PostConstruct
    public void init() {
        Map<String, String> requestParams = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Long branchId = Long.parseLong(requestParams.get("branchId"));
        branch = branchesDAO.getOne(branchId);
    }

    @Transactional
    public void createWorker() {
        workerToCreate.setBranch(this.branch);
        workersDAO.persist(workerToCreate);
    }


    @Transactional
    public void removeSelectedWorkers() {
        for (Worker worker : branch.getWorkers()) {
            if (worker.getSelected()) {
                workersDAO.deleteWorkerById(worker.getId());
            }
        }
    }
}
