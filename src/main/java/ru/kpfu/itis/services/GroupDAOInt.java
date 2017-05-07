package ru.kpfu.itis.services;

import org.springframework.stereotype.Service;
import ru.kpfu.itis.entities.FacultyJPA;
import ru.kpfu.itis.entities.GroupJPA;

import java.util.List;
import java.util.Set;

/**
 * Created by Danil on 04.05.2017.
 */
@Service
public interface GroupDAOInt {
    public List<GroupJPA> findAllGroup();
    public Set<GroupJPA> findAllGroupByFaculty(FacultyJPA faculty);
    public GroupJPA findGroupByName(String name);
    void addGroup(String number,int countOfStudents, String starosta, String numberOfStarosta, FacultyJPA faculty);
    void deleteGroup(int id);
}
