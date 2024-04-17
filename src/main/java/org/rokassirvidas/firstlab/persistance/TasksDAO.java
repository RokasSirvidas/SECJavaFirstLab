package org.rokassirvidas.firstlab.persistance;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.rokassirvidas.firstlab.entities.Task;
import org.rokassirvidas.firstlab.entities.Worker;

import java.util.List;

@ApplicationScoped
public class TasksDAO {
    @Inject
    private EntityManager em;

    public void persist(Task task) {
        em.persist(task);
    }

    public Task getOne(Long id) {
        return em.find(Task.class, id);
    }

    public List<Task> getAll() {
        return em.createNamedQuery("Task.getAll", Task.class).getResultList();
    }

    public List<Task> getAllByWorkerId(Long id  ) {
        return em.createQuery("SELECT t FROM Task as t JOIN t.workers w WHERE w.id = :workerId", Task.class).setParameter("workerId", id).getResultList();
    }

    public Task update(Task task) {
        return em.merge(task);
    }

    public void flush() {
        em.flush();
    }
}
