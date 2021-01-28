/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iitkgp.ikap.controller;

import com.iitkgp.ikap.domain.Alum;
import com.iitkgp.ikap.service.AlumService;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Nihir
 */
@Controller
public class RegisterController {

    @Resource
    private AlumService alumService;

    @RequestMapping("register")
    public String register(Alum alum, Model model, HttpSession session) {
        alumService.insAlum(alum.getAlum_fname(), alum.getAlum_mname(), alum.getAlum_lname(), alum.getAlum_roll(), alum.getAlum_dob(), alum.getAlum_passingyear(), alum.getAlum_email());
        model.addAttribute("alum", alum);
        session.setAttribute("userName", alum.getAlum_roll());
        return "home.jsp";
    }

}
