/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rashmina.hseb2dpassingmethod;

import java.util.Scanner;

/**
 *
 * @author Rashu
 */
public class Marks {
  Scanner input = new Scanner(System.in);

    double[][] marks = new double[10][5];

    String result = "";
    double[] sum = new double[10];
    double[] total = new double[5];

     String [] students= new String[10];
         String [] subjects= new String[10];

    public Marks() {
    }

    public Marks(String[] students, String[] subjects, double[][] marks) {
        this.students = students;
        this.subjects = subjects;
        this.marks = marks;

    }

    public void enterStudents() {

        for (int i = 0; i < 10; i++) {
            System.out.println("enter students name");
            students[i] = input.next();
        }
    }

    public void enterSubjects() {
        for (int i = 0; i < 5; i++) {
            System.out.println("enter subjects name");
            subjects[i] = input.next();
        }
    }

    public void enterMarks() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("enter marks");
            
                marks[i][j] = input.nextDouble();
                if (marks[i][j] < 32) {
                    result = "fail";
                }
                sum[i] = sum[i] + marks[i][j];
            }
            if (result.equals("fail")) {
                System.out.println("Fail");
            } else {
                total[i] = sum[i] / 5;
                System.out.println("Percentage of " + students[i] + " is:" + total[i]);
                if (total[i] >= 60 && total[i] < 80) {
                    System.out.println("First Div ");
                } else if (total[i] >= 80) {
                    System.out.println("Distinction");
                } else if (total[i] <= 60 && total[i] >= 45) {
                    System.out.println("Second Div ");
                } else if (total[i] <= 45 && total[i] >= 32) {
                    System.out.println("Third Div ");
                }
            }
        }
    }   
}
