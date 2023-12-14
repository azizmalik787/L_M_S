/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l_m_s.classes;

import java.util.Date;

/**
 *
 * @author azizm
 */
public class Attendance {
    private static int id=0;
    int attendID;//Attendance ID
    int secID;//section ID
    int sid;//student ID
    String date;//DDate 
    char status;//Status present, Absent or Late

    public Attendance(String date, char status, int secID,int sid) {
        Attendance.id++;
        this.sid=sid;
        attendID=Attendance.id;
        this.date = date;
        this.status = status;
        this.secID=secID;
    }
    
    public int getSecID() {
        return secID;
    }

    public int getSid() {
        return sid;
    }

    public int getAttendID() {
        return attendID;
    }
    
    public String getDate() {
        return date;
    }

    public char getStatus() {
        return status;
    }
    
    
}
