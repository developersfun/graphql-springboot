package org.nrj.app.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity(name = "projects")
public class Projects {

    @Id
    private Integer projectId;
    private String name;
    private String company;
    @ManyToMany
    private List<Technology> techUsed;
}
