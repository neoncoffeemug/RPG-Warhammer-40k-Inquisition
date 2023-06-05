import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Main {

	public static void main(String[] args) {
		
		// JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("necronWarrior.png"); 	
		
		JLabel label = new JLabel(); // create a label
		label.setText("Test subject GRVS"); // set text of label
		label.setIcon(image);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setHorizontalTextPosition(JLabel.CENTER); //set text left, center or right of imageicon
		label.setVerticalTextPosition(JLabel.BOTTOM); 
		label.setBackground(Color.BLACK);
		label.setForeground(Color.WHITE);
		label.setFont(null);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.add(label);
		frame.setBackground(Color.BLACK);
		

	}
}
