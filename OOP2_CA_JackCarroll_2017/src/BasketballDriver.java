/*This driver will form an array of basketballers where teams will be formed and the players will be
* displayed.*/
import javax.swing.*;
import java.awt.*;

public class BasketballDriver {
    public static void main(String[] args)
    {
        Basketballer team [] = new Basketballer[5];

        String name;
        int age;
        double height;

        for (int i = 0; i < team.length; i++)
        {
            name = JOptionPane.showInputDialog("Please enter the name of a basketball player: ");
            age = Integer.parseInt(JOptionPane.showInputDialog("Please enter the age of your chosen basketball player: "));
            height = Double.parseDouble(JOptionPane.showInputDialog("Please enter the height of your chosen player: "));


            team[i] = new Basketballer(name,age,height);
        }

        display(team);

        Convert.convertToFeet(team);

        Basketballer tallestPlayer = selectTallestPlayer(team);

     JOptionPane.showMessageDialog(null,"The tallest basketball player on the team is " +
     tallestPlayer,"Tallest Player",JOptionPane.INFORMATION_MESSAGE);

   }

   public static void display(Basketballer[] team)
   {
       JTextArea jta = new JTextArea("Team:");
       Font font = new Font("monospaced",Font.PLAIN,12);
       jta.setFont(font);


       for (int i = 0; i < team.length; i++)
           jta.append("\n\n" + team[i].toString() + "m.");

        JOptionPane.showMessageDialog(null,jta,"Message",JOptionPane.INFORMATION_MESSAGE);
   }


   public static Basketballer selectTallestPlayer(Basketballer [] team)
   {
       double maxHeight = 5.00;
       String tallest;
       int i = 0;

       for (i = 0; i < team.length; i++)
       {
           //if(team[i] > maxHeight)
           {
               maxHeight = team[i].getHeight();
               tallest = team[i].getName();
           }

           //if (team[i] > maxHeight)
               //maxHeight = team[i];
       }
       return team[i];
   }
}
