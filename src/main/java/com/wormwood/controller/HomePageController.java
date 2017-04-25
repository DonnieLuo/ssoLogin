package com.wormwood.controller;

import com.wormwood.DTO.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by kasimodo on 2016-07-26.
 */

@Controller
public class HomePageController {

    private final Logger log = LoggerFactory.getLogger(HomePageController.class);

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
}
