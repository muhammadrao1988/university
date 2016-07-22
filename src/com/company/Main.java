package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to Saylani University");
        System.out.println("1. \t Teacher");
        System.out.println("2. \t Student");
        System.out.println("Please Enter 1 for Teacher Or 2 for Student");

        Scanner input = new Scanner(System.in);

        int module_number = input.nextInt();
        switch (module_number){
            case 1:
                System.out.println("Welcome To Teacher Management");
                Teacher t = new Teacher();
                t.teacherMenu();
                break;
            case 2:
                System.out.println("Welcome To Student Management");

                Student s = new Student();
                s.studentMenu();



                break;
            default:
                System.out.println("Invalid Option Please try again.");
                break;



        }

    }
}
