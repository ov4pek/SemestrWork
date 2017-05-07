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
@Table(name = "city")
public class CityJPA implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "id", unique = true)
    private int id;
    @Column
    @NotNull
    @Size(min = 1, max = 255)
    private String name;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
    public Set<VuzJPA> vuzs;

    public CityJPA(){
    }

    public CityJPA(String name) {
        this.name = name;
    }

    public Set<VuzJPA> getVuzs() {
        return vuzs;
    }

    public void setVuzs(Set<VuzJPA> vuzs) {
        this.vuzs = vuzs;
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
}
