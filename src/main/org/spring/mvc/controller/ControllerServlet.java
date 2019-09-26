package org.spring.mvc.controller;

import org.spring.mvc.bean.BeanUsers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@SessionAttributes("users")

public class ControllerServlet {
    @ModelAttribute("users")
    public BeanUsers sessionBeanUsers(){
        return new BeanUsers();
    }
    @RequestMapping(value = "/", method = RequestMethod.GET )
    public ModelAndView registration(@ModelAttribute("users") BeanUsers users) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(users);
        return new ModelAndView("/registration", "command", new BeanUsers());
    }
    @RequestMapping(value = "users", method = RequestMethod.GET)
    public ModelAndView users(@ModelAttribute("users") BeanUsers users){
        return new ModelAndView("users","command", new BeanUsers());
    }
    @RequestMapping(value = "/BeanUsers", method = RequestMethod.POST)
    public ModelAndView addUsers(BeanUsers users, ModelMap model){
        ModelAndView modelAndView = new ModelAndView();
        model.addAttribute("id", users.getId());
        model.addAttribute("name", users.getName());
        modelAndView.addObject(users);
        modelAndView.setViewName("/result");
        return modelAndView;

    }

}

