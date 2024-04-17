package org.rokassirvidas.firstlab.usecases;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.rokassirvidas.firstlab.entities.Branch;
import org.rokassirvidas.firstlab.persistance.BranchesDAO;

import java.util.List;

@Model
public class Branches {

    @Inject
    private BranchesDAO branchesDAO;

    private Branch branchToCreate = new Branch();

    public Branch getBranchToCreate() {
        return branchToCreate;
    }

    public void setBranchToCreate(Branch branchToCreate) {
        this.branchToCreate = branchToCreate;
    }

    private List<Branch> branchList;

    public List<Branch> getBranchList() {
        return branchList;
    }

    @PostConstruct
    public void init() {
        branchList = branchesDAO.getAll();
    }

    @Transactional
    public void createBranch() {
        branchesDAO.persist(branchToCreate);
    }
}
