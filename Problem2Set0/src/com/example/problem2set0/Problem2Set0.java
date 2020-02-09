package com.example.problem2set0;

/**
 * Created by T00194823 on 13/09/2017.
 */

import java.util.Scanner;

public class Problem2Set0 {
    public static void main(String[] args) {

      String firstName,lastName,initial;
       int distance,money = 0;

       Scanner input = new Scanner(System.in);

       System.out.print("Please enter your first name: ");
        firstName = input.nextLine();

        System.out.print("Please enter your initial name: ");
        initial = input.nextLine();

        System.out.print("Please enter your last name: ");
        lastName = input.nextLine();

        System.out.print("Please enter the distance cycled: ");
        distance = input.nextInt();

        if(distance > 10)
          money = 10 + (distance * 7);
        else
            money = distance * 7;

        System.out.println("\nThe money due is " + money + "c" + "\nThe cyclist's name is " + firstName + " " +
        initial + " " +  lastName);

    }
}
