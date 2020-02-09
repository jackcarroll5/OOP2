import javax.swing.JOptionPane;

//This program will enable statistics based on an array which will be using

public class Problem9 {
    public static void main(String[] args) {
       double lightest = 0;
       double[] number = new double[10];
       float total = 0,over400 = 0;
       int under250 = 0;
       String text = "";

       for (int i = 0; i < number.length; i++)
        number[i] = Double.parseDouble(JOptionPane.showInputDialog("Please enter the weight of animal " + (i + 1) + " :"));

         text = "\nWeights: ";

        for (int i = 0; i < number.length; i++) {
             text += number[i] + " ";
        }

                JOptionPane.showMessageDialog(null, text + "\nNumber under 250kg: " + cattleArray.noUnder250(number,under250) + "\nPercentage over 400kg " +
                                cattleArray.over400Percent(number,over400) / number.length * 100 + "%" +
                       "\nLightest animal: " + cattleArray.lightestWeight(number,lightest) + "kg" + "\nAverage weight: " +
                       cattleArray.totalNo(number,total) / number.length + "kg",
               "Cattle Converter",JOptionPane.INFORMATION_MESSAGE);

       System.exit(0);
    }
}

