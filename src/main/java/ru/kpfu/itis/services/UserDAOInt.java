package ru.kpfu.itis.services;

import org.springframework.stereotype.Service;
import ru.kpfu.itis.entities.UserJPA;

import java.util.List;

/**
 * Created by Danil on 03.05.2017.
 */
@Service
public interface UserDAOInt {
    void addUser(UserJPA user);
    void deleteUser(int id);
}
