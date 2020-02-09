package com.example.problem4set0;

/**
 * Created by T00194823 on 13/09/2017.
 */
import java.util.Scanner;

public class Problem4Set0 {
    public static void main(String[] args) {

     int count = 0;
     float number = 0,total = 0;
     String numberasString;

      Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number whether positive,negative or zero: ");
        numberasString = input.nextLine();

      while (!numberasString.equals("q"))
      {
          System.out.print("Please enter a number whether positive,negative or zero: ");
          numberasString = input.nextLine();

          number = Float.parseFloat(numberasString);


          total += number;
          count++;

      }
        System.out.println("\nThe total number is " + total + "\nThe number of entries typed is " +
                count);

    }
}
