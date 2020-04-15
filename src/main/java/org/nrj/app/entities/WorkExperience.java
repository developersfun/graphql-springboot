package org.nrj.app.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class WorkExperience {

    @Id
    private Integer id;
    @OneToOne
    private Company company;
    @ElementCollection(targetClass=Projects.class)
    private List<Projects> projects;

    public WorkExperience() {
    }

    public WorkExperience(Company company, List<Projects> projects) {
        this.company = company;
        this.projects = projects;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }
}
