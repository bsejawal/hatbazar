package com.hatbazar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: bsejawal
 * Date: 6/24/13
 * Time: 12:43 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/item")
public class ItemController {
    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "item/index";
    }



}
