package com.hatbazar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index(ModelMap model) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login/index");
//        model.addAttribute("message", "Welcome to Hatbazar Systam!");
        return mav;
    }
}
