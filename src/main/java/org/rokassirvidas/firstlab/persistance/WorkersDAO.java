package org.rokassirvidas.firstlab.persistance;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.rokassirvidas.firstlab.entities.Worker;

@ApplicationScoped
public class WorkersDAO {
    @Inject
    private EntityManager em;

    public void persist(Worker worker) {
        em.persist(worker);
    }

    public Worker getOne(Long id) {
        return em.find(Worker.class, id);
    }

    public Worker update(Worker worker) {
        return em.merge(worker);
    }
}
