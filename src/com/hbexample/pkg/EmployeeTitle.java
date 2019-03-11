package com.hbexample.pkg;

public class EmployeeTitle {

    private int emp_no = 1;
    private String title, from_date, to_date;

    public int getemp_no() {
      return emp_no;
    }

    public void setemp_no(int emp_no) {
      this.emp_no = emp_no;
    }

    public String gettitle() {
      return this.title;
    }

    public void settitle(String title) {
      this.title = title;
    }
    
    public String getfrom_date() {
      return this.from_date;
    }

    public void setfrom_date(String date) {
      this.from_date = date;
    }

    public String getto_date() {
      return this.to_date;
    }
    
    public void setto_date(String date) {
      this.to_date = date;
    }

    public String toString() {
        return emp_no + " " + title + " " + from_date;
    }
}
