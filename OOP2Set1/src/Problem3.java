import javax.swing.*;
import java.awt.*;

/**
 * Created by T00194823 on 19/09/2017.
 */
public class Problem3 {
    public static void main(String[] args) {
        String name,lengthAsString,breadthAsString;
        String costPerSMAsString;
        float length,breadth,costPerSM,area,total;

       name = JOptionPane.showInputDialog("Please enter your name: ");

       lengthAsString = JOptionPane.showInputDialog("Please enter the length of your room: ");
       length = Float.parseFloat(lengthAsString);

       breadthAsString = JOptionPane.showInputDialog("Please enter the breadth of your room: ");
       breadth = Float.parseFloat(breadthAsString);

       area = length * breadth;

       costPerSMAsString = JOptionPane.showInputDialog("Please enter the cost per square metre of your room: ");
       costPerSM = Float.parseFloat(costPerSMAsString);

        total = area * costPerSM;

        JTextArea textArea = new JTextArea(15,30);
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);

        textArea.setText(String.format("%-20s\n-%20s%.2f%-1s\n%-20s%.2f%-1s\n%-20s%.2f%-1s \n%-20s%.2f%-1s \n%-20s%.2f%-1s," +
                "Quotation for ", name,"Length of room:",length,"m","Breadth of room",breadth, "m","Total area of the room",
                area, "sq.m","Cost per square metre of carpet",costPerSM, "euro", "Total cost of carpet",
                        total,"euro"));

       JOptionPane.showMessageDialog(null,textArea,"Room Info",
               JOptionPane.INFORMATION_MESSAGE);

    }

}


