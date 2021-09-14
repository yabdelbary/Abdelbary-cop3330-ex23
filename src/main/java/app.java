Package com.company;


import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yussef Abdelbary
 */

public class Main {

    public static void main(String [] args) {

        System.out.println("IS the car silent when you turn the key");
        Scanner sc = new Scanner(System.in);
        String res = sc.nextLine();
        if(res.equals("y")){
            System.out.println(" Are the batter terminal corroded? ");
            res = sc.nextLine();
            if(res.equals("y")) {
                System.out.println("Clean the terminals and try starting again");
            }
            else{
                    System.out.println("Replace cables and try again")
            }else{
                System.out.println("Does the car make a slicking noise?");
                res = sc.nextLine();
                if(res.equals("y"));{
                    System.out.println("Replace the battery.");
                }else{
                    System.out.println("Does the car crank up the fail to start?");
                    res = sc.nextLine();
                    if(res.equals("y"));
                    System.out.println("Check the spark conections");
                }else{
                    System.out.println("Does the engine start and then die? ");
                    res = sc.nextLine();
                    if(res.equals("y"));
                    System.out.println("Does your car have fuel injection?");
                    res = sc.nextLine();
                    if(res.equals("y")){
                        System.out.println("Get in in for service.");
                    }else{
                        System.out.println("Check to ensure that choke is opening and closing.");
                    }
                }else{
                    System.out.printf("This should not be possible");
                }
            }
        }
    }
}