package ru.kpfu.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import ru.kpfu.itis.entities.UserJPA;
import ru.kpfu.itis.model.User;
import ru.kpfu.itis.services.UserDAOInt;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by Danil on 04.05.2017.
 */
@Controller("/reg")
public class RegController {
    @Autowired
    UserDAOInt userDAO;

    //Registration and auth forms GET
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String regFormGet(Map map) {
        map.put("user", new User());
        return "regForm";
    }

    @RequestMapping(value = "/authentication", method = RequestMethod.GET)
    public String authFormGet() {
        return "authForm";
    }

    //Registration and auth forms POST
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String regFormPost(@Valid @ModelAttribute("user") User user,
                              BindingResult result) {
        if(result.hasErrors()){
            return "regForm";
        }
        else {
            userDAO.addUser(new UserJPA(user.getName(), user.getEmail(), user.getPassword()));
            return "redirect:"+ MvcUriComponentsBuilder.fromMappingName("TC#home").build();
        }
    }

    @RequestMapping(value = "/authentication", method = RequestMethod.POST)
    public String authFormPost() {
        return "redirect:"+ MvcUriComponentsBuilder.fromMappingName("TC#home").build();
    }
}
