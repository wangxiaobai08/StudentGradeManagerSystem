package Student1;
import java.util.*;
import java.util.List;
import Course.*;
public class Student {
    private String stuName;
    private String stuID;
    private int stuAge;
    List<Course> courses;
    public String getStuName() {
        return stuName;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    public String getStuID() {
        return stuID;
    }
    public void setStuID(String stuID) {
        this.stuID = stuID;
    }
    public int getStuAge() {
        return stuAge;
    }
    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;}
    public List<Course> getCourses() {
        return courses; }
    public void setCourses(List<Course> courses) {
        this.courses = courses;}
    public Student(String stuName, String stuID, int stuAge, List<Course> courses) {
        this.stuName = stuName;
        this.stuID = stuID;
        this.stuAge = stuAge;
        this.courses = courses;}
    public Student() {
    }
    @Override
    public String toString() {
        return "Student[" +
                "学生姓名='" + stuName + '\'' +
                ", 学生ID='" + stuID + '\'' +
                ", 学生年龄=" + stuAge +
                ", courses=" + courses +
                ']';
    }
}

