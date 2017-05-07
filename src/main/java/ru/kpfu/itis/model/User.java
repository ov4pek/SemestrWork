package ru.kpfu.itis.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by Danil on 03.05.2017.
 */
public class User {
    @NotNull
    @Size(min=1, max=256, message = "length of name must be from 1 to 256")
    private String name;
    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9_.-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,8}$", message = "Enter correct email")
    private String email;
    @NotNull
    @Size(min = 6, max = 256, message = "length of password must be from 6 to 256")
    private String password;

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
}
