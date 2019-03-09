import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaryconvertor {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField();
	JButton button = new JButton();
	
	button.setText("Convert");
	
	JTextField answer = new JTextField(20);
	
	frame.setVisible(true);
	frame.add(panel);
	frame.setTitle("Convert 8 bits of binary into ASCII");
	frame.pack();
	frame.add(text);
	frame.pack();
	Component input = frame.add(answer);
	frame.pack();
	String input1 = input.toString();
	//button.addMouseListener(input1);
	//frame.addMouseListener(input);
	frame.pack();
	
	frame.add(button, -1);

	
	MouseListener(input1);
	
	
	
}

public static void MouseListener(String input1)
{
	convert(input1);
}

static String convert(String input) 
{
    if(input.length() != 8)
    {
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) 
    {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try 
    {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e)
    {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    