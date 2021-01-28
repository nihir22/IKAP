/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iitkgp.ikap.mapper;

import com.iitkgp.ikap.domain.Alum;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 *
 * @author Nihir
 */
public interface AlumMapper {

    @Select("select * from alum where alum_id=#{arg0}")
    Alum selById(int alum_id);

    @Select("select * from alum where alum_roll=#{arg0} AND alum_dob=#{arg1}")
    Object validateAlum(String alum_roll, String alum_dob);

    @Select("select * from alum where alum_roll=#{arg0}")
    Alum selByRoll(String alum_roll);

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
    @Insert("insert into alum(alum_fname,alum_mname,alum_lname,alum_roll,alum_dob,alum_passingyear,alum_email) values(#{arg0},#{arg1},#{arg2},#{arg3},#{arg4},#{arg5},#{arg6})")
    void insAlum(String alum_fname, String alum_mname, String alum_lname, String alum_roll, String alum_dob, String alum_passingyear, String alum_email);

    @Select("select alum_roll from alum")
    List<String> selAllRoll();

    @Select("SELECT alum_id FROM alum where alum_roll=#{arg0}")
    int selIdByRoll(String alum_roll);

    @Select("select count(*) from alum")
    int selCount();

    @Update("update alum set alum_fname=#{arg1} where alum_roll=#{arg0} ")
    void updFirstName(String alum_roll, String alum_fname);

    @Update("update alum set alum_mname=#{arg1} where alum_roll=#{arg0} ")
    void updMiddleName(String alum_roll, String alum_mname);

    @Update("update alum set alum_lname=#{arg1} where alum_roll=#{arg0} ")
    void updLastName(String alum_roll, String alum_lname);

    @Update("update alum set alum_dob=#{arg1} where alum_roll=#{arg0} ")
    void updDOB(String alum_roll, String alum_dob);

    @Update("update alum set alum_gender=#{arg1} where alum_roll=#{arg0} ")
    void updGender(String alum_roll, String alum_gender);

    @Update("update alum set alum_degree=#{arg1} where alum_roll=#{arg0} ")
    void updDegree(String alum_roll, String alum_degree);

    @Update("update alum set alum_dep=#{arg1} where alum_roll=#{arg0} ")
    void updDepartment(String alum_roll, String alum_dep);

    @Update("update alum set alum_passingyear=#{arg1} where alum_roll=#{arg0} ")
    void updPassingYear(String alum_roll, String alum_passingyear);

    @Update("update alum set alum_hall=#{arg1} where alum_roll=#{arg0} ")
    void updHall(String alum_roll, String alum_hall);

    @Update("update alum set alum_contact=#{arg1} where alum_roll=#{arg0} ")
    void updContact(String alum_roll, String alum_contact);

    @Update("update alum set alum_email=#{arg1} where alum_roll=#{arg0} ")
    void updEmail(String alum_roll, String alum_email);

    @Update("update alum set alum_maritialstatus=#{arg1} where alum_roll=#{arg0} ")
    void updMaritialStatus(String alum_roll, String alum_maritialstatus);
}
