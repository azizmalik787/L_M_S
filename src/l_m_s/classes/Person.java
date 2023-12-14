/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l_m_s.classes;

/**
 *
 * @author azizm
 */
public abstract class Person {
    static int num=99;
    int id;
    String fName,lName;
    int contact;
    String address;
    String gender;
    boolean isNew;

    public Person(String fName, String lName,int contact,String adr,String gender,boolean x) {
        num++;
        
        this.id = num;
        this.fName = fName;
        this.lName = lName;
        this.contact=contact;
        this.address=adr;
        this.gender=gender;
        this.isNew=x;
        
    }

    public boolean isIsNew() {
        return isNew;
    }
    

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }
    
    abstract public void Details();
}