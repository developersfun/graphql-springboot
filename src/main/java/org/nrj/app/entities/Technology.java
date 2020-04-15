package org.nrj.app.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import java.util.List;

@Entity
public class Technology {

    @Id
    private Integer id;
    private String techName;
    private String latestVersionUsed;
    private String lastUsed;

    @ManyToMany
    @Transient
    private List<Projects> projects;

    public Technology() {
    }

    public Technology(String techName, String latestVersionUsed, String lastUsed) {
        this.techName = techName;
        this.latestVersionUsed = latestVersionUsed;
        this.lastUsed = lastUsed;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public String getLatestVersionUsed() {
        return latestVersionUsed;
    }

    public void setLatestVersionUsed(String latestVersionUsed) {
        this.latestVersionUsed = latestVersionUsed;
    }

    public String getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(String lastUsed) {
        this.lastUsed = lastUsed;
    }
}
