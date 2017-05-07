package ru.kpfu.itis.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by Danil on 03.05.2017.
 */
@Entity
@Table(name = "users")
public class UserJPA implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "id", unique = true)
    private int id;
    @Column
    @NotNull
    @Size(min = 1, max = 255)
    private String name;
    @Column
    @NotNull
    private String email;
    @Column
    @NotNull
    private String password;

    public UserJPA(){
    }

    public UserJPA(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserJPA userJPA = (UserJPA) o;

        if (id != userJPA.id) return false;
        if (name != null ? !name.equals(userJPA.name) : userJPA.name != null) return false;
        if (email != null ? !email.equals(userJPA.email) : userJPA.email != null) return false;
        return password != null ? password.equals(userJPA.password) : userJPA.password == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
