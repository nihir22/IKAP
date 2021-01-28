/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iitkgp.ikap.service.impl;

import com.iitkgp.ikap.domain.Alum;
import com.iitkgp.ikap.mapper.AlumMapper;
import com.iitkgp.ikap.service.AlumService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nihir
 */
@Service
public class AlumServiceImpl implements AlumService {

    @Resource
    private AlumMapper alumMapper;

    @Override
    public Alum selById(int alum_id) {
        Alum alum = alumMapper.selById(alum_id);
        return alum;
    }

    @Override
    public Object validateAlum(String alum_roll, String alum_dob) {
        Object right = alumMapper.validateAlum(alum_roll, alum_dob);
        return right;
    }

    @Override
    public Alum selByRoll(String alum_roll) {
        Alum alum = alumMapper.selByRoll(alum_roll);
        return alum;
    }

    @Override
    public List<String> selAllRoll() {
        List<String> rolls = alumMapper.selAllRoll();
        return rolls;
    }

    @Override
    public int selIdByRoll(String alum_roll) {
        return alumMapper.selIdByRoll(alum_roll);
    }

    @Override
    public int selCount() {
        return alumMapper.selCount();
    }

    @Override
    public void updFirstName(String alum_roll, String alum_fname) {
        alumMapper.updFirstName(alum_roll, alum_fname);
    }

    @Override
    public void updMiddleName(String alum_roll, String alum_mname) {
        alumMapper.updMiddleName(alum_roll, alum_mname);
    }

    @Override
    public void updLastName(String alum_roll, String alum_lname) {
        alumMapper.updLastName(alum_roll, alum_lname);
    }

    @Override
    public void updDOB(String alum_roll, String alum_dob) {
        alumMapper.updDOB(alum_roll, alum_dob);
    }

    @Override
    public void updGender(String alum_roll, String alum_gender) {
        alumMapper.updGender(alum_roll, alum_gender);
    }

    @Override
    public void updDegree(String alum_roll, String alum_degree) {
        alumMapper.updDegree(alum_roll, alum_degree);
    }

    @Override
    public void updDepartment(String alum_roll, String alum_dep) {
        alumMapper.updDepartment(alum_roll, alum_dep);
    }

    @Override
    public void updPassingYear(String alum_roll, String alum_passingyear) {
        alumMapper.updPassingYear(alum_roll, alum_passingyear);
    }

    @Override
    public void updHall(String alum_roll, String alum_hall) {
        alumMapper.updHall(alum_roll, alum_hall);
    }

    @Override
    public void updContact(String alum_roll, String alum_contact) {
        alumMapper.updContact(alum_roll, alum_contact);
    }

    @Override
    public void updEmail(String alum_roll, String alum_email) {
        alumMapper.updEmail(alum_roll, alum_email);
    }

    @Override
    public void updMaritialStatus(String alum_roll, String alum_maritialstatus) {
        alumMapper.updMaritialStatus(alum_roll, alum_maritialstatus);
    }

    /**
     *
     * @param alum_fname
     * @param alum_mname
     * @param alum_lname
     * @param alum_roll
     * @param alum_dob
     * @param alum_passingyear
     * @param alum_email
     */
    @Override
    public void insAlum(String alum_fname, String alum_mname, String alum_lname, String alum_roll, String alum_dob, String alum_passingyear, String alum_email) {
        alumMapper.insAlum(alum_fname, alum_mname, alum_lname, alum_roll, alum_dob, alum_passingyear, alum_email);
    }

}
