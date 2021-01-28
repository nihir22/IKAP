/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iitkgp.ikap.service;

import com.iitkgp.ikap.domain.Alum;
import java.util.List;

/**
 *
 * @author Nihir
 */
public interface AlumService {

    Alum selById(int alum_id);

    Object validateAlum(String alum_roll, String alum_dob);

    Alum selByRoll(String alum_roll);

    void insAlum(String alum_fname, String alum_mname, String alum_lname, String alum_roll, String alum_dob, String alum_passingyear, String alum_email);

    List<String> selAllRoll();

    int selIdByRoll(String alum_roll);

    int selCount();

    void updFirstName(String alum_roll, String alum_fname);

    void updMiddleName(String alum_roll, String alum_mname);

    void updLastName(String alum_roll, String alum_lname);

    void updDOB(String alum_roll, String alum_dob);

    void updGender(String alum_roll, String alum_gender);

    void updDegree(String alum_roll, String alum_degree);

    void updDepartment(String alum_roll, String alum_dep);

    void updPassingYear(String alum_roll, String alum_passingyear);

    void updHall(String alum_roll, String alum_hall);

    void updContact(String alum_roll, String alum_contact);

    void updEmail(String alum_roll, String alum_email);

    void updMaritialStatus(String alum_roll, String alum_maritialstatus);

}
