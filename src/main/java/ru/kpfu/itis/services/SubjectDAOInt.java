package ru.kpfu.itis.services;

import org.springframework.stereotype.Service;
import ru.kpfu.itis.entities.FacultyJPA;
import ru.kpfu.itis.entities.GroupJPA;
import ru.kpfu.itis.entities.SubjectsJPA;
import ru.kpfu.itis.entities.VuzJPA;

import java.util.List;
import java.util.Set;

/**
 * Created by Danil on 04.05.2017.
 */
@Service
public interface SubjectDAOInt {
    public List<SubjectsJPA> findAllSubjects();
    public Set<SubjectsJPA> findAllSubjectyByGroup(GroupJPA group);
    void addSubject(String name, String beginTime, String endTime, String day, Set<GroupJPA> groups);
    void deleteSubject(int id);
}
