package ru.kpfu.itis.services;

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
public interface VuzDAOInt {
    public List<VuzJPA> findAllVuz();
    public VuzJPA findVuzByName(String name);
    public Set<VuzJPA> findAllVuzByCity(CityJPA city);
    void addVuz(String name, String address, CityJPA city);
    void deleteVuz(int id);
}
