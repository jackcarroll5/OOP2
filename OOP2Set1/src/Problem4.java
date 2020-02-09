import java.util.Scanner;

/**
 * Created by T00194823 on 19/09/2017.
 */

//This program will allow a user to input their first name,midname and last name

public class Problem4 {
    public static void main(String[] args) {
     String firstName,midName,lastName,fullName;
     boolean valid = false;

      Scanner input = new Scanner(System.in);

      System.out.print("Please type in your first name:");
        firstName = input.nextLine();

        System.out.print("Please type in your middle name:");
        midName = input.nextLine();

        System.out.print("Please type in your last name:");
        lastName = input.nextLine();

        fullName = firstName + " " + midName + " " + lastName;
        int finalSpace =  fullName.lastIndexOf(' ');
        lastName = fullName.substring(finalSpace);

       System.out.println("\nThe number of characters in the name: " + fullName.length() +
       "\nInitial of first name: " + fullName.charAt(0)  + "\nName as capital letters: " + fullName.toUpperCase() +
       " \nSurname on its own: " + lastName);

    }
}
