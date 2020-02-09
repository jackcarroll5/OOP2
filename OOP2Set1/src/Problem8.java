import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {

         int[] no = new int[10];

        Scanner input = new Scanner(System.in);

      for (int i = 0; i < no.length; i++)
      {
          System.out.print("Please enter an integer:");
         no[i] = input.nextInt();
      }


      System.out.println("\n\nThe first value in the array is " + no[0] +
      "\nThe 5th number in the array is " + no[4]);

    }
}
