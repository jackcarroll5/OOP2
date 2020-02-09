import java.util.Scanner;

/**
 * Created by T00194823 on 20/09/2017.
 */
public class Problem6 {
    public static void main(String[] args) {

       int i = 0;

       String text = "";

       Scanner input = new Scanner(System.in);

       text = "Number" + "      Cube" + "\n------      ----";
        System.out.println(text);

       for(i = 1; i <= 15; i++)
       {
         System.out.println(i +  "           "  + cube(i));
       }
    }

    public static int cube(int i)
    {
        int cube = 1;

        cube = i * i * i;

        return cube;
    }
}
