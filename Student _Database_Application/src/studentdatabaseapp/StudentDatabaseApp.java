package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String args[]){

        //Ask how many students will be added to the database
        System.out.print("How many of new students will be enroll : ");
        Scanner in =new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] Stud = new Student[numOfStudents];
        //Create n numbers of new students
        for (int i=0; i<numOfStudents; i++){
            Stud[i] = new Student();
            Stud[i].enroll();
            Stud[i].payTuition();
            System.out.println(Stud[i].toString());
        }
    }
}
