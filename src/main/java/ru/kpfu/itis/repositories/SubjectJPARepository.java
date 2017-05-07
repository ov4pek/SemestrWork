package ru.kpfu.itis.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.entities.SubjectsJPA;

/**
 * Created by Danil on 04.05.2017.
 */
@Repository
public interface SubjectJPARepository extends CrudRepository<SubjectsJPA, Integer> {
}
