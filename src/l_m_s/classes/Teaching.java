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
public class Teaching {
    private static int id=1000;
    int teachID;
    int sectionID;
    int teacherID;

    public Teaching(int TID,int SECID) {
        id++;
        teachID=id;
        sectionID=SECID;
        teacherID=TID;
    }

    public int getTeachID() {
        return teachID;
    }

    public int getSectionID() {
        return sectionID;
    }

    public int getTeacherID() {
        return teacherID;
    }
    
    public void Details()
    {
        System.out.println("Teaching ID"+teachID);
        System.out.println("Section ID"+sectionID);
        System.out.println("Teacher"+teacherID);
    }
}
