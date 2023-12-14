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
public class Section {
    
    private static int id=5000;
    private final int Max=1;
    
    int courseID;
    int secID;
    int Strength;
    
    
    ArrayList<studentStudying> studying;
    

    public Section(int ID) {
       // whichOfferedCourse=offrd;
        this.id++;
        this.secID=this.id;
        this.courseID=ID;
        this.Strength=0;
        studying = new ArrayList<>();
        //teaching=null;
    }
    public int getStrength() {
        return Strength;
    }
    public int getSecID()
    {
        return this.secID;
    }
    public String getGrade(int sid)
    {
        for (int i = 0; i < studying.size(); i++) {
            if(studying.get(i).getStudentID()==sid)
            {
                return studying.get(i).getGrade();
            }
            
        }
        return null;
    }
    public int getCourseID() {
        return courseID;
    }

    public ArrayList<studentStudying> getStudying() {
        return studying;
    }
    public void addAttendance( int sid , char status)
    {
        for (int i = 0; i < studying.size(); i++) {
            if(sid == studying.get(i).getStudentID())
            {
                studying.get(i).addAttendance(status);
            }
            
        }
    }
    public void addGrade(int sid,String grade)
    {
        for (int i = 0; i < studying.size(); i++) {
            if(sid == studying.get(i).getStudentID())
            {
                studying.get(i).setGrade(grade);
            }
            
        }
    }

    public boolean addStudentToSection( int roll) {
        if(Strength<Max)
        {
            this.Strength++;
            this.studying.add(new studentStudying(this.secID, roll));
            return true;
        }
        return false;
            
    }
    public void dropStudent(int roll)
    {
        for (int i = 0; i < studying.size(); i++) {
            if(studying.get(i).getStudentID()==roll)
            {
                studying.remove(i);
                Strength--;
            }
            
        }
    }
    public void addMarks(int sid,double marks)
    {
        for (int i = 0; i < studying.size(); i++) {
            if(studying.get(i).getStudentID()==sid)
            {
                studying.get(i).updateMarks(marks);
            }
        }
    }
    public void SecDetail()
    {
        System.out.println("Course ID = "+this.courseID);
        System.out.println("Section ID = "+this.secID);
        System.out.println("Section Strength = "+this.Strength);
        for (int i = 0; i < studying.size(); i++) {
            studying.get(i).details();
        }
        
    }
    
    
}
