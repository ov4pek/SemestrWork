package ru.kpfu.itis.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.entities.GroupJPA;

/**
 * Created by Danil on 03.05.2017.
 */
@Repository
public interface GroupJPARepository extends CrudRepository<GroupJPA, Integer> {
    GroupJPA findGroupJPAByName(String name);
}
