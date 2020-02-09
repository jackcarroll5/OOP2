/**
 * Created by T00194823 on 21/09/2017.
 */
public class cattleArray {

    public static int noUnder250(double[] number, int under250) {
        for (int i = 1; i < number.length; i++)
            if (number[i] < 250)
                under250++;

        return under250;
    }

    public static float over400Percent(double[] number, float over400) {

        for (int i = 1; i < number.length; i++)
            if (number[i] > 400)
                over400++;

        return over400;
    }

    public static float lightestWeight(double[] number, double lightest) {

        for (int i = 1; i < number.length; i++) {
            if (number[i] <= lightest)
                lightest = number[i];
        }

       return (float) lightest;
    }

    public static float totalNo(double[] number, float total) {
        for (int i = 1; i < number.length; i++)
            total += number[i];

        return total;
    }
}
