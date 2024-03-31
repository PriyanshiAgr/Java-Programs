import java.util.Scanner;

public class P40_classCreationStudent {
    int rollNo; // int by default takes 0
    String StudentName; // String by default takes null

    public static void main(String[] args) {
        //creating object 1
        P40_classCreationStudent stu1 = new P40_classCreationStudent();
        stu1.rollNo = 4;
        stu1.StudentName = "Akshara Sharma";
        System.out.println(stu1.rollNo);
        System.out.println(stu1.StudentName);

        //creating object 2
        P40_classCreationStudent stu2 = new P40_classCreationStudent();
        stu2.rollNo = 40;
        stu2.StudentName = "Priyanshi Agrawal";
        System.out.println(stu2.rollNo);
        System.out.println(stu2.StudentName);
    }
}

/*
 * BEST PRACTICE TO CREATE CLASS
 * ** A java file can contain multiple classes, but only one class can be public
 * and that className will be as same as java file name. Here student class is
 * the class that we created, so, we will not write 'public' before it.
 * And P40_classCreationStudent is the main class here.
 * 
 * class Student{
 * int rollNo;
 * String StudentName;
 * }
 * public class P40_classCreationStudent {
 * public static void main(String[] args) {
 * Student stu1 = new Student();
 * System.out.println(stu1.rollNo);
 * System.out.println(stu1.StudentName);
 * }
 * }
 * 
 */