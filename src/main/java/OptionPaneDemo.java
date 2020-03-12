
/**
 *
 * @author ricardopluviose
 */

import javax.swing.JOptionPane;



public class OptionPaneDemo
{
    public static void main(String[] args)
    {     
    String input = JOptionPane.showInputDialog("Enter price:");
    double price = Double.parseDouble(input);
    var input2 = JOptionPane.showInputDialog("Enter tax rate"); 
    double tax_rate = Double.parseDouble(input2);
    price = price * (1 + tax_rate / 100);      
    JOptionPane.showMessageDialog(null, "Price after tax: " + price);
    }
}