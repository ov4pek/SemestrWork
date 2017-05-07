package ru.kpfu.itis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entities.CityJPA;
import ru.kpfu.itis.entities.VuzJPA;
import ru.kpfu.itis.repositories.JPAVuzRepository;

import java.util.List;
import java.util.Set;

/**
 * Created by Danil on 03.05.2017.
 */
@Service
public class VuzDAO implements VuzDAOInt {
    @Autowired
    JPAVuzRepository jpaVuzRepository;
    @Override
    public List<VuzJPA> findAllVuz() {
        return (List<VuzJPA>) jpaVuzRepository.findAll();
    }

    @Override
    public VuzJPA findVuzByName(String name) {
        return jpaVuzRepository.findVuzJPAByName(name);
    }

    @Override
    public Set<VuzJPA> findAllVuzByCity(CityJPA city) {
        return city.getVuzs();
    }

    @Override
    public void addVuz(String name, String address, CityJPA city) {
        jpaVuzRepository.save(new VuzJPA(name, address, city));
    }

    @Override
    public void deleteVuz(int id) {
        jpaVuzRepository.delete(id);
    }
}
