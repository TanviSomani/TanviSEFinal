package MVC_Project;

import java.util.Date;

public class StudentData {

    private String snumber;
    private String sname;
    private double gpa;

    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public StudentData(String snumber, String sname, int gpa) {
        this.snumber = snumber;
        this.sname = sname;
        this.gpa = gpa;
    }
}
