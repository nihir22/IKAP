///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.iitkgp.ikap.controller;
//
//import com.iitkgp.ikap.domain.Alum;
//import com.iitkgp.ikap.service.AlumService;
//import javax.annotation.Resource;
//import javax.servlet.http.HttpSession;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
///**
// *
// * @author Nihir
// */
//@Controller
//public class ProfileController {
//
//    private Alum alum;
//
//    @Resource
//    private AlumService alumService;
//
//    @RequestMapping("profile")
//    public String profile(String alum_roll, Model model, HttpSession session) {
//        alum = alumService.selByRoll(alum_roll);
//        model.addAttribute("alum", alum);
//        session.setAttribute("alum", alum);
//        return "profile.jsp";
//    }
//
//    @RequestMapping("home")
//    public String home(String alum_roll, Model model, HttpSession session) {
//        alum = alumService.selByRoll(alum_roll);
//        model.addAttribute("alum", alum);
//        session.setAttribute("alum", alum);
//        return "home.jsp";
//    }
//}
