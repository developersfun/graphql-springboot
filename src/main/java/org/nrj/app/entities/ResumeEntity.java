package org.nrj.app.entities;

import javax.persistence.*;
import java.util.List;

@Entity(name = "resume")
public class ResumeEntity {

    @Id
    private Integer id;
    @Embedded
    private PersonalDetails personalDetails;
    @ElementCollection(targetClass=Education.class)
    private List<Education> education;
    @ElementCollection(targetClass=WorkExperience.class)
    private List<WorkExperience> workExperience;

    public ResumeEntity() {
    }

    public ResumeEntity(PersonalDetails personalDetails, List<Education> education, List<WorkExperience> workExperience) {
        this.personalDetails = personalDetails;
        this.education = education;
        this.workExperience = workExperience;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }

    public List<Education> getEducation() {
        return education;
    }

    public void setEducation(List<Education> education) {
        this.education = education;
    }

    public List<WorkExperience> getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(List<WorkExperience> workExperience) {
        this.workExperience = workExperience;
    }
}
