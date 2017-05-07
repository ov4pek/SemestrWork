package ru.kpfu.itis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entities.CityJPA;
import ru.kpfu.itis.repositories.CityJPARepository;

import java.util.List;

/**
 * Created by Danil on 03.05.2017.
 */
@Service
public class CityDAO implements CityDAOInt {
    @Autowired
    private CityJPARepository cityJPARepository;

    @Override
    public List<CityJPA> findAllCity() {
        return (List<CityJPA>) cityJPARepository.findAll();
    }

    @Override
    public CityJPA findCityByName(String name) {
        return cityJPARepository.findCityJPAByNameIgnoreCase(name);
    }

    @Override
    public void addCity(String name) {
        cityJPARepository.save(new CityJPA(name));
    }

    @Override
    public void deleteCity(int id) {
        cityJPARepository.delete(id);
    }
}
