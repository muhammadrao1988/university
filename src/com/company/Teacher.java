package com.company;

import java.util.Scanner;

/**
 * Created by sayla on 12/06/2016.
 */
public class Teacher extends University {


    private void addTeacherData(String name, String gender, String qualification, int age) {

        this.addData(name, gender, qualification, age);
        System.out.println("===============================");
        System.out.println("Teacher added successfully.....");
        System.out.println("===============================");


    }

    private void addTeacher() {
        this.collectInfo("Teacher");
        this.teacherMenu();


    }

    private void searchTeacher(String teacherName) {
        this.searchData(teacherName);
        this.teacherMenu();
    }

    private void viewTeacher() {

        this.viewData();
        this.teacherMenu();
    }

    private void editTeacher(int teacherID) {

        this.editData(teacherID, "Teacher");
        this.teacherMenu();
    }

    private void deleteTeacher(int teacherID) {

        this.deleteData(teacherID);
        this.teacherMenu();
    }


    public void teacherMenu() {
        System.out.println("");
        System.out.println("Please select an option");
        System.out.println("1. \t Add Teacher");
        System.out.println("2. \t View Teacher");
        System.out.println("3. \t Search Teacher");
        System.out.println("4. \t Edit Teacher");
        System.out.println("5. \t Delete Teacher");
        System.out.println("6. \t Exit");
        System.out.println("Please Enter 1 or 2 or 3 or 4 or 5  or 6");
        int option = ui.nextInt();
        switch (option) {
            case 1:
                this.addTeacher();
                break;
            case 2:
                this.viewTeacher();
                break;
            case 3:
                System.out.println("Please enter teacher name:");
                String teacherName = ui.next();
                this.searchTeacher(teacherName);
                break;
            case 4:
                System.out.println("Please enter teacher id:");
                int teacherID = ui.nextInt();
                this.editTeacher(teacherID);
                break;
            case 5:
                System.out.println("Please enter teacher id:");
                int teacherID2 = ui.nextInt();
                this.deleteTeacher(teacherID2);
                break;

            default:
                System.out.println("Thank you for using Teacher Module");
                break;


        }

    }


}
