package com.hbexample.pkg;

public class Employee {

  private int emp_no = 1;
  private String first_name, last_name;
  private String birth_date, hire_date;

  public int getemp_no() {
    return emp_no;
  }

  public void setemp_no(int id) {
    this.emp_no = id;
  }

  public String getfirst_name() {
    return first_name;
  }

  public void setfirst_name(String name) {
    this.first_name = name;
  }

  public String getlast_name() {
    return last_name;
  }

  public void setlast_name(String name) {
    this.last_name = name;
  }

  public String getbirth_date() {
    return birth_date; 
  }

  public void setbirth_date(String date) {
    this.birth_date = date;
  }

  public String gethire_date() {
    return hire_date; 
  }

  public void sethire_date(String date) {
    this.hire_date = date;
  }


}

