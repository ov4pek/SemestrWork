package ru.kpfu.itis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entities.GroupJPA;
import ru.kpfu.itis.entities.SubjectsJPA;
import ru.kpfu.itis.repositories.SubjectJPARepository;

import java.util.List;
import java.util.Set;

/**
 * Created by Danil on 04.05.2017.
 */
@Service
public class SubjectDAO implements SubjectDAOInt {
    @Autowired
    SubjectJPARepository subjectJPARepository;

    @Override
    public List<SubjectsJPA> findAllSubjects() {
        return (List<SubjectsJPA>) subjectJPARepository.findAll();
    }

    @Override
    public Set<SubjectsJPA> findAllSubjectyByGroup(GroupJPA group) {
        return group.getSubjects();
    }

    @Override
    public void addSubject(String name, String beginTime, String endTime, String day, Set<GroupJPA> groups) {
        subjectJPARepository.save(new SubjectsJPA(name, beginTime, endTime, day, groups));

    }


    @Override
    public void deleteSubject(int id) {
        subjectJPARepository.delete(id);
    }
}
