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
public class OfferedCourse {
    public static int id=4000;
    int courseID;
    ArrayList<Section> sections;

    public OfferedCourse(int cID) {
        this.courseID=cID;
        sections= new ArrayList<>();
        for (int i = 0; i <3; i++) {
           // sections.add(new Section());
        }
    }
    public void offeredCourseDetails()
    {
        System.out.println("Course ID: "+this.courseID);
        for (int i = 0; i<this.sections.size(); i++) {
            sections.get(i).SecDetail();
        }
    }
    
}
