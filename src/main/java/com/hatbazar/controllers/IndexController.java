package com.hatbazar.controllers;

import com.hatbazar.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;

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
    @Autowired
    ItemService itemService;

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model) throws IllegalAccessException, SQLException, InstantiationException {
        model.addAttribute("list", itemService.getDefaultItems());
        return "index/welcome";
    }
    @RequestMapping(value = "/contact")
    public String contact(ModelMap model){
        return "index/contact";
    }
    @RequestMapping(value = "/about")
    public String about(ModelMap model){
        return "index/about";
    }
}
