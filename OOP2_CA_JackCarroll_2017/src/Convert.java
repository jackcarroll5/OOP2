/*This class will convert a height in metres to turn it into feet and inches.*/

import javax.swing.*;
import java.awt.*;

public class Convert {

    Basketballer team [] = new Basketballer[2];

    public static void convertToFeet(Basketballer team[])
    {
        String text = "";
        double height;
        int feet = 0,inches = 0,leftover = 0;

        JTextArea jta2 = new JTextArea("Team:");
        Font font = new Font("monospaced",Font.PLAIN,12);
        jta2.setFont(font);


        for (int i = 0; i < team.length; i++)
            jta2.append("\n\n" + team[i].toString() + feet + "ft " +  leftover +  " inches");

        JOptionPane.showMessageDialog(null,jta2,"Feet and Inches",JOptionPane.INFORMATION_MESSAGE);

     feet = inches / 12;
     leftover = inches % 12;

       //
    }
}
