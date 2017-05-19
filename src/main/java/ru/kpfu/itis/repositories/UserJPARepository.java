package ru.kpfu.itis.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.entities.UserJPA;

/**
 * Created by Danil on 03.05.2017.
 */
@Repository
public interface UserJPARepository extends CrudRepository<UserJPA, Integer> {

    UserJPA findOneByEmail(String email);
}
