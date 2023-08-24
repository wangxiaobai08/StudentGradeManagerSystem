package Course;
public class Course {
    private String courseName;
    private double dailyGrade;
    private double midGrade;
    private double doGrade;
    private double endGrade;
    private double sumGrade;

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public double getDailyGrade() {
        return dailyGrade;
    }
    public void setDailyGrade(double dailyGrade) {
        this.dailyGrade = dailyGrade;
    }
    public double getMidGrade() {
        return midGrade;
    }
    public void setMidGrade(double midGrade) {
        this.midGrade = midGrade;
    }
    public double getDoGrade() {
        return doGrade;
    }
    public void setDoGrade(double doGrade) {
        this.doGrade = doGrade;
    }
    public double getEndGrade() {
        return endGrade;
    }
    public void setEndGrade(double endGrade) {
        this.endGrade = endGrade;
    }
    public double getSumGrade() {
        return sumGrade;
    }
    public void setSumGrade(double sumGrade) {
        this.sumGrade = sumGrade;
    }
    public Course(String courseName, double dailyGrade, double midGrade, double doGrade, double endGrade, double sumGrade) {
        this.courseName = courseName;
        this.dailyGrade = dailyGrade;
        this.midGrade = midGrade;
        this.doGrade = doGrade;
        this.endGrade = endGrade;
        this.sumGrade = sumGrade;
    }
    @Override
    public String toString() {
        return "Course[" +
                "课程名='" + courseName + '\'' +
                ", 平时成绩=" + dailyGrade +
                ", 期中成绩=" + midGrade +
                ", 实习成绩=" + doGrade +
                ", 期末成绩=" + endGrade +
                ", 总评成绩=" + sumGrade +
                ']';
    }
}

