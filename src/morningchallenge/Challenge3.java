package morningchallenge;

import java.util.concurrent.Callable;

public class Challenge3 {
    int eld, deptNo;  //instance variable
    String eName , job;


    public void display(){  //instance method
        System.out.println("Employee ID = " +eld);
        System.out.println("Employee name = " +eName);
        System.out.println("Department number = " +deptNo);
        System.out.println("Job title = " +job);

    }

    public static void main(String[] args) {  // main method

        Challenge3 emp1 = new Challenge3();
        emp1.eld = 101;
        emp1.deptNo = 10;
        emp1.eName = "John";
        emp1.job = "Manual Tester";
        emp1.display();

        Challenge3 emp2 = new Challenge3();
        emp2.eld = 102;
        emp2.deptNo = 11;
        emp2.eName = "Smith";
        emp2.job = "Automation tester";
        emp2.display();





            }
        }







