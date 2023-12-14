/*//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l_m_s;

/**
 *
 * @author azizm
 */
import l_m_s.classes.*;
public class L_M_S {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Admin ad = Admin.getinstance(); //new Admin("Head CS", "Aftab", "Khadim",7924871,"asjdjhad","Male");
       // System.out.println(ad.student.get(0).getPass());
        //System.out.println(ad.teacher.get(0).getPass());
        
//        ad.Details();
        ad.OpenRegistration();
//       // ad.showTeachers();
//        //ad.showOfferedCoursesDetails();
        ad.assignTeacherToCourse();
        
        ad.Commit();
        //System.out.println(ad.getCourseNameFromSectionID(5001));
     //   ad.showStudents();
//        ad.showAssigned();
//        ad.showTeachers();
//        ad.addStudentToSection(6006, 5001, 3001);
//        ad.addStudentToSection(6006, 5003, 3001);
//        ad.showStudents();
//        ad.DropStudent(3001, 5003);
//        ad.showStudents();
        //ad.showAllCourses();
      /*  ad.LoadData();
        ad.showStudents();
        ad.showTeachers();
        ad.showAllCourses();
        ad.OpenRegistration();
        ad.assignTeacherToCourse();
        ad.showTeachers();
        ad.showOfferedCoursesDetails();*/
       // ad.Commit();
    }
    
    
}
