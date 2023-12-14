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
public class Student extends Person{
    
    private static int id=3000;
    String pass;
    int roll;
    int currentSem;
    ArrayList<Transcript> semesters;
   //static boolean registration;
    ArrayList<Integer> registeredSections;

    public Student( String fName, String lName,int contact,String adr,String gender,String pass,int semID) {
        super(fName, lName, contact, adr, gender,false);
        id++;
        this.pass=pass;
        this.currentSem=semID;
        this.roll = this.id;
        registeredSections= new ArrayList<>();
        //semesters = new ArrayList<>();
    }
    public Student( int id,String fName, String lName,int contact,String adr,String gender,String pass,int semID) {
        super(fName, lName, contact, adr, gender,true);
        this.id=id;
        this.pass=pass;
        this.roll = id;
        registeredSections= new ArrayList<>();
        this.currentSem=semID;
        //semesters = new ArrayList<>();
        //reg= new ArrayList<>();
    }

    public int getCurrentSem() {
        return currentSem;
    }

    public String getPass() {
        return pass;
    }
    
    public void removecourse(int cid){
        for (int i = 0; i < this.registeredSections.size(); i++) {
            if(this.registeredSections.get(i)==cid){
                this.registeredSections.remove(i);
            }
            
        }
    }
    public void addRegisteredCourse(int r)
    {
        boolean registered = false;
        for (int i = 0; i < registeredSections.size(); i++) {
           if(registeredSections.get(i) == r)
           {
            registered=true;   
           }
        }
        if(registered==false)
            registeredSections.add(r);
        //semesters.add(new Transcript(semid,this.roll,cid,grade));
    }
 
    public int getRoll() {
        return roll;
    }
    public ArrayList<Integer> getCourseList()
    {
        return this.registeredSections;
    }
    
    
    @Override
    public void Details()
    {
        System.out.println("Student Name= "+this.fName+" "+this.lName);
        System.out.println("Roll Number= "+this.roll);
        for (int i = 0; i < registeredSections.size(); i++) {
            System.out.println("Registered Section = "+registeredSections.get(i));
        }
    }
    
    
    
}