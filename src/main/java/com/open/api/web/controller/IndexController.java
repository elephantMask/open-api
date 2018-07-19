package com.open.api.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by mt on 2017/5/3.
 */
@Controller
public class IndexController {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());


    @RequestMapping("/")
    public String index(@ModelAttribute("token") String token, Model model, HttpServletRequest request, HttpServletResponse resp){
        logger.info("==>跳转主页面");
        String url = "/index";

        return url;
    }

}

