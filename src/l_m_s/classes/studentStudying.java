/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l_m_s.classes;

import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author azizm
 */
public class studentStudying {  
    private static int count=7000;
    
    
    int rId;
    int studentID;
    int secID;
    double marks;
    String Grade;
    ArrayList<Attendance> attendance;
    
    
    private static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
    private static String today() {
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
    return sdf.format(cal.getTime());
    }

    public ArrayList<Attendance> getAttendance() {
        return attendance;
    }
    
    
    
    

    public studentStudying(int section , int student) {
        this.rId =(count+=1) ;
        this.Grade = "I";
        this.attendance =new ArrayList<>();
        this.marks = 0.0f;
        this.secID=section;
        this.studentID=student;
        this.addAttendance('a');
        this.addAttendance('p');
        this.addAttendance('a');
    }
    
    public void addAttendance(char status)
    {
        this.attendance.add(new Attendance(this.today(),status,this.secID,this.studentID));
    }
    public String getGrade() {
        return Grade;
    }

    public int getrId() {
        return rId;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }
    
    public int getStudentID() {
        return studentID;
    }

    public int getSecID() {
        return secID;
    }
    public void updateMarks(double mark)
    {
        if(mark>0)
            this.marks=mark;
    }
    


    public double getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
    public void details()
    {
        System.out.println("Studying ID = "+this.rId);
        System.out.println("Student ID = "+this.studentID);
        System.out.println("Section Section ID = "+this.secID);
        System.out.println("Grade = "+this.Grade);
        System.out.println("Attendance = "+this.attendance);
        System.out.println("Marks = "+this.marks);
    }
}
