package com.hatbazar.controllers;

import com.hatbazar.domains.User;
import com.hatbazar.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: bsejawal
 * Date: 6/4/13
 * Time: 9:41 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    UserService userService;


    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("login/index", "command", new User());
    }

    @RequestMapping(value = "/authencate", method = RequestMethod.POST)
    public String authencate(@ModelAttribute("SpringWeb")User user,
                             ModelMap model) {
        model.addAttribute("username", user.getUsername());
        model.addAttribute("password", user.getPassword());
        model.addAttribute("message", "User form parameter :::: ");
        userService.authencate(user);
        return "login/profile";
    }
}
