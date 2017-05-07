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
@Table(name = "vuz")
public class VuzJPA implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "id", unique = true)
    private int id;
    @Column(name = "name")
    @Size(min = 1, max = 255)
    private String name;
    @Column(name = "address")
    @Size(min = 1, max = 1000)
    private String address;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.REMOVE,CascadeType.REFRESH})
    @JoinColumn(name = "city_id",referencedColumnName = "id", nullable = false)
    private CityJPA city;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "vuz")
    private Set<FacultyJPA> faculty;

    public VuzJPA(){

    }

    public VuzJPA(String name, String address, CityJPA city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public Set<FacultyJPA> getFaculty() {
        return faculty;
    }

    public void setFaculty(Set<FacultyJPA> faculty) {
        this.faculty = faculty;
    }

    public CityJPA getCity() {
        return city;
    }

    public void setCity(CityJPA city) {
        this.city = city;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
