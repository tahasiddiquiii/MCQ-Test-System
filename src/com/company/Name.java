package com.company;

import java.util.Scanner;

public class Name {
    String username;

    public  String writename() {
        System.out.println("Enter Your Name");
        Scanner f = new Scanner(System.in);
        username = f.nextLine();
        System.out.println();

        return username;
    }
}
