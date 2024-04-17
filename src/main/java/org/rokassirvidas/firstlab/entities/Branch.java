package org.rokassirvidas.firstlab.entities;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
@NamedQueries({
    @NamedQuery(name = "Branch.getAll", query = "SELECT b FROM Branch as b")
})
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Basic(optional = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "branch")
    private List<Worker> workers;

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return Objects.equals(getId(), branch.getId()) && Objects.equals(getName(), branch.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
}
