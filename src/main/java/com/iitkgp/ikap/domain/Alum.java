/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iitkgp.ikap.domain;

/**
 *
 * @author Nihir
 */
public class Alum {

    private int alum_id;
    private String alum_fname;
    private String alum_mname;
    private String alum_lname;
    private String alum_dob;
    private String alum_gender;
    private String alum_roll;
    private String alum_degree;
    private String alum_dep;
    private String alum_passingyear;
    private String alum_hall;
    private String alum_contact;
    private String alum_email;
    private String alum_maritialstatus;

    public String getAlum_maritialstatus() {
        return alum_maritialstatus;
    }

    public void setAlum_maritialstatus(String alum_maritialstatus) {
        this.alum_maritialstatus = alum_maritialstatus;
    }

    public int getAlum_id() {
        return alum_id;
    }

    public void setAlum_id(int alum_id) {
        this.alum_id = alum_id;
    }

    public String getAlum_fname() {
        return alum_fname;
    }

    public void setAlum_fname(String alum_fname) {
        this.alum_fname = alum_fname;
    }

    public String getAlum_mname() {
        return alum_mname;
    }

    public void setAlum_mname(String alum_mname) {
        this.alum_mname = alum_mname;
    }

    public String getAlum_lname() {
        return alum_lname;
    }

    public void setAlum_lname(String alum_lname) {
        this.alum_lname = alum_lname;
    }

    public String getAlum_dob() {
        return alum_dob;
    }

    public void setAlum_dob(String alum_dob) {
        this.alum_dob = alum_dob;
    }

    public String getAlum_gender() {
        return alum_gender;
    }

    public void setAlum_gender(String alum_gender) {
        this.alum_gender = alum_gender;
    }

    public String getAlum_roll() {
        return alum_roll;
    }

    public void setAlum_roll(String alum_roll) {
        this.alum_roll = alum_roll;
    }

    public String getAlum_degree() {
        return alum_degree;
    }

    public void setAlum_degree(String alum_degree) {
        this.alum_degree = alum_degree;
    }

    public String getAlum_dep() {
        return alum_dep;
    }

    public void setAlum_dep(String alum_dep) {
        this.alum_dep = alum_dep;
    }

    public String getAlum_passingyear() {
        return alum_passingyear;
    }

    public void setAlum_passingyear(String alum_passingyear) {
        this.alum_passingyear = alum_passingyear;
    }

    public String getAlum_hall() {
        return alum_hall;
    }

    public void setAlum_hall(String alum_hall) {
        this.alum_hall = alum_hall;
    }

    public String getAlum_contact() {
        return alum_contact;
    }

    public void setAlum_contact(String alum_contact) {
        this.alum_contact = alum_contact;
    }

    public String getAlum_email() {
        return alum_email;
    }

    public void setAlum_email(String alum_email) {
        this.alum_email = alum_email;
    }

    @Override
    public String toString() {
        return "Alum{" + "alum_id=" + alum_id + ", alum_fname=" + alum_fname + ", alum_mname=" + alum_mname + ", alum_lname=" + alum_lname + ", alum_dob=" + alum_dob + ", alum_gender=" + alum_gender + ", alum_roll=" + alum_roll + ", alum_degree=" + alum_degree + ", alum_dep=" + alum_dep + ", alum_passingyear=" + alum_passingyear + ", alum_hall=" + alum_hall + ", alum_contact=" + alum_contact + ", alum_email=" + alum_email + ", alum_maritialstatus=" + alum_maritialstatus + '}';
    }

}
