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
public class Teacher extends Person{
    private static int id=2000;
    private String Designation;
    private int tId;
    String pass;
    ArrayList<Integer> sec_teaching;
    //list section

    public Teacher(String Designation, String fName, String lName,int contact,String adr,String gender,String pass) {
        super(fName, lName, contact, adr, gender,false);
        this.Designation = Designation;
        this.id++;
        this.pass=pass;
        this.tId = this.id;
        sec_teaching=new ArrayList<>();
    }
    public Teacher(int id,String Designation, String fName, String lName,int contact,String adr,String gender,String pass) {
        super(fName, lName, contact, adr, gender,true);
        this.Designation = Designation;
        this.id =id;
        this.pass=pass;
        this.tId = this.id;
        sec_teaching=new ArrayList<>();
    }
    public String getPass() {
        return pass;
    }
    
    int getId()
    {
        return this.tId;
    }
    public void addSection(int x)
    {
        this.sec_teaching.add(x);
    }

    public int gettId() {
        return tId;
    }

    public ArrayList<Integer> getSec_teaching() {
        return sec_teaching;
    }
    
    
    @Override
    public void Details()
    {
        System.out.println("Teacher ID= "+this.tId);
        System.out.println("Teacher Name= "+this.fName+" "+this.lName);
        System.out.println("Designation= "+this.Designation+"\n");
        for (int i = 0; i < sec_teaching.size(); i++) {
            System.out.println("Section ID Teaching: "+this.sec_teaching.get(i));
        }
        System.out.println("\n");
    }
    
}
