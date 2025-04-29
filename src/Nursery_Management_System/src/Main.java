package Nursery_Management_System;

import java.util.Scanner;

// Main Application
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating the teachers
        System.out.println("Enter teacher's ID: ");
        String id = scanner.nextLine();
        System.out.println("Enter teacher's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter teacher Role");
        String role  = scanner.nextLine();
        Teacher teacher1 = new Teacher(id,name,role);


        // Create teacher instances
         Teacher teacher2 = new Teacher("T002", "Mr. Bob", "Teacher");

        // Create nursery class instances
        NurseryClass babyClass = new BabyClass("C001", "Baby Class");
        NurseryClass middleClass = new MiddleClass("C002", "Middle Class");
        NurseryClass topClass = new TopClass("C003", "Top Class");

        // Assign teachers to classes
        teacher1.assignToClass(babyClass);
        teacher2.assignToClass(topClass);

        // Create student instances
        Student student1 = new Student("S001", "John", 3, "Mr. and Mrs. Smith");
        Student student2 = new Student("S002", "Emma", 4, "Mr. and Mrs. Johnson");

        // Enroll students
        babyClass.enrollStudent(student1);
        topClass.enrollStudent(student2);

        // Conduct activities
        babyClass.conductActivity("Singing");
        topClass.conductActivity("Reading");

        // Track progress
        babyClass.trackProgress();
        topClass.trackProgress();

        // Generate reports
        babyClass.generateClassReport();
        topClass.generateClassReport();
    }
}
