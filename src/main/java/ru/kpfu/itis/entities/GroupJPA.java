package ru.kpfu.itis.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Danil on 03.05.2017.
 */
@Entity
@Table(name = "groups")
public class GroupJPA implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "id", unique = true)
    private int id;
    @Column(name = "name")
    @NotNull
    private String name;
    @Column
    private int countStudents;
    @Column
    private String starosta;
    @Column
    private String numberOfStarosta;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.REMOVE,CascadeType.REFRESH})
    @JoinColumn(name = "vuz_id", referencedColumnName = "id",nullable = false)
    private VuzJPA vuz;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.REMOVE,CascadeType.REFRESH})
    @JoinColumn(name = "faculty_id", referencedColumnName = "id", nullable = false)
    private FacultyJPA faculty;
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "groups")
    private Set<SubjectsJPA> subjects;

    public GroupJPA(){}

    public GroupJPA(String number, int countStudents, String starosta, String numberOfStarosta, FacultyJPA faculty) {
        this.name = number;
        this.countStudents = countStudents;
        this.starosta = starosta;
        this.numberOfStarosta = numberOfStarosta;
        this.faculty =faculty;
    }

    public Set<SubjectsJPA> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<SubjectsJPA> subjects) {
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return name;
    }

    public void setNumber(String number) {
        this.name = number;
    }


    public String getStarosta() {
        return starosta;
    }

    public void setStarosta(String starosta) {
        this.starosta = starosta;
    }

    public String getNumberOfStarosta() {
        return numberOfStarosta;
    }

    public void setNumberOfStarosta(String numberOfStarosta) {
        this.numberOfStarosta = numberOfStarosta;
    }

    public VuzJPA getVuz() {
        return vuz;
    }

    public void setVuz(VuzJPA vuz) {
        this.vuz = vuz;
    }

    public FacultyJPA getFaculty() {
        return faculty;
    }

    public void setFaculty(FacultyJPA faculty) {
        this.faculty = faculty;
    }

    public int getCountStudents() {
        return countStudents;
    }

    public void setCountStudents(int countStudents) {
        this.countStudents = countStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupJPA groupJPA = (GroupJPA) o;

        if (id != groupJPA.id) return false;
        if (countStudents != groupJPA.countStudents) return false;
        if (name != null ? !name.equals(groupJPA.name) : groupJPA.name != null) return false;
        if (starosta != null ? !starosta.equals(groupJPA.starosta) : groupJPA.starosta != null) return false;
        if (numberOfStarosta != null ? !numberOfStarosta.equals(groupJPA.numberOfStarosta) : groupJPA.numberOfStarosta != null)
            return false;
        if (vuz != null ? !vuz.equals(groupJPA.vuz) : groupJPA.vuz != null) return false;
        return faculty != null ? faculty.equals(groupJPA.faculty) : groupJPA.faculty == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (starosta != null ? starosta.hashCode() : 0);
        result = 31 * result + (numberOfStarosta != null ? numberOfStarosta.hashCode() : 0);
        result = 31 * result + (vuz != null ? vuz.hashCode() : 0);
        result = 31 * result + (faculty != null ? faculty.hashCode() : 0);
        return result;
    }
}
