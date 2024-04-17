package org.rokassirvidas.firstlab.persistance;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.rokassirvidas.firstlab.entities.Branch;

import java.util.List;

@ApplicationScoped
public class BranchesDAO {
    @Inject
    private EntityManager em;

    public List<Branch> getAll() {
        return em.createNamedQuery("Branch.getAll", Branch.class).getResultList();
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void persist(Branch branch) {
        em.persist(branch);
    }

    public Branch getOne(Long id) {
        return em.find(Branch.class, id);
    }

}
