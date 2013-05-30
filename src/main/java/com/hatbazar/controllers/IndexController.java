package com.hatbazar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: bsejawal
 * Date: 5/29/13
 * Time: 9:23 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("message", "Welcome to Hatbazar Systam!");
        return "index/welcome";
    }
}
