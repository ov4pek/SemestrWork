package ru.kpfu.itis.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Danil on 04.05.2017.
 */
@Entity
@Table(name = "subjects")
public class SubjectsJPA implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "id", unique = true)
    private int id;
    @Column
    @NotNull
    private String name;
    @Column
    private String begin_time;
    @Column
    private String end_time;
    @Column
    private String day;
    @ManyToMany
    @JoinTable(name = "group_subject", joinColumns = @JoinColumn(name = "subject_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "group_id", referencedColumnName = "id"))
    private Set<GroupJPA> groups;

    public SubjectsJPA(){}

    public SubjectsJPA(String name, String begin_time, String end_time, String day, Set<GroupJPA> groups) {
        this.name = name;
        this.begin_time = begin_time;
        this.end_time = end_time;
        this.day = day;
        this.groups = groups;
    }

    public String getBegin_time() {
        return begin_time;
    }

    public void setBegin_time(String begin_time) {
        this.begin_time = begin_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Set<GroupJPA> getGroups() {
        return groups;
    }

    public void setGroups(Set<GroupJPA> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubjectsJPA that = (SubjectsJPA) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (day != null ? !day.equals(that.day) : that.day != null) return false;
        return groups != null ? groups.equals(that.groups) : that.groups == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (day != null ? day.hashCode() : 0);
        result = 31 * result + (groups != null ? groups.hashCode() : 0);
        return result;
    }
}
