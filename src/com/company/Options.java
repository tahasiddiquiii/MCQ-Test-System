package com.company;

import java.util.Scanner;

public class Options {

    int numbers;
    public  int option() {
        Scanner scanOption  = new Scanner(System.in);
        String option = scanOption.next();
        System.out.println();

        if (option.equals("a")  ||  option.equals("A")){
            numbers = 1;
            return numbers;
        }
        else if(option.equals("b")  ||  option.equals("B")) {
            numbers = 2;
            return numbers;
        }
        else if(option.equals("c")  ||  option.equals("C")) {
            numbers = 3;
            return numbers;
        }
        else if(option.equals("d")  ||  option.equals("D")) {
            numbers = 4;
            return numbers;
        }
        else {
            System.out.println("Invalid Input");
            option();
        }
        return numbers;
    }
}
