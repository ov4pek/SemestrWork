package ru.kpfu.itis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.entities.FacultyJPA;

/**
 * Created by Danil on 03.05.2017.
 */
@Repository
public interface FacultyJPARepository extends JpaRepository<FacultyJPA, Integer> {
    public FacultyJPA findFacultyJPAByName(String name);
}
