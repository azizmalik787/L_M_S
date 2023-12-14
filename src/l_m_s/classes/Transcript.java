/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l_m_s.classes;

import java.util.ArrayList;

/**
 *
 * @author azizm
 */
public class Transcript {
    boolean database;
    int SemID;
    int SID;
    int CID;
    String Grade;
    //ArrayList<Course_Grade> SemesterCourses;

    public Transcript(int SemID, int SID,int CID , String Grade) {
        this.SemID = SemID;
        this.SID = SID;
        this.CID=CID;
        this.Grade=Grade;
        database = false;
    }
    public Transcript(int SemID, int SID,int CID , String Grade,boolean data) {
        this.SemID = SemID;
        this.SID = SID;
        this.CID=CID;
        this.Grade=Grade;
        this.database = data;
    }

    public boolean isDatabase() {
        return database;
    }
    
    
    public int getSemID() {
        return SemID;
    }

    public int getSID() {
        return SID;
    }

    public int getCID() {
        return CID;
    }

    public void setCID(int CID) {
        this.CID = CID;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }
    public void details()
    {
        System.out.println("Semester ID = "+this.SemID);
        System.out.println("Student ID = "+this.SID);
        System.out.println("Course ID = "+this.CID);
        System.out.println("Grade = "+this.Grade);
    }
    
    
}
