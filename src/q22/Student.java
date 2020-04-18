
package q22;

public class Student {
 
    private int id;
    private String Name;
    private String major;
    private double grade;

    public Student(int id, String Name, String major, double grade) {
        this.id = id;
        this.Name = Name;
        this.major = major;
        this.grade = grade;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    
    @Override
    public String toString(){
      return id+"       "+Name+"      "+major+"      "+grade;  
    }


  
}