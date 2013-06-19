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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

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
    public String index() {
        return "login/index";
    }

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public String authenticate(HttpServletRequest request,HttpServletResponse response, RedirectAttributes attributes) {
        User user = new User();
        user.setPassword(request.getParameter("password").toString());
        user.setUsername(request.getParameter("username").toString());
        try {
            if (userService.authenticate(user, request)){
               return "redirect:/login/profile";
            }else {
                attributes.addFlashAttribute("error","The credentials you provided cannot be determined to be authentic.");
                return "redirect:/login";
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "redirect:login";
    }

}
