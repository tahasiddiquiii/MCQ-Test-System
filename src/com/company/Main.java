package com.company;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        Name put = new Name();
        String student = put.writename();

        int abc;
        System.out.println("XXXXX-----------------........WELCOME TO THE MCQ TEST........-----------------XXXXX" + "\n" +
                "Choose Your Multiple Choice Question Set. ");
        System.out.println("Enter 1 , 2 or 3");
        System.out.println("1- CSS Basics");
        System.out.println("2- JAVA Basics");
        System.out.println("3- HTML Basics");


        Scanner scan = new Scanner(System.in);

        int numberCorrect = 0;
        int total = 10;

        System.out.println("choose your set: ");
        int se = scan.nextInt();


            if (se == 1) {

                System.out.println();
                System.out.println("------------welcome to CSS Basics mcq test------------");
                System.out.println();

                BufferedReader fileReader;
                try {
                    fileReader = new BufferedReader(new FileReader("/Users/tahasiddiqui/IdeaProjects/summative_assessment/csv/cssqna.csv"));           // change file path before running according to you computer

                    String line = fileReader.readLine();

                    while (line != null) {
                        System.out.println();
                        String data[] = line.split(",");
                        System.out.println(data[0]);
                        System.out.println(data[1]);
                        System.out.println(data[2]);
                        System.out.println(data[3]);
                        System.out.println(data[4]);
                        int ans = Integer.parseInt(data[5]);

                        line = fileReader.readLine();
                        Scanner answer = new Scanner(System.in);
                        System.out.println("give your answer");



                        Options as = new Options();
                        int csAlt = as.option();

                        if (csAlt != ans) {
                            System.out.println("Wrong! " + data[6] + " is the correct answer.");
                            System.out.println();
                        } else {
                            System.out.println("Correct!");
                            System.out.println();
                            numberCorrect++;
                        }
                    }
                    scan.close();


                } catch (Exception e) {
                    e.printStackTrace();
                }

                double percentage = numberCorrect*10;
                System.out.println( student + "\n" + "you answered " + numberCorrect + " questions correct out of " + total + "\n" +"percentage gained in CSS Basics test: "  +  percentage + "%");

            } else if (se == 2) {

                System.out.println();
                System.out.println("------------welcome to JAVA Basics mcq test------------");
                System.out.println();

                BufferedReader fileReader;
                try {
                    fileReader = new BufferedReader(new FileReader("/Users/tahasiddiqui/IdeaProjects/summative_assessment/csv/javabasicsqna.csv"));                   // change file path before running according to you computer

                    String line = fileReader.readLine();

                    while (line != null) {
                        System.out.println();
                        String data[] = line.split(",");
                        System.out.println(data[0]);
                        System.out.println(data[1]);
                        System.out.println(data[2]);
                        System.out.println(data[3]);
                        System.out.println(data[4]);
                        int ans = Integer.parseInt(data[5]);


                        line = fileReader.readLine();
                        Scanner answer = new Scanner(System.in);
                        System.out.println("give your answer");


                        Options as = new Options();
                        int csAlt = as.option();

                        if (csAlt != ans) {
                            System.out.println("Wrong! " + data[6] + " is the correct answer.");
                            System.out.println();
                        } else {
                            System.out.println("Correct!");
                            System.out.println();
                            numberCorrect++;
                        }

                    }
                    scan.close();


                } catch (Exception e) {
                    e.printStackTrace();
                }

                double percentage = numberCorrect*10;
                System.out.println( student + "\n" + "you answered " + numberCorrect + " questions correct out of " + total + "\n" + "percentage gained in JAVA Basics test: "  +  percentage + "%");

            } else if (se == 3) {

                System.out.println();
                System.out.println("------------welcome to HTML Basics mcq test------------");
                System.out.println();

                BufferedReader fileReader;
                try {
                    fileReader = new BufferedReader(new FileReader("/Users/tahasiddiqui/IdeaProjects/summative_assessment/csv/htmlqna.csv"));               // change file path before running according to you computer

                    String line = fileReader.readLine();

                    while (line != null) {
                        System.out.println();
                        String data[] = line.split(",");
                        System.out.println(data[0]);
                        System.out.println(data[1]);
                        System.out.println(data[2]);
                        System.out.println(data[3]);
                        System.out.println(data[4]);
                        int ans = Integer.parseInt(data[5]);


                        line = fileReader.readLine();
                        Scanner answer = new Scanner(System.in);
                        System.out.println("give your answer");


                        Options as = new Options();
                        int csAlt = as.option();

                        if (csAlt != ans) {
                            System.out.println("Wrong! " + data[6] + " is the correct answer.");
                            System.out.println();
                        } else {
                            System.out.println("Correct!");
                            System.out.println();
                            numberCorrect++;
                        }
                    }
                    scan.close();


                } catch (Exception e) {
                    e.printStackTrace();
                }

                double percentage = numberCorrect*10;
                System.out.println( student + "\n" + "you answered " + numberCorrect + " questions correct out of " + total + "\n"+ "percentage gained in HTML Basics test: "  +  percentage + "%");

                }
            else {
                System.out.println("you've have selected invalid set ");


                }




            }
        }


