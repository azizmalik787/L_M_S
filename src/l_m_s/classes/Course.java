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
public class Course {
    
    private static  int id = 6000;
    
    private final int cId;
    private final String cName;
    private final int cHours;
    
    //ArrayList<Section> sec;

    public Course(String cName, int cHours) {
        id++;
        this.cId = id;
        this.cName = cName;
        this.cHours = cHours;
       // this.sec= new ArrayList<>();
       // this.sec.add(new Section());
    }
    public Course(int id,String cName, int cHours) {
        this.id=id;
        this.cId = id;
        this.cName = cName;
        this.cHours = cHours;
       // this.sec= new ArrayList<>();
       // this.sec.add(new Section());
    }
    public Course(Course cdetail) {
        this.cId = cdetail.cId;
        this.cName = cdetail.cName;
        this.cHours = cdetail.cHours;
    }

    public int getcId() {
        return cId;
    }
    public String getcName() {
        return cName;
    }
    public int getcHours() {
        return cHours;
    }
    public void courseDetails()
    {
        System.out.println("Course Name= "+this.cName);
        System.out.println("Course Id =  "+this.cId);
        System.out.println("Credit hours= "+this.cHours+"\n");
    }
    
    
}
