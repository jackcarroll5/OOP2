import javax.swing.*;
import java.awt.*;

/**
 * Created by T00194823 on 19/09/2017.
 */
//This program will form a table using a for loop to show yards in inches.
public class Problem2 {
    public static void main(String[] args) {
       int yards,inches,feet;

        JTextArea textArea = new JTextArea(10,12);
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);

        textArea.setText(String.format("%-6s%-5s%-6s\n","Yards","Feet","Inches"));

       for(yards = 1; yards <= 10; yards++)
       {
         feet = yards * 3;
         inches = feet * 12;

         textArea.append(String.format("%-6d%-5d%-6d\n", yards, feet, inches));

       }


       JOptionPane.showMessageDialog(null,textArea,"Yard to Inches Conversion",JOptionPane.INFORMATION_MESSAGE);

       System.exit(0);
    }

}
