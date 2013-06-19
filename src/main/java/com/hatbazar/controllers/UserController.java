package com.hatbazar.controllers;

import com.hatbazar.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello hellsfsadfasf world!");
		return "hello";
	}
    @RequestMapping("/profile")
    public String profile(HttpServletRequest request) throws IllegalAccessException, InstantiationException {
        String toRet;
        if(request.getSession().getAttribute("isLogin").toString().equalsIgnoreCase("true")){
            request.setAttribute("user",userService.get(Integer.parseInt(request.getSession().getAttribute("userId").toString())));
            toRet = "login/profile";
        }else {
            toRet = "redirect:/login";
        }
        return toRet;
    }
}