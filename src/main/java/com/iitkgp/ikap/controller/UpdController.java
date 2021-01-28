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
public class UpdController {

    @Resource
    private AlumService alumService;

    @RequestMapping("updAll")
    public String updAll(Alum alum, Model model) {
        try {
            alumService.updFirstName(alum.getAlum_roll(), alum.getAlum_fname());
            alumService.updMiddleName(alum.getAlum_roll(), alum.getAlum_mname());
            alumService.updLastName(alum.getAlum_roll(), alum.getAlum_lname());
            alumService.updDOB(alum.getAlum_roll(), alum.getAlum_dob());
            alumService.updGender(alum.getAlum_roll(), alum.getAlum_gender());
            alumService.updDegree(alum.getAlum_roll(), alum.getAlum_degree());
            alumService.updDepartment(alum.getAlum_roll(), alum.getAlum_dep());
            alumService.updPassingYear(alum.getAlum_roll(), alum.getAlum_passingyear());
            alumService.updHall(alum.getAlum_roll(), alum.getAlum_hall());
            alumService.updContact(alum.getAlum_roll(), alum.getAlum_contact());
            alumService.updEmail(alum.getAlum_roll(), alum.getAlum_email());
            alumService.updMaritialStatus(alum.getAlum_roll(), alum.getAlum_maritialstatus());
            model.addAttribute("alum", alumService.selByRoll(alum.getAlum_roll()));
            model.addAttribute("success", "����ɹ�");
            return "home.jsp";
        } catch (Exception e) {
            model.addAttribute("error", "����ʧ��");
            return "profile.jsp";
        }
    }
}
