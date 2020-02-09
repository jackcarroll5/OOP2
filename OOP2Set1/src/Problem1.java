import java.util.Scanner;

/**
 * Created by T00194823 on 19/09/2017.
 */
//This problem will display the exchange rate in euros from pounds by using
// a data-sentinel while loop. It will enable the user to type in the current conversion rate
    //to work out the exchange rate from pounds to euro

public class Problem1 {
    public static void main(String[] args) {

        float money = 0,rate;

        Scanner input = new Scanner(System.in);

       System.out.print("Please enter the current rate of conversion from £ to €");
        rate = input.nextFloat();


        while (money != 0)
        {
            System.out.print("\n\nPlease enter a currency value in GB £ to convert to €:");
            money = input.nextFloat();


            System.out.printf("\nThe exchange rate of £" + String.format("%.2f",money) + " in pounds is €" +
            String.format("%.2f",currencyRate(money,rate)) + " in euros");
        }
        System.out.println("\nThanks for using the system! Goodbye! ");
    }

    public static float currencyRate(float money,float rate)
    {
        return money * rate;
    }
}
