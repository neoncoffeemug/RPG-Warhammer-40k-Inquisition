import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.concurrent.TimeUnit;


public class Label extends JPanel {
	
	private JLabel label;
	
	public void label() {
	ImageIcon image = new ImageIcon("necronWarrior.png"); 	
	
	JLabel label = new JLabel(); // create a label
	label.setText("Test subject GRVS"); // set text of label
	label.setIcon(image);
	label.setHorizontalTextPosition(JLabel.CENTER); //set text left, center or right of imageicon
	label.setVerticalTextPosition(JLabel.BOTTOM); 
	label.setForeground(Color.BLUE);
	label.setFont(null);
	}
	
		

}
