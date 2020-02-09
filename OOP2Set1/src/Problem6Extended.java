import java.util.Scanner;

/**
 * Created by T00194823 on 20/09/2017.
 */
//This program will ask the user for a series of integer values. It will
//determine if the integer is even. It will also ask a user to put in a length for
    //a cubic bottle of facial cream using a cube method.
public class Problem6Extended {
    public static void main(String[] args) {
        int i = 0,length;

        String text = "";

        Scanner input = new Scanner(System.in);

        text = "Number" + "      Cube" + "\n------      ----";
        System.out.println(text);

        for(i = 1; i <= 15; i++)
        {
            System.out.println(i +  "           "  + MyMethods.cube(i));
        }

        System.out.print("\nPlease enter the length of a side of a cubic container for face cream:");
        length = input.nextInt();

        if(MyMethods.cube2(length) > 100)
          System.out.println("\nYou can't take this on board, put it into your check-in luggage.");
        else
            System.out.println("\nThe volume of the cube is " + MyMethods.cube2(length) + "\nYou can take this on board.");


    }
}

