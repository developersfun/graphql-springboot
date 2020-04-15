package org.nrj.app.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Education {

    @Id
    private Integer courseId;
    private String className;
    private String schoolName;
    private String collegeName;
    private String university;
    private String board;
    private String degreeName;
    private String specialisation;
    private Integer yearOfPassing;
    private String city;
    private EducationType type = EducationType.DEGREE;

    public Education() {
    }

    public Education(Integer courseId, String className, String schoolName, String collegeName, String university,
                     String board, String degreeName, String specialisation,
                     Integer yearOfPassing, String city, EducationType type) {
        this.courseId = courseId;
        this.className = className;
        this.schoolName = schoolName;
        this.collegeName = collegeName;
        this.university = university;
        this.board = board;
        this.degreeName = degreeName;
        this.specialisation = specialisation;
        this.yearOfPassing = yearOfPassing;
        this.city = city;
        this.type = type;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public Integer getYearOfPassing() {
        return yearOfPassing;
    }

    public void setYearOfPassing(Integer yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public EducationType getType() {
        return type;
    }

    public void setType(EducationType type) {
        this.type = type;
    }
}
