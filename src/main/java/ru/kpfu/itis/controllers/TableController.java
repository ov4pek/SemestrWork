package ru.kpfu.itis.controllers;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.kpfu.itis.annotations.MyAnnotation;
import ru.kpfu.itis.entities.*;
import ru.kpfu.itis.services.*;

import java.util.*;

@Controller
@RequestMapping("/")
public class TableController {

    @Autowired
    private CityDAOInt cityDAO;
    @Autowired
    private VuzDAOInt vuzDAO;
    @Autowired
    private FacultyDAOInt facultyDAO;
    @Autowired
    private SubjectDAOInt subjectDAO;
    @Autowired
    private GroupDAOInt groupDAO;

    @MyAnnotation
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String startPage() {
        return "startPage";
    }

    @MyAnnotation
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        return "main";
    }

    @MyAnnotation
    @RequestMapping(value = "/city/{nameCity}", method = RequestMethod.GET)
    public @ResponseBody
    String getKazanUniversities(@PathVariable String nameCity) {

        CityJPA cityJPA = cityDAO.findCityByName(nameCity);
        List<VuzJPA> foo = new LinkedList<>(vuzDAO.findAllVuzByCity(cityJPA));
//        kostil'
        for (VuzJPA k :
                foo) {
            k.getCity().setVuzs(null);
            k.setFaculty(null);
        }
        String json = new Gson().toJson(foo);
        return json;
    }

    @MyAnnotation
    @RequestMapping(value = "/university/{univer}", method = RequestMethod.GET)
    public @ResponseBody
    String getKFUFaculties(@PathVariable String univer) {

        VuzJPA vuzJPA = vuzDAO.findVuzByName(univer);
        List<FacultyJPA> foo = new LinkedList<>(facultyDAO.findAllFacultyByVuz(vuzJPA));
        //        kostil'
        for (FacultyJPA k :
                foo) {
            k.getVuz().setFaculty(null);
            k.getVuz().setCity(null);
            for (GroupJPA kk :
                    k.getGroups()) {
                kk.setFaculty(null);
                kk.setVuz(null);
                for(SubjectsJPA kkk: kk.getSubjects()){
                    kkk.setGroups(null);
                }
            }
        }
        String json = new Gson().toJson(foo);
        return json;
    }

    @RequestMapping(value = "/faculty/{faculty}")
    public @ResponseBody
    String getGroups(@PathVariable String faculty) {
        FacultyJPA facultyJPA = facultyDAO.findFacultyByName(faculty);
        List<GroupJPA> foo = new LinkedList<>(groupDAO.findAllGroupByFaculty(facultyJPA));
        foo.get(0).getNumber();
        //        kostil'
        for (GroupJPA k :
                foo) {
            k.setFaculty(null);
            k.setVuz(null);
            for(SubjectsJPA kk: k.getSubjects()){
                kk.setGroups(null);
            }

        }
        String json = new Gson().toJson(foo);
        return json;
    }

    @RequestMapping(value = "/raspis")
    public String getRaspis() {
        return "table";
    }


    @RequestMapping(value = "/find", method = RequestMethod.POST)
    public String findGroup() {

        return "redirect:/table";
    }


    @RequestMapping(value = "/table", method = RequestMethod.GET)
    public String init(@ModelAttribute("model") ModelMap model) {

        return "table";
    }

    @RequestMapping(value = "/href", method = RequestMethod.GET)
    public @ResponseBody
    String getHref() {

        return "/raspis/";
    }

    @RequestMapping(value = "/raspis/{group}", method = RequestMethod.GET)
    public String raspis(@PathVariable String group, Map map) {
        List<SubjectsJPA> subjects = new LinkedList<>(groupDAO.findGroupByName(group).getSubjects());
        map.put("list", subjects);
        return "table3";
    }
}
