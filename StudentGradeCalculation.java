import java.io.*;
import java.util.*;
public class StudentGradeCalculation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name,grade;
        int sub1,sub2,sub3,sub4,sub5,tot,per,mark=500;
        float avg;
        System.out.println("***** STUDENT GRADE CALCULATOR *****");
        System.out.println("Enter your name:");
        name=sc.nextLine();
        System.out.println("The marks should be range between 1 to 100...");
        System.out.println("Enter Your Marks:");
        sub1=sc.nextInt();
        sub2=sc.nextInt();
        sub3=sc.nextInt();
        sub4=sc.nextInt();
        sub5=sc.nextInt();
        tot=sub1+sub2+sub3+sub4+sub5;
        avg=tot/5;
       
        if(avg>=90){
            grade="A";
        }
        else if(avg>=80 && avg<90){
            grade="B";
        }
        else if(avg>=70 && avg<80 ){
            grade="C";
        }
        else if(avg>=60 && avg<70){
            grade="D";
        }
        else if(avg>=40 && avg <60){
            grade="E";
        }
        else{
            grade="Fail";
            System.out.println("Try Again.....");
        }
       per = (int)(((float)tot / mark) * 100);
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("Name\t\t|| Total\t|| Average\t|| Percentage\t|| Grade\n");
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%s\t\t|| %d\t\t|| %.2f\t|| %d%%\t\t|| %s\n", name, tot, avg, per, grade);
        System.out.println("---------------------------------------------------------------------");
       

    }
}