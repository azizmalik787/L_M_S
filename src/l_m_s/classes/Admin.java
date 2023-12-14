 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l_m_s.classes;

import java.util.ArrayList;
import l_m_s.Connectivity;

/**
 *
 * @author azizm
 */
public class Admin extends Person{
    String Disc;
    private static int id=9;
    private static Admin admin=null;
    int aId;
    String pass;
    
    public ArrayList<Student> student;
    public ArrayList<Teacher> teacher ;
    ArrayList<Course> course;
    //ArrayList<OfferedCourse> offeredcourse;
    ArrayList<Section> offeredSection;
    ArrayList<Teaching> teaching;
    ArrayList<Transcript> transcripts;
    
    
    public static Admin getinstance()
    {
        if(admin==null)
        {
            Admin.admin = new Admin("Head Cs", "Aftab", "Khadim", 7924871, "address xyz", "Male","123");
            Admin.admin.LoadData();
            return admin;
        }
        else
            return admin;
    }
    private  Admin(String Disc,String fName, String lName,int contact,String adr,String gender,String p ) {
        super(fName, lName, contact, adr, gender,false);
        this.Disc = Disc;
        id++;
        this.pass=p;
        this.aId=Admin.id;
        this.offeredSection = new ArrayList<>();
        teaching=new ArrayList<>();
        student = new ArrayList<>();
        teacher = new ArrayList<>();
        course = new ArrayList<>();
        transcripts= new ArrayList<>();
    }

    public void LoadData()
    {
       Connectivity c = new Connectivity();
       c.Load_Database(this);
        
    }
    public void addTranscript(Transcript t)
    {
        this.transcripts.add(t);
    }
    public boolean isValidAdmin(int x,String pass )
    {   
        if(x==this.aId && this.pass.equals(pass))
            return true;
        return false;
    }
    public boolean isValidStudent( int id,String pass)
    {
        for (int i = 0; i < student.size(); i++) {
            if(id==student.get(i).getRoll() && student.get(i).getPass().equals(pass))
                return true;
        }
        return false;
    }
    
    public boolean isValidTeacher( int id,String pass)
    {
        for (int i = 0; i < teacher.size(); i++) {
            if(id==teacher.get(i).getId() && teacher.get(i).getPass().equals(pass))
                return true;
        }
        return false;
    }
    public int getaId() {
        return aId;
    }
    public Student getStudent(int sid)
    {
        for (int i = 0; i < student.size(); i++) {
            if(sid==student.get(i).getRoll())
                return student.get(i);
        }
        return null;
    }
    public Teacher getTeacher(int tid)
    {
        for (int i = 0; i < teacher.size(); i++) {
            if(tid==teacher.get(i).getId())
                return teacher.get(i);
        }
        return null;
    }
    
    
    
    public ArrayList<Section> getSections()
    {
        return this.offeredSection;
    }
    public ArrayList<Teaching> getTeaching()
    {
        return this.teaching;
    }
    public void Commit()
    {
       Connectivity c = new Connectivity();
       c.CommitTODatabase(admin);
       
       
    }
    public void transcripts()
    {
        for (int i = 0; i < transcripts.size(); i++) {
            transcripts.get(i).details();
            
        }
    }
    
    public boolean OpenRegistration()
    {
        ArrayList<Integer> rnd = new ArrayList<>();
        for (int i = 0; rnd.size()<5; i++) {
            int x = (int)(Math.random()*((6010-6001)+1))+6001;
            if(!rnd.contains(x))
                rnd.add(x);
        }
        
        
        for (int i = 0; i<5; i++) {
            for (int j = 0; j < course.size(); j++) {
                if(rnd.get(i)== course.get(j).getcId())
                {
                    offeredSection.add(new Section(course.get(j).getcId()) );
                    offeredSection.add(new Section(course.get(j).getcId()) );
                }
            } 
        }
        
        return true;
    }
    public boolean assignTeacherToCourse()
    {
        for (int i = 0; i < offeredSection.size(); i++) {
            int x = (int)(Math.random()*((2009-2001)+1))+2001;//random teacher ID
            this.teaching.add(new Teaching(x,offeredSection.get(i).getSecID()));
            for (int j = 0; j < this.teacher.size(); j++) {
                if(this.teacher.get(j).getId()==x)
                    this.teacher.get(j).addSection(offeredSection.get(i).getSecID());
            }
        }    
        
        return true;
    }
    public ArrayList<Section> getOfferedSections()
    {
        return this.offeredSection;
    }
    public void showAllCourses()
    {
        for (int i = 0; i < course.size(); i++) {
            course.get(i).courseDetails();
            
        }
    }
    public void showTeachers()
    {
        for (int i = 0; i < teacher.size(); i++) {
            teacher.get(i).Details();
        }
    }
    public void showStudents()
    {
        for (int i = 0; i < student.size(); i++) {
            student.get(i).Details();
        }
    }
    public void showOfferedCoursesDetails()
    {
        for (int k = 0; k < offeredSection.size(); k++) {
                offeredSection.get(k).SecDetail();   
        }
    }
    public String fetchNameFromCourseID(int cid){
        for (int i = 0; i < course.size(); i++) {
            if(course.get(i).getcId()==cid){
                return course.get(i).getcName();
            }
            
        }
        return null;
    }
    public void addStudentToSection(int courseID,int secID,int roll)
    {
                    
        for (int i = 0; i < student.size(); i++) {
            if(student.get(i).getRoll()==roll)
            {
                if(!student.get(i).registeredSections.contains(secID))
                {
                    for (int j = 0; j < this.offeredSection.size(); j++) {
                        if(this.offeredSection.get(j).getSecID()==secID && this.offeredSection.get(j).getCourseID()==courseID)
                        {
                           this.offeredSection.get(j).addStudentToSection(roll);
                        }
                    }
                    student.get(i).addRegisteredCourse(secID);
                }
            }
                
            
        }
    }
    public void DropStudent(int roll ,int secID)
    {
        int cid=0;
        for (int i = 0; i < this.offeredSection.size(); i++) {
            if(this.offeredSection.get(i).getSecID()==secID){
                this.offeredSection.get(i).dropStudent(roll);
                cid=this.offeredSection.get(i).getCourseID();
            }
        }
        int sem=0;
        for (int i = 0; i < student.size(); i++) {
            if(student.get(i).getRoll()==roll){
                student.get(i).removecourse(secID);
                sem = student.get(i).getCurrentSem();
            }
            
        }
        for (int i = 0; i < transcripts.size(); i++) {
            if(transcripts.get(i).getCID() ==cid && transcripts.get(i).getSID() == roll && transcripts.get(i).getSemID()==sem)
            {
                transcripts.remove(i);
            }   
        }
    }
    public void showAssigned()
    {
        for (int i = 0; i < teaching.size(); i++) {
            System.out.println("\n");
            teaching.get(i).Details();
            System.out.println("\n");
        }
          
    }
    public void addStudent(Student s)
    {
        this.student.add(s);
    }
    public void addTeacher(Teacher t)
    {
        this.teacher.add(t);
    }
    public void addCourse(Course c)
    {
        this.course.add(c);
    }

    /**
     *
     * @param roll
     * @return
     */
    
    
    public ArrayList<Transcript> getTranscripts()
    {
        return this.transcripts;
    }
    
    public String getCourseName(int CID)
    {
        for (int i = 0; i < course.size(); i++) {
            if(course.get(i).getcId() == CID)
                return course.get(i).getcName();
            
        }
        return null;
    }
    public ArrayList<Integer> getStudentCourses(int roll)
    {
        
        for (int i = 0; i < student.size(); i++) {
            if(this.student.get(i).getRoll() == roll){
                return this.student.get(i).getCourseList();
            }
            
        }
        return null;
    }
    public String getCourseNameFromSectionID(int secID){
        for (int i = 0; i < this.offeredSection.size(); i++) {
            if(this.offeredSection.get(i).getSecID()==secID)
            {
                for (int j = 0; j < this.course.size(); j++) {
                    if(this.course.get(j).getcId()==this.offeredSection.get(i).getCourseID())
                        return this.course.get(j).getcName();
                    
                }
            }
            
        }
        return null;
    }
    public ArrayList<studentStudying> getAttendanceOfAllStudents(int secID)
    {
        for (int i = 0; i < this.offeredSection.size(); i++) {
            if(this.offeredSection.get(i).getSecID()==secID)
            {
                return this.offeredSection.get(i).getStudying();
            }
            
        }
        return null;   
    }
    public ArrayList<Attendance> getAttendanceOfSpecificStudents(int secID,int sid)
    {
        for (int i = 0; i < offeredSection.size(); i++) {
            if(offeredSection.get(i).getSecID()==secID)
            {
                for (int j = 0; j < offeredSection.get(i).getStudying().size(); j++) {
                    
                    if(offeredSection.get(i).getStudying().get(j).studentID==sid)
                    {
                        return offeredSection.get(i).getStudying().get(j).getAttendance();
                    }
                }
            }
            
        }
        return null;
    }
    public void addAttendance(int secID , int sid , char status)
    {
        for (int i = 0; i < offeredSection.size(); i++) {
            if(offeredSection.get(i).getSecID()==secID)
            {
                offeredSection.get(i).addAttendance(sid, status);
            }
            
        }
    }
    
    public void addMarks(int secID, int sid,double marks)
    {
        for (int i = 0; i < offeredSection.size(); i++) {
            if(offeredSection.get(i).getSecID()==secID)
            {
                offeredSection.get(i).addMarks(sid, marks);
            }
            
        }
    }
    public void addGrade(int secID, int sid,String grade)
    {
        int CID=0;
        for (int i = 0; i < offeredSection.size(); i++) {
            if(offeredSection.get(i).getSecID()==secID)
            {
                offeredSection.get(i).addGrade(sid, grade);
                CID=offeredSection.get(i).getCourseID();
            }
            
        }
        int sem=0;
        for (int i = 0; i < student.size(); i++) {
            if(student.get(i).getRoll()==sid)
            {
               sem=student.get(i).getCurrentSem();
            }
            
        }
        for (int i = 0; i < transcripts.size(); i++) {
            if(transcripts.get(i).getCID()==CID && transcripts.get(i).getSID()==sid && transcripts.get(i).getSemID()==sem)
            {
                transcripts.get(i).setGrade(grade);
                return;
            }
        }
        transcripts.add(new Transcript(sem, sid, CID, grade));
        
    }
    public String getgrade(int secID,int sid)
    {
        for (int i = 0; i < offeredSection.size(); i++) {
            if(offeredSection.get(i).getSecID()==secID)
            {
                return offeredSection.get(i).getGrade(sid);
            }
        }
        return null;
    }
    
    
    public double getGradePoint(String grade)
    {
        if(grade.equalsIgnoreCase("A+") || grade.equalsIgnoreCase("A"))
            return 4.0;
        else if(grade.equalsIgnoreCase("B+"))
            return 3.67;
        else if(grade.equalsIgnoreCase("B"))
            return 3.0;
        else if(grade.equalsIgnoreCase("B-"))
            return 2.67;
        else if(grade.equalsIgnoreCase("C+"))
            return 2.33;
        else if(grade.equalsIgnoreCase("C"))
            return 2.0;
        else if(grade.equalsIgnoreCase("C-"))
            return 1.67;
        else if(grade.equalsIgnoreCase("D"))
            return 1.3;
        else //f grade
            return 0.0;
        
        
    }
    
    
    /*public boolean addTeacher(int t)
    {
        return tch.add(t);
    }
    
    public Boolean removeTeacher(int t)
    {
        for (int i = 0; i < tch.size(); i++) {
            if(tch.get(i)==t){
                 tch.remove(i);return  true;
            }
        }
        return false;
    }
    public Boolean removeStudent(int s)
    {
        for (int i = 0; i < std.size(); i++) {
            if(std.get(i)==s){
                 std.remove(i);return  true;
            }
        }
        return false;
    }*/
    @Override
    public void Details()
    {
        System.out.println("Admin Name= "+this.fName+" "+this.lName);
        System.out.println("Designation= "+this.Disc+"\n");
    }
    
}
