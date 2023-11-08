package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentId;
    private String courses = "";
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    Scanner in = new Scanner(System.in);
    //Constractor : prompts to enter name and a year of student
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student First Name ! ");
        this.firstName = in.nextLine();

        System.out.print("Enter Student Last Name ! ");
        this.lastName = in.nextLine();

        System.out.print("1 - intern\n2 - trainee\n3 - Junior\n4 - Senior\nEnter Student class level ");
        this.gradeYear = in.nextLine();

        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);

    }


    //Generate an ID
    private void setStudentID(){
        //grade level
        studentId = gradeYear + "" + id;
        id++;
    }

    //Enroll in courses
    public void enroll(){
        do {
            System.out.print("Enter the course to enroll ! (Q to quit): ");
            String course = in.nextLine();
            if (!course.equals("Q")) {
                this.courses = courses + "\n" + course;
                this.tuitionBalance += costOfCourse;
            }else {
                break;
            }
        }while (1 != 0);
        System.out.println("Your balance is $" + tuitionBalance);
    }

    //View balance
    public void viewBalance(){
        System.out.println("Your balance is $" + tuitionBalance);
    }

    //Pay the tuition
    public void payTuition(){
        System.out.println("Enter the payment value !");
        int payment = in.nextInt();
        this.tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for payment of $" + payment);
        viewBalance();
    }

    //Show status
    public String toString(){
        System.out.println();
        return "Name : " + this.firstName + " " + this.lastName
                + "\nGrade Level : " + gradeYear + "\nStudent ID : "
                 + studentId + "\nCources Enrolled : " +  " " + this.courses +
                 "\nBalance is : " + this.tuitionBalance + "$" + "\n\n";
    }

}
