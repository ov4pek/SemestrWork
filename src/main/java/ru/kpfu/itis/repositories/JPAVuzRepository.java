package ru.kpfu.itis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.entities.VuzJPA;

/**
 * Created by Danil on 03.05.2017.
 */
@Repository
public interface JPAVuzRepository extends JpaRepository<VuzJPA, Integer> {
    public VuzJPA findVuzJPAByName(String name);
}
