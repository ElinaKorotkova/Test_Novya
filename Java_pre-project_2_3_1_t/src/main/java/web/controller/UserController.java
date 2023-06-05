package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import web.model.User;
import web.service.UserService;
import web.service.UserServiceImpl;

import java.util.List;

@Controller
public class UserController {
    private UserService userService = new UserServiceImpl();


    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView allUser(){
        List<User> user = userService.allUser();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
    @RequestMapping(value ="/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editPage(@PathVariable("id") int id){
        User user = userService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        modelAndView.addObject("user",user);
        return modelAndView;
    }

    @RequestMapping(value ="/edit/", method = RequestMethod.GET)
    public ModelAndView editUser(@ModelAttribute("user") User user){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("refirect:/");
        userService.edit(user);
        return modelAndView;
    }
}

