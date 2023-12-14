/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l_m_s;

/**
 *
 * @author azizm
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import l_m_s.classes.Admin;
import l_m_s.classes.Attendance;
import l_m_s.classes.Course;
import l_m_s.classes.Person;
import l_m_s.classes.Section;
import l_m_s.classes.Student;
import l_m_s.classes.Teacher;
import l_m_s.classes.Teaching;
import l_m_s.classes.Transcript;
import l_m_s.classes.studentStudying;

public class Connectivity {
    Connection con;
    Statement stmt;
    
    public Connectivity() //cons
    {
        try
        {
             String s = "jdbc:sqlserver://DESKTOP-8HVPMDT:1433;databaseName=l_m_s";
             con=DriverManager.getConnection(s,"new","1111");


            stmt = con.createStatement(); 
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void Load_Database(Admin admin)
    {
        try
        {
            Connectivity c1 = new Connectivity();
            c1.LoadStudents(admin);
            Connectivity c2 = new Connectivity();
            c2.LoadTeachers(admin);
            Connectivity c3 = new Connectivity();
            c3.LoadCourses(admin);
            Connectivity c4 = new Connectivity();
            c4.LoadTranscripts(admin);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void LoadTranscripts(Admin admin)
    {
        try
        {
            ResultSet rs=stmt.executeQuery("select * from Transcripts");
             while(rs.next())
             {
                 //Course c = new Course(rs.getInt("cID"), rs.getString("cName"), rs.getInt("cCreditHours"));
                 Transcript t = new Transcript(rs.getInt("SemID"), rs.getInt("SID"), rs.getInt("CID"), rs.getString("Grade"),true);
                 //admin.addCourse(c);
                 admin.addTranscript(t);
             }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void InsertTranscripts(ArrayList<Transcript> trans )
    {
        
        try
        {
        for (int i = 0; i < trans.size(); i++) {
            if(trans.get(i).isDatabase()==false)
            {
                String query="insert into Transcripts(CID, SID, SemID, Grade) values ("+ 
                        trans.get(i).getCID() +","+ trans.get(i).getSID()+ "," 
                        + trans.get(i).getSemID()+ ",'" +trans.get(i).getGrade() +"')";
                stmt.executeUpdate(query);
            }
                
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    
    
    
    
    public void LoadCourses(Admin admin)
    {
        try
        {
            ResultSet rs=stmt.executeQuery("select * from Courses");
             while(rs.next())
             {
                 Course c = new Course(rs.getInt("cID"), rs.getString("cName"), rs.getInt("cCreditHours"));
                 admin.addCourse(c);
             }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void LoadTeachers(Admin admin)
    {
        try
        {
            ResultSet rs=stmt.executeQuery("select * from Teachers");
             while(rs.next())
             {
                Connectivity c = new Connectivity();
                Person p = c.fetchPersonDetails(rs.getInt("PID"));
                Teacher t = new Teacher(rs.getInt("tID"), rs.getString("Disc"), p.getfName() , p.getlName(),p.getContact() ,p.getAddress(),p.getGender(),rs.getString("pass"));
                admin.addTeacher(t);
             }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void LoadStudents(Admin admin)
    {
        try
        {
            ResultSet rs1=stmt.executeQuery("select * from Students");
             while(rs1.next())
             {
                Connectivity c = new Connectivity();
                Person p = c.fetchPersonDetails(rs1.getInt("PID"));
                Student s = new Student(rs1.getInt("sID"),p.getfName() , p.getlName(),p.getContact() ,p.getAddress(),p.getGender(),rs1.getString("pass"),rs1.getInt("SemID"));
                admin.addStudent(s);
             }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    Person fetchPersonDetails(int pid)
    {
        try
        {
            ResultSet rs=stmt.executeQuery("select * from Persons where pID="+pid);
            while (rs.next())
            {
                Person temp = new Person(rs.getString("pFirstNAme"), rs.getString("pLastNAme"), rs.getInt("pContact"), rs.getString("pAddress"), rs.getString("pGender"),true) {

                    @Override
                    public void Details() {
                        return;
                    }
                };
                return temp;
            }       
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return null;
    }
    public void CommitTODatabase(Admin admin)
    {
        Connectivity c = new Connectivity();
        c.addSectionsToDatabase(admin.getSections());
        
        Connectivity c2 = new Connectivity();
        c2.addTeachingToDatabase(admin.getTeaching());
        
        Connectivity c3 = new Connectivity();
        c3.addStudentStudyingToDatabase(admin.getSections());
        
        Connectivity c4 = new Connectivity();
        c4.addAttendanceToDatabase(admin.getSections());
        
        Connectivity c5 = new Connectivity();
        c5.InsertTranscripts(admin.getTranscripts());
        
        
        
        
    }
    public void addAttendanceToDatabase(ArrayList<Section> sec)
    {
        for (int i = 0; i < sec.size(); i++) {
            for(int j=0;j< sec.get(i).getStudying().size();j++){
                Connectivity c = new Connectivity();
                c.populateAttendance( sec.get(i).getStudying().get(j).getAttendance());
            }
        }
    }
    public void addStudentStudyingToDatabase(ArrayList<Section> sec)
    {
        for (int i = 0; i < sec.size(); i++) {
            Connectivity c = new Connectivity();
            c.addStudentStudying(sec.get(i).getStudying());
        }
    }
    
    
    public void addStudentStudying(ArrayList<studentStudying> studying )
    {
        try
        {
        for (int i = 0; i < studying.size(); i++) {
            String query="insert into StudentStudying (regID, SID, SECID, grade, marks) values ("+ 
                     studying.get(i).getrId()+","+studying.get(i).getStudentID()+ ","+ studying.get(i).getSecID()+",'"+studying.get(i).getGrade() +"',"+studying.get(i).getMarks()+")";
            stmt.executeUpdate(query);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void addSectionsToDatabase(ArrayList<Section> sec)
    {
        try
        {
        for (int i = 0; i < sec.size(); i++) {
            String query="insert into Section (secID, CID, strength) values ("+ 
                     sec.get(i).getSecID()+","+sec.get(i).getCourseID() + ","+ sec.get(i).getStrength()+")";
            stmt.executeUpdate(query);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    public void addTeachingToDatabase(ArrayList<Teaching> arr)
    {
        try
        {
        for (int i = 0; i < arr.size(); i++) {
            String query="insert into Teaching (teachID,TID,SECID) values ("+ 
                    arr.get(i).getTeachID() +",'"+ arr.get(i).getTeacherID()+ "'," 
                    + arr.get(i).getSectionID()+")";
            stmt.executeUpdate(query);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void populateAttendance(ArrayList<Attendance> arr)
    {
        try
        {
        for (int i = 0; i < arr.size(); i++) {
            String query="insert into Attendance (attendID,SID,SECID,dat,Stat) values ("+ 
                    arr.get(i).getAttendID() +","+ arr.get(i).getSid()+ ","+ arr.get(i).getSecID()+",'"+ arr.get(i).getDate()+"','"+
                    arr.get(i).getStatus()+"')";
            stmt.executeUpdate(query);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    
    
    
    
    
    
    void displayAll()
    {
        
        try
        {
            ResultSet rs=stmt.executeQuery("select * from Students");
             while(rs.next())
             {
                 
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
             }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void addStudent(String fname , String lname)
    {
        
        try
        {
            ResultSet rs=stmt.executeQuery("insert in Student");        
            String query = " insert into Student (fName, last_name, date_created, is_admin, num_points)"
            + " values (?, ?, ?, ?, ?)";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString (1, "Barney");
            preparedStmt.setString (2, "Rubble");
            preparedStmt.setBoolean(4, false);
            preparedStmt.setInt    (5, 5000);

            // execute the preparedstatement
            preparedStmt.execute();
      
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
