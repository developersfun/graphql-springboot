package org.nrj.app.entities;

import javax.persistence.*;

@Entity
public class Company {

    @Id
    private Integer companyId;
    private String companyName;
    private String location;

    @OneToOne
    @Transient
    @JoinColumn
    private WorkExperience workExperience;

    public Company() {
    }

    public Company(Integer companyId, String companyName, String location, WorkExperience workExperience) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.location = location;
        this.workExperience=workExperience;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }
}
