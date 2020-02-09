import java.util.Scanner;
/**
 * Created by T00194823 on 20/09/2017.
 */
//This program will ask the user for a series of integer values. It will
    //determine if the integer is even
public class Problem7 {
    public static void main(String[] args) {
        int value = 0;

     Scanner input = new Scanner(System.in);

     while (value != -1)
     {
        System.out.print("\nPlease enter an integer value: ");
        value = input.nextInt();

        if(isEven(value))
            System.out.println("This value is even");
        else
            System.out.println("This value is odd");
     }
     System.out.println("\nThanks for using this program! Goodbye!");
    }

    public static boolean isEven(int value)
    {
        boolean valid;

        if(value % 2 == 0)
         valid = true;
        else
            valid = false;

        return valid;
    }
}
