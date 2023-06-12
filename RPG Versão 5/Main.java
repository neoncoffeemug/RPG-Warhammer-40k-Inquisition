import java.util.*;
import java.util.concurrent.*;
import javax.swing.*;
import java.awt.*;


public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int room = 0;
		String x = "";
		String command = "";	
		Frame frame = new Frame();
		Label label = new Label();
		
		// Array List (não usado)
		// A ideia principal era fazer um array com random para gerar nuúmeros e rodar um teste de porcentagem de acerto em combate
		/*
		ArrayList<Object> characters = new ArrayList<Object>();
		characters.add(new Marine("ok", 20, 20, 20));
		characters.add("Ultra Marine");
		characters.add("Necron Warrior");
		characters.add("Chaos Marine");
		System.out.println(characters);
		System.out.println(characters.size());
		*/	
			
		// Cria objetos
		Marine ultraMarine = new Marine("Ultra Marine", 20, 10, 15);
		Necron necronWarrior = new Necron("Necron Warrior", 18, 16, 14);
		ChaosMarine chaosMarine = new ChaosMarine("Chaos Marine", 22, 8, 20);
		
		// Imprime com delay
		slowPrint12("---------------------------------------------------------------------------------" +
				'\n' +
			      " _    _            _                                             ___ _____ _    \r\n"
				+ "| |  | |          | |                                           /   |  _  | |   \r\n"
				+ "| |  | | __ _ _ __| |__   __ _ _ __ ___  _ __ ___   ___ _ __   / /| | |/' | | __\r\n"
				+ "| |/\\| |/ _` | '__| '_ \\ / _` | '_ ` _ \\| '_ ` _ \\ / _ \\ '__| / /_| |  /| | |/ /\r\n"
				+ "\\  /\\  / (_| | |  | | | | (_| | | | | | | | | | | |  __/ |    \\___  \\ |_/ /   < \r\n"
				+ " \\/  \\/ \\__,_|_|  |_| |_|\\__,_|_| |_| |_|_| |_| |_|\\___|_|        |_/\\___/|_|\\_\\\r\n"
				+ "              _____                  _     _ _   _                              \r\n"
				+ "             |_   _|                (_)   (_) | (_)                             \r\n"
				+ "               | | _ __   __ _ _   _ _ ___ _| |_ _  ___  _ __                   \r\n"
				+ "               | || '_ \\ / _` | | | | / __| | __| |/ _ \\| '_ \\                  \r\n"
				+ "              _| || | | | (_| | |_| | \\__ \\ | |_| | (_) | | | |                 \r\n"
				+ "              \\___/_| |_|\\__, |\\__,_|_|___/_|\\__|_|\\___/|_| |_|                 \r\n"
				+ "                            | |                                                 \r\n"
				+ "                            |_|                                                          \r\n"
				+ "---------------------------------------------------------------------------------" + '\n');
		
		slowPrint('\n' +  "It is the 41st Millenium. In the grim darkness of the far future, there is only" + '\n'
				+ "war. The Emperor of Mankind wages a constant battle to protect humanity from the " + '\n'
				+ "horrors of space. On the fringes of the Imperium, alien races lurk and plot, and " + '\n'
				+ "chaos demons leak into our reality from the torment of the warp. All that stands " + '\n'
				+ "in their way are the mighty Space Marines. They are more than mortal. They are " + '\n'
				+ "steel, and they are doom. They are the champions of mankind. And the greatest of" + '\n'
				+ "them all are the Ultramarines..." + '\n'
				+ "You the only survivor of your squad has crash-landed into the world Atalia " + '\n'
				+ "Minoris, overrun by xenos and chaos. Since you failed to reach your original " + '\n'
				+ "location, you've been assigned a new misson: " + '\n'
				+ "Purge this world of all that stand against the Emperor." + '\n'
				+ '\n' + "---------------------------------------------------------------------------------" + '\n'
				+ '\n' + "To start the game type * Play *, type * Help * if you need any assistance or" + '\n'
						+ "type * exit * to close the game." + '\n');
		
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
				// trocar fonte interface gráfica (se possível)
				slowPrint('\n' +"Transmission Received"
						+ '\n' + "---------------------------------------------------------------------------------" + '\n'
						+ "Ultra Marines here? The imperium found this place earlier than my calculations" + '\n'
						+ "expected, but that makes little difference to me. Your device is not working properly" + '\n'
						+ "since you can't contact your superiors, and I am certain that is on purpose. Simple " + '\n'
						+ "mortal conflicts concern me little, the chaos research here that you would consider" + '\n'
						+ "heresy was more valuable a century ago but time has destroyed most of the important" + '\n'
						+ "records. Even if you have been abandoned, I may have some use for a space marine" + '\n'
						+ "subject. " + '\n'
						+ '\n' + "---------------------------------------------------------------------------------" + '\n'
						+ "Transmission Over" + '\n'
				// Voltar fonte antiga
		        		+ '\n' + "As the transmission ends a patrol of necrons attack, you manage to destroy two"
		        		+ "with quick chainsword swings, but a warrior still stands in your way." + '\n');
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
				
			case "exit":
				slowPrint("Thanks for playing!");
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
				TimeUnit.MILLISECONDS.sleep(15);
			}
			catch (Exception e) {				
			}
		}
	}
	
	public static void slowPrint12(String output) {
		for (int i = 0; i<output.length(); i++) {
			char c = output.charAt(i);
			System.out.print(c);
			try {
				TimeUnit.MILLISECONDS.sleep(12);
			}
			catch (Exception e) {				
			}
		}
	}	
}