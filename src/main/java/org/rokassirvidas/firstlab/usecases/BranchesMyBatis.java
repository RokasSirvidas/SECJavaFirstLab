package org.rokassirvidas.firstlab.usecases;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.rokassirvidas.firstlab.mybatis.dao.BranchMapper;
import org.rokassirvidas.firstlab.mybatis.model.Branch;

import java.util.List;

@Model
public class BranchesMyBatis {
    @Inject
    private BranchMapper branchMapper;

    private List<Branch> branches;

    public List<Branch> getBranches() {
        return branchMapper.selectAll();
    }

    private Branch branchToCreate = new Branch();

    public Branch getBranchToCreate() {
        return branchToCreate;
    }

    public void setBranchToCreate(Branch branchToCreate) {
        this.branchToCreate = branchToCreate;
    }

    @PostConstruct
    public void init(){
        this.loadAllBranches();
    }

    private void loadAllBranches(){
        this.branches = branchMapper.selectAll();
    }

    @Transactional
    public String createBranch(){
        branchMapper.insert(branchToCreate);
        return "/mybatis/branches?faces-redirect=true";
    }

}
