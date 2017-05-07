package ru.kpfu.itis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entities.FacultyJPA;
import ru.kpfu.itis.entities.GroupJPA;
import ru.kpfu.itis.repositories.GroupJPARepository;

import java.util.List;
import java.util.Set;

/**
 * Created by Danil on 04.05.2017.
 */
@Service
public class GroupDAO implements GroupDAOInt{
    @Autowired
    GroupJPARepository groupJPARepository;
    @Override
    public List<GroupJPA> findAllGroup() {
        return (List<GroupJPA>) groupJPARepository.findAll();
    }

    @Override
    public Set<GroupJPA> findAllGroupByFaculty(FacultyJPA faculty) {
        return faculty.getGroups();
    }

    @Override
    public GroupJPA findGroupByName(String name) {
        return groupJPARepository.findGroupJPAByName(name);
    }

    @Override
    public void addGroup(String number, int countOfStudents, String starosta, String numberOfStarosta, FacultyJPA faculty) {
        groupJPARepository.save(new GroupJPA(number,countOfStudents,starosta,numberOfStarosta,faculty));
    }

    @Override
    public void deleteGroup(int id) {
        groupJPARepository.delete(id);
    }
}
