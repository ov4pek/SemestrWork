package ru.kpfu.itis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entities.FacultyJPA;
import ru.kpfu.itis.entities.VuzJPA;
import ru.kpfu.itis.repositories.FacultyJPARepository;

import java.util.List;
import java.util.Set;

/**
 * Created by Danil on 03.05.2017.
 */
@Service
public class FacultyDAO implements FacultyDAOInt  {
    @Autowired
    FacultyJPARepository facultyJPARepository;
    @Override
    public List<FacultyJPA> findAllFaculty() {
        return (List<FacultyJPA>) facultyJPARepository.findAll();
    }

    @Override
    public FacultyJPA findFacultyByName(String name) {
        return facultyJPARepository.findFacultyJPAByName(name);
    }

    @Override
    public Set<FacultyJPA> findAllFacultyByVuz(VuzJPA vuz) {
        return vuz.getFaculty();
    }

    @Override
    public void addFaculty(String name, VuzJPA vuz) {
        facultyJPARepository.save(new FacultyJPA(name, vuz));
    }

    @Override
    public void deleteFaculty(int id) {
        facultyJPARepository.delete(id);
    }
}
