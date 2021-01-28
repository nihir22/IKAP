/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iitkgp.ikap.controller;

import com.iitkgp.ikap.domain.Alum;
import com.iitkgp.ikap.service.AlumService;
import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Nihir
 */
@Controller
public class LoginController {

    @Resource
    private AlumService alumService;

    @RequestMapping("login")
    public String login(Alum alum, HttpSession session, Model model) {
        Object right = alumService.validateAlum(alum.getAlum_roll(), alum.getAlum_dob());
        if (right != null) {
            alum = alumService.selByRoll(alum.getAlum_roll());
            model.addAttribute("alum", alum);
            session.setAttribute("userName", alum.getAlum_roll());
            return "profile.jsp";
        }
        model.addAttribute("error", "You are not registered with the portal. Please Register to continue...");
        return "redirect:register.jsp";
    }    
}
