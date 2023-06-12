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
	
	 private void drawString(Graphics g, String text, int x, int y) {
	        for (String line : text.split("\n"))
	            g.drawString(line, x, y += g.getFontMetrics().getHeight());
	    }

	
	public void paint(Graphics g) {	
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.WHITE);
		g2d.setFont(new Font("SansSerif", Font.BOLD, 15));
		drawString(g, "It is the 41st Millenium. In the grim darkness of the far future, there is only" + '\n'
				+ 	  "war. The Emperor of Mankind wages a constant battle to protect humanity from the" + '\n'
				+ 	  "horrors of space. On the fringes of the Imperium, alien races lurk and plot, and" + '\n'
				+     "chaos demons leak into our reality from the torment of the warp. All that stands " + '\n'
				+ 	  "in their way are the mighty Space Marines. They are more than mortal. They are " + '\n'
				+ 	  "steel, and they are doom. They are the champions of mankind. And the greatest of" + '\n'
				+ 	  "them all are the Ultramarines..." + '\n'
				+ 	  "You the only survivor of your squad has crash-landed into the world Atalia " + '\n'
				+ 	  "Minoris, overrun by xenos and chaos. Since you failed to reach your original " + '\n'
				+ 	  "location, you've been assigned a new misson: " + '\n'
				+     "Purge this world of all that stand against the Emperor." + '\n'
				+ 	  "----------------------------------------------------------------------------------------------------------------" + '\n'
				+     "You venture deep into one of the abandoned facilities. Something in the corner " + '\n'
				+ 	  "catches your eye. A machine detailing, the places you can reach from the " + '\n'
				+ 	  "entrance. " + '\n'
				+ 	  '\n' + "Try typing * Where can I go *." + '\n', 10, 30);
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
