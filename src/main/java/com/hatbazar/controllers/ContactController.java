package com.hatbazar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: bsejawal
 * Date: 6/22/13
 * Time: 1:33 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/contact")
public class ContactController {
    //Thank you for your e-mail.
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(HttpServletRequest request, HttpServletResponse response, RedirectAttributes attributes){
        attributes.addFlashAttribute("Thank you for you contact information will contact you soon..");
        return "tes";
    }
}
