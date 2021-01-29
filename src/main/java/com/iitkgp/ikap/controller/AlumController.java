/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iitkgp.ikap.controller;

import com.iitkgp.ikap.domain.Alum;
import com.iitkgp.ikap.service.AlumService;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Nihir
 */
@Controller
public class AlumController {

    private Alum alum;

    @Resource
    private AlumService alumService;


    @RequestMapping("toMain")
    public String toMain(String alum_roll, Model model) {
        alum = alumService.selByRoll(alum_roll);
        model.addAttribute("alum", alum);
        return "home.jsp";
    }
    @RequestMapping("nameTo")
    public String nameTo(String alum_roll, Model model) {
        alum = alumService.selByRoll(alum_roll);
        model.addAttribute("alum", alum);
        return "profile.jsp";
    }



}
