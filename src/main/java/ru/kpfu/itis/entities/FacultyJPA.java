package ru.kpfu.itis.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Danil on 03.05.2017.
 */
@Entity
@Table(name = "faculty")
public class FacultyJPA implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "id", unique = true)
    private int id;
    @Column
    @NotNull
    @Size(min = 1, max = 255)
    private String name;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    @JoinColumn(name = "vuz_id",referencedColumnName = "id", nullable = false)
    private VuzJPA vuz;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "faculty")
    private Set<GroupJPA> groups;

    public FacultyJPA(){
    }

    public FacultyJPA(String name, VuzJPA vuz) {
        this.name = name;
        this.vuz = vuz;
    }

    public int getId() {
        return id;
    }

    public Set<GroupJPA> getGroups() {
        return groups;
    }

    public void setGroups(Set<GroupJPA> groups) {
        this.groups = groups;
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

    public VuzJPA getVuz() {
        return vuz;
    }

    public void setVuz(VuzJPA vuz) {
        this.vuz = vuz;
    }
}
