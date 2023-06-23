import java.awt.Label;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		
		Scanner scanner = new Scanner(System.in);
		int room = 0;
		String x;
		String command = "";	
		Frame frame = new Frame();
		Label label = new Label();
			
		// Cria objetos
		Marine ultraMarine = new Marine("Ultra Marine", 20, 10, 15);
		Necron necronWarrior = new Necron("Necron Warrior", 18, 16, 14);
		ChaosMarine chaosMarine = new ChaosMarine("Chaos Marine", 22, 8, 20);
		
		ArrayList<Object> characters = new ArrayList<Object>();
		characters.add(ultraMarine);
		characters.add(chaosMarine);
		characters.add(necronWarrior);
		System.out.println(characters);
		System.out.println(characters.size());
		
		FileReader titulo = new FileReader("titulo.txt");
		BufferedReader bufferT =  new BufferedReader(titulo);
		String Titulo;
		
		FileReader trazynDialogue = new FileReader("trazynDialogue.txt");
		BufferedReader bufferD = new BufferedReader(trazynDialogue);
		String dialogueTrazyn;
		
		ultraMarine.heal();
		ultraMarine.Analyze(ultraMarine, chaosMarine);
		
		try {
			while ((Titulo = bufferT.readLine()) != null) {
				System.out.println(Titulo);
				Thread.sleep(200);
			}
		}
		
		catch (IOException e) 	{
			e.printStackTrace();
		}
		
		// "lógica" principal
		while(true) {
				
			switch(room) {
			
			case 1:
				slowPrint('\n' + "You may choose what path you want to go." + '\n');
				break;
				
			case 2:
				slowPrint("The labs walls are filled with grime, everything has been overrun by nature " + '\n'
						+ "for a long time. But the place is not abandoned, someone has been here recently. " + '\n'
						+ "you hear a stange transmission, do you accept it?" + '\n'
						+ "*accept* / *ignore*" + '\n');
				break;
				
			case 3:
				slowPrint("The Common Area feels odd, foulest chaos magic has infected this place. " + '\n'
						+ "You look around, near you a destoyed bolter in the ground, do you wish to inspect " + '\n'
						+ "it?" + '\n'
						+ "*yes* / *no*" + '\n');	
				break;
				
			case 4:
				slowPrint("You are attacked by a chaos space marine!" + '\n');
				slowPrint(chaosMarine.toString()+ '\n');
				slowPrint("You hold your ground, escape is not an option for a son of the emperor" + '\n');
				Marine.powerSword(ultraMarine, chaosMarine, necronWarrior);
				break;
				
			case 5:
				
				try {
					while ((dialogueTrazyn = bufferD.readLine()) != null) {
						System.out.println(dialogueTrazyn);
						Thread.sleep(200);
					}
				}
				
				catch (IOException e) 	{
					e.printStackTrace();
				}
				
				break;
				
			case 6:
				slowPrint("");
			}
				
		try {	
		// Get player input 
		System.out.println("> ");
		command = scanner.nextLine(); // Poderia ser resolvido caso o commando não fosse .nextLine?
			
		// Deal with player input
		switch(command.toLowerCase()) {
		
		 	case "play":
		 		slowPrint("You venture deep into one of the abandoned facilities. Something in the corner " + '\n'
				+ "catches your eye. A machine detailing, the places you can reach from the " + '\n'
				+ "entrance. " + '\n'
				+ "from here you may choose where you will go, try typing * Where can I go *" + '\n');
		 		break;
		 		

			case "where can i go":
				slowPrint("You can go West to the Alpha Labs, to go type. * Go West *  " + '\n'
						+ "You can go East to the Common Area, to go type. * Go East * " + '\n');
				room = 1;
				break;
		
			case "go west":
				slowPrint('\n' + "You venture deep into the Alpha Labs." + '\n');	
				room = 2;
				break;
		
			case "go east":
				slowPrint('\n' + "You enter the Common Area." + '\n');
				room = 3;
				break;
			
			case "yes":
				slowPrint('\n'+ "SOMETHING JUMPS AT YOU!" + '\n');
				room = 4;
				break;

			case "no":
				slowPrint('\n' + "You can go to the labs." + '\n'
						+ "type *go west*" + '\n');
				room = 6;
				break;
				
			case "accept":
			case "ignore":
				slowPrint('\n' + "As the thought crosses your mind your communications device is flooded by an" + '\n'
						+ "unkown signal, a necron declaring itself as Trazyn the Infinite makes contact." + '\n'	);
				room = 5;
				break;
				
			case "help":
				slowPrint('\n' + "How to play: " + '\n'
						+ "Choices are always displayed with * * " + '\n'
						+ "Most situations in the game give you two options to choose from, a or b." + '\n'
						+ "From here you can type:" + '\n'
						+ "* Where can I go * or * Exit * " + '\n');
				break;
				
			case "setting":
				slowPrint('\n' + "What do you want to know more about?" + '\n');
				if (command.toLowerCase() == "Marine") {
					Object xor = characters.get(0);
					System.out.println(xor);
				}
				
				break;
				
			case "exit":
				slowPrint("Thanks for playing!");
				characters.clear();
				scanner.close();
				System.exit(0);
				
				
			default:
				slowPrint("Input does not match known command, try again." + '\n');
			
		}		
		
		}catch (InputMismatchException e) {
			slowPrint("Input is mismatched");
			continue;
		}
		
		
 }	
} 	
	
	// metodos para imprimir com delay
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
}