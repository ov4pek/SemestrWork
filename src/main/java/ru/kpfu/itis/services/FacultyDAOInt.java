package ru.kpfu.itis.services;

import org.springframework.stereotype.Service;
import ru.kpfu.itis.entities.FacultyJPA;
import ru.kpfu.itis.entities.VuzJPA;

import java.util.List;
import java.util.Set;

/**
 * Created by Danil on 03.05.2017.
 */
@Service
public interface FacultyDAOInt {
    public List<FacultyJPA> findAllFaculty();
    public FacultyJPA findFacultyByName(String name);
    public Set<FacultyJPA> findAllFacultyByVuz(VuzJPA vuz);
    void addFaculty(String name, VuzJPA vuz);
    void deleteFaculty(int id);
}
