package ru.kpfu.itis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entities.UserJPA;
import ru.kpfu.itis.repositories.UserJPARepository;

/**
 * Created by Danil on 03.05.2017.
 */
@Service
public class UserDAO implements UserDAOInt {
    @Autowired
    UserJPARepository userJPARepository;
    @Override
    public void addUser(UserJPA user) {
        userJPARepository.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userJPARepository.delete(id);
    }
}
