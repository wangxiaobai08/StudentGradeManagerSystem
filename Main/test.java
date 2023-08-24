package Main;
 import Student1.*;
 import java.util.*;
 import Course.*;
public class test {
    
    static List<Student>studentList=new ArrayList<>();
    
    public static void main(String[] args) 
    { 
        System.out.println("请输入你的名字：");
        Scanner in0=new Scanner(System.in);
        String UserName=in0.nextLine();
        System.out.println("尊敬的："+UserName);
        System.out.println("!!!!!---------欢迎来到学生成绩管理系统---------!!!!!");
        List<Course>courses1=new ArrayList<>();
        Course c1=new Course("物理", 61, 99, 78, 70, 98);
        Course c2=new Course("Java" , 66, 98, 87, 89, 88);
        Course c3=new Course("政治", 93, 99, 58, 86, 86);
        courses1.add(c1);
        courses1.add(c2);
        courses1.add(c3);
        Student s1=new Student("小明","200301",20,courses1);
        s1.setCourses(courses1);
        studentList.add(s1);

        List<Course>courses2=new ArrayList<>();
        Course c4=new Course("物理", 85, 96, 85, 96, 88);
        Course c5=new Course("Java", 86, 98, 30, 55, 68);
        Course c6=new Course("政治", 85, 99, 95, 75, 90);
        courses2.add(c4);
        courses2.add(c5);
        courses2.add(c6);
        Student s2=new Student("小红","200211",22,courses2);
        s2.setCourses(courses2);
        studentList.add(s2);

        List<Course>courses3=new ArrayList<>();
        Course c7=new Course("物理", 88, 99, 78, 74, 77);
        Course c8=new Course("Java", 89, 98, 65, 45, 66);
        Course c9=new Course("政治", 95, 99, 78, 86, 80);
        courses3.add(c7);
        courses3.add(c8);
        courses3.add(c9);
        Student s3=new Student("小刚","200213",18,courses3);
        s3.setCourses(courses3);
        studentList.add(s3);

        List<Course>courses4=new ArrayList<>();
        Course c10=new Course("物理", 98, 99, 78, 76, 88);
        Course c11=new Course("Java", 85, 98, 30, 55, 96);
        Course c12=new Course("政治", 58, 99, 88, 83, 89);
        courses4.add(c10);
        courses4.add(c11);
        courses4.add(c12);
        Student s4=new Student("小蓝","200212",18,courses4);
        s4.setCourses(courses4);
        studentList.add(s4);

        System.out.println("1,查询具体科目总评成绩");
        System.out.println("2,查询具体学生所有成绩");
        System.out.println("3,查询具体科目总评成绩分布");
        System.out.println("4,退出系统");

        int flag=0;
        while(flag!=1)
        { 
            System.out.println("请输入你所选择的操作序号(1/2/3/4):");
            Scanner in=new Scanner(System.in);
            int choice=in.nextInt();
            switch(choice){
            case 1:
            selectCourse();break;
            case 2:
            selectName();break;
            case 3:
            selectCourseGrade() ;break;
            case 4:
            System.out.println("退出系统成功！！！");
            flag=1;break;

        }
    }
       

    }
   public static void selectCourse()
    {       
           System.out.println("现有科目有:物理/Java/政治");
            System.out.println("输入你要查询的科目：");
            Scanner input=new Scanner(System.in);
            String courseName=input.nextLine();
            boolean temp = false;
            double sumGrade = 0;
            for (int i = 0; i < studentList.size(); i++) {
                for (int j = 0; j < studentList.get(i).getCourses().size(); j++) {
                    if (courseName.equals(studentList.get(i).getCourses().get(j).getCourseName())){
                        temp = true;
                        sumGrade += studentList.get(i).getCourses().get(j).getSumGrade();
                        System.out.println(studentList.get(i).getStuName()+"总评分是："+studentList.get(i).getCourses().get(j).getSumGrade());
                    }
                }
            }
            if(!temp) {
                System.out.println("很抱歉没有找到该课程信息！");
            }else {
                System.out.println("所有学生的总评分是："+sumGrade);
            }
    }
    public static void selectName()
     {
        System.out.println("现有学生有：小明/小红/小刚/小蓝");
        System.out.println("请输入你要查询的学生姓名：");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        boolean temp = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (name.equals(studentList.get(i).getStuName())){
                temp = true;
                System.out.println("姓名："+studentList.get(i).getStuName()+",学号："+studentList.get(i).getStuID()+",年龄："+studentList.get(i).getStuAge());
                System.out.println("该学生的成绩是：");
                for (int j = 0; j < studentList.get(i).getCourses().size(); j++) {
                    System.out.println(studentList.get(i).getCourses().get(j).toString());
                }
            }
        }
        if (!temp){
            System.out.println("很抱歉没有找到该学生信息！");
        }
    }
    public static void selectCourseGrade() 
    {System.out.println("\n现有科目有：物理/Java/政治");
        System.out.println("请输入你要查询的科目：");
        Scanner input=new Scanner(System.in);
        String course=input.nextLine();
        int excellent = 0;
        int fine = 0;
        int qualified = 0;
        int disqualification = 0;
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = 0; j < studentList.get(i).getCourses().size(); j++) {
                if (course.equals(studentList.get(i).getCourses().get(j).getCourseName()))
                { if (studentList.get(i).getCourses().get(j).getSumGrade()>=90 ){
                    excellent++;
                }else if (studentList.get(i).getCourses().get(j).getSumGrade()>=70){
                    fine++;
                }else if (studentList.get(i).getCourses().get(j).getSumGrade()>=60){
                    qualified++;
                }else if (studentList.get(i).getCourses().get(j).getSumGrade()>=0){
                    disqualification++; }
            } }}
        System.out.println("优秀：90-100分的有："+excellent+"人");
        System.out.println("良好：70-89分的有："+fine+"人");
        System.out.println("合格：60-69分的有："+qualified+"人");
        System.out.println("不合格：0-59分的有："+disqualification+"人");
    }


    
}
