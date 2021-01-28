/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iitkgp.ikap.controller;

import com.iitkgp.ikap.domain.Alum;
import com.iitkgp.ikap.service.AlumService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Nihir
 */
@Controller
public class AlumController {

    private Alum alum;

    @Resource
    private AlumService alumService;

//    @RequestMapping("register")
//    public String register(Alum alum, Model model, HttpSession session) {
//        alumService.insAlum(alum.getAlum_fname(), alum.getAlum_mname(), alum.getAlum_lname(), alum.getAlum_roll(), alum.getAlum_dob(),alum.getAlum_gender(), alum.getAlum_passingyear(), alum.getAlum_email());
//        model.addAttribute("alum", alum);
//        session.setAttribute("userName", alum.getAlum_roll());
//        return "user.jsp";
//    }
//    @RequestMapping("login")
//    public String login(Alum alum, HttpSession session, Model model) {
//        Object right = alumService.validateAlum(alum.getAlum_roll(), alum.getAlum_dob());
//        if (right != null) {
//            alum = alumService.selByRoll(alum.getAlum_roll());
//            model.addAttribute("alum", alum);
//            session.setAttribute("userName", alum.getAlum_roll());
//            return "main.jsp";
//        }
//        model.addAttribute("error", "You are not registered with the portal. Please Register to continue...");
//        return "redirect:register.jsp";
//    }
//    @RequestMapping("updAll")
//    public String updAll(Alum alum, Model model) {
//        try {
//            alumService.updFirstName(alum.getAlum_roll(), alum.getAlum_fname());
//            alumService.updMiddleName(alum.getAlum_roll(), alum.getAlum_mname());
//            alumService.updLastName(alum.getAlum_roll(), alum.getAlum_lname());
//            alumService.updDOB(alum.getAlum_roll(), alum.getAlum_dob());
//            alumService.updGender(alum.getAlum_roll(), alum.getAlum_gender());
//            alumService.updDegree(alum.getAlum_roll(), alum.getAlum_degree());
//            alumService.updDepartment(alum.getAlum_roll(), alum.getAlum_dep());
//            alumService.updPassingYear(alum.getAlum_roll(), alum.getAlum_passingyear());
//            alumService.updHall(alum.getAlum_roll(), alum.getAlum_hall());
//            alumService.updContact(alum.getAlum_roll(), alum.getAlum_contact());
//            alumService.updEmail(alum.getAlum_roll(), alum.getAlum_email());
//            alumService.updMaritialStatus(alum.getAlum_roll(), alum.getAlum_maritialstatus());
//            model.addAttribute("alum", alumService.selByRoll(alum.getAlum_roll()));
//            model.addAttribute("success", "����ɹ�");
//            return "user.jsp";
//        } catch (Exception e) {
//            model.addAttribute("error", "����ʧ��");
//            return "user.jsp";
//        }
//    }
//
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

//    @RequestMapping("selAllName")
//    @ResponseBody
//    public List<String> selAllName() {
//        return alumService.selAllRoll();
//    }

}
