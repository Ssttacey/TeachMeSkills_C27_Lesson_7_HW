package com.techmeskills.lesson7.task1.runner;

import com.techmeskills.lesson7.task1.staff.Accountant;
import com.techmeskills.lesson7.task1.staff.Director;
import com.techmeskills.lesson7.task1.staff.Worker;

import java.util.Scanner;
/*
the runner class stores objects and a loop for executing the program
 */
public class Runner {
    public static void main(String[] args) {

        Director director = new Director(1);
        Accountant accountant = new Accountant(2);
        Worker worker = new Worker(3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter identification code");
        int a = scanner.nextInt();
        if (a == 1) {
            director.DoPosition();
        } else if (a == 2) {
            accountant.DoPosition();
        } else if (a == 3) {
            worker.DoPosition();
        } else {
            System.out.println("Incorrect value. Please, try again");
        }
    }
}
