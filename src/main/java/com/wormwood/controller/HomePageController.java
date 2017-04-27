package com.wormwood.controller;

import com.wormwood.DTO.User;

import com.wormwood.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by kasimodo on 2016-07-26.
 */

@Controller
public class HomePageController {

    private final Logger log = LoggerFactory.getLogger(HomePageController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String rootPage() {

        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {

        return "login";
    }
    @RequestMapping(value = "/gg", method = RequestMethod.GET)
    public @ResponseBody String gg() {



        return "gg";
    }
}
