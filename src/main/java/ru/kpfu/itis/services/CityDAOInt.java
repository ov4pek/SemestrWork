package ru.kpfu.itis.services;

import org.springframework.stereotype.Service;
import ru.kpfu.itis.entities.CityJPA;

import java.util.List;

/**
 * Created by Danil on 03.05.2017.
 */
@Service
public interface CityDAOInt {
    public List<CityJPA> findAllCity();
    public CityJPA findCityByName(String name);
    void addCity(String name);
    void deleteCity(int id);
}
