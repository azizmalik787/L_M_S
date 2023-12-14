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
public class Course_Grade {
    int CID;
    String Grade;

    public Course_Grade(int CID, String Grade) {
        this.CID = CID;
        this.Grade = Grade;
    }

    public int getCID() {
        return CID;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }
    
    
    
}
