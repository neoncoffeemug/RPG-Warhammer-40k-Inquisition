import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Frame extends JPanel {

	private JFrame frame;
	private JLabel label;
	int room = 0;
	
	public Frame() {
		
		label = new JLabel();
		ImageIcon trazyn = new ImageIcon("trazyn.jpg");
		label.setIcon(trazyn);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBackground(Color.BLACK);
		
		frame = new JFrame();
		frame.add(this);
		frame.add(label);
		frame.setTitle("Warhammer 40k: Inquisition");
		frame.setSize(620, 700);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon image = new ImageIcon("ultraSymbol.png");
		frame.setIconImage(image.getImage());
		frame.setVisible(true);
	}
	
	public static void slowPrint(String output) {
		for (int i = 0; i<output.length(); i++) {
			char c = output.charAt(i);
			System.out.print(c);
			try {
				TimeUnit.MILLISECONDS.sleep(0);
			}
			catch (Exception e) {				
			}
		}
	}
	
	public static void slowPrint15(String output) {
		for (int i = 0; i<output.length(); i++) {
			char c = output.charAt(i);
			System.out.print(c);
			try {
				TimeUnit.MILLISECONDS.sleep(0);
			}
			catch (Exception e) {				
			}
		}
	}	
}
