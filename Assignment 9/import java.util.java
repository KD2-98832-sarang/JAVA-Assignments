package com.sunbeam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student {
    private int rollno;
    private String name;
    private double marks;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(int rollno, String name, double marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    // Getters
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // Display student details
    @Override
    public String toString() {
        return "Roll No: " + rollno +
               ", Name: " + name +
               ", Marks: " + marks;
    }
}

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // List interface reference
        // ArrayList object
        List<Student> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== STUDENT MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Sort Students by Roll No");
            System.out.println("5. Sort Students by Name");
            System.out.println("6. Sort Students by Marks");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:
                // Add student
                System.out.print("Enter Roll No: ");
                int rollno = sc.nextInt();

                System.out.print("Enter Name: ");
                String name = sc.next();

                System.out.print("Enter Marks: ");
                double marks = sc.nextDouble();

                Student s = new Student(rollno, name, marks);

                list.add(s);

                System.out.println("Student added successfully.");
                break;

            case 2:
                // Display using Iterator
                if (list.isEmpty()) {
                    System.out.println("No students available.");
                } else {

                    Iterator<Student> itr = list.iterator();

                    while (itr.hasNext()) {
                        Student student = itr.next();
                        System.out.println(student);
                    }
                }
                break;

            case 3:
                // Search by roll number
                System.out.print("Enter Roll No to search: ");
                int searchRoll = sc.nextInt();

                boolean found = false;

                for (Student student : list) {

                    if (student.getRollno() == searchRoll) {
                        System.out.println("Student Found:");
                        System.out.println(student);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found.");
                }

                break;

            case 4:
                // Sort by Roll No
                list.sort((s1, s2) ->
                        Integer.compare(s1.getRollno(), s2.getRollno()));

                System.out.println("Students sorted by Roll No.");

                for (Student student : list) {
                    System.out.println(student);
                }

                break;

            case 5:
                // Sort by Name
                list.sort((s1, s2) ->
                        s1.getName().compareTo(s2.getName()));

                System.out.println("Students sorted by Name.");

                for (Student student : list) {
                    System.out.println(student);
                }

                break;

            case 6:
                // Sort by Marks
                list.sort((s1, s2) ->
                        Double.compare(s1.getMarks(), s2.getMarks()));

                System.out.println("Students sorted by Marks.");

                for (Student student : list) {
                    System.out.println(student);
                }

                break;

            case 0:
                System.out.println("Program ended.");
                break;

            default:
                System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}