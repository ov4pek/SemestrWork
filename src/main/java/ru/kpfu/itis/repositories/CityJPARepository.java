package ru.kpfu.itis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.entities.CityJPA;

import java.util.List;
import java.util.Set;

/**
 * Created by Danil on 03.05.2017.
 */
@Repository
public interface CityJPARepository extends JpaRepository<CityJPA, Integer> {
//    @Query("select * from city WHERE")
    CityJPA findCityJPAByNameIgnoreCase(String name);
}
