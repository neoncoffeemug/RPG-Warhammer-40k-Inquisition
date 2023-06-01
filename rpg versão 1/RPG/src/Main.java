import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int room = 0;
		String x = "";
		String command = "";
		
		Marine ultraMarine = new Marine("Ultra Marine", 20, 10, 15);
		Necron necronWarrior = new Necron("Necron Warrior", 18, 16, 14);
		ChaosMarine chaosMarine = new ChaosMarine("Chaos Marine", 22, 8, 20);
		Marine.powerSword(ultraMarine, chaosMarine, necronWarrior);
		
		slowPrint15("---------------------------------------------------------------------------------" +
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
				+ "You venture deep into one of the abandoned facilities. Something in the corner " + '\n'
				+ "catches your eye. A machine detailing, the places you can reach from the " + '\n'
				+ "entrance. " + '\n'
				+ '\n' + "Try typing * Where can I go *." + '\n');
		
		
		try {
		while(true) {
			
			
		/*	
			if(room == 1) {
				slowPrint('\n' + "You may choose what path you want to go." + '\n');
			} 
			
			else if(room == 2) {
				slowPrint("The labs walls are filled with grime, everything has been overrun by nature " + '\n'
						+ "for a long time. But the plac 	e is not abandoned, someone has been here recently. " + '\n');		
			}
			
			else if(room == 3) {
				slowPrint("The Common Area feels odd, you can sense the spraed of chaos within. You look" + '\n'
						+ "find a torn off transmition module, do you wish to inspect it?" + '\n');		
			}
			
			else if (room == 4) {
				slowPrint("You are attacked by a chaos space marine!" + '\n');
			}
			
			else if (room == 5) {
				slowPrint(chaosMarine.toString()+ '\n');
			}
			*/
			
			
			switch(room) {
			
			case 1:
				slowPrint('\n' + "You may choose what path you want to go." + '\n');
				break;
				
			case 2:
				slowPrint("The labs walls are filled with grime, everything has been overrun by nature " + '\n'
						+ "for a long time. But the place is not abandoned, someone has been here recently. " + '\n'
						+ "As the tought crosses your mind your communications device is flooded by an" + '\n'
						+ "unkown signal, a necron declaring itself as Trazyn the infinite makes contact" + '\n'	
						// Trocar a fonte na interface gráfica
						+ '\n' +"Transmission Received" + '\n'
						+ "Ultra Marines here? The imperium found this place earlier than my calculations" + '\n'
						+ "expected, but that makes little difference to me. Your device is not working properly" + '\n'
						+ "since you can't contact your superiors, and I am certain that is on purpose. Mere " + '\n'
						+ "mortal conflicts concern me little, the chaos research here that you would consider" + '\n'
						+ "heresy was more valuable a century ago but time has destroyed most of the important" + '\n'
						+ "records. Even if you have been abandoned, I may have some use for a space marine" + '\n'
						+ "subject. " + '\n'
						+ "Transmission Over"
						// Voltar fonte antiga
				        + '\n' + "As the transmission ends a patrol of necrons attack, you manage to evade two" + '\n'
				        + "but a warrior still stands in your way" + '\n'
				        + ""
						
				        );
				
				break;
				
			case 3:
				slowPrint("The Common Area feels odd, you can sense the spread of chaos within. You look" + '\n'
						+ "find a torn off transmission module, do you wish to inspect it?" + '\n');	
				break;
				
			case 4:
				slowPrint("You are attacked by a chaos space marine!" + '\n');
				slowPrint(chaosMarine.toString()+ '\n');
				break;
				
			case 5:
		
				
				break;
				
			case 6:
				slowPrint("");
			
			}
			
			
			
				
			
		// Get player input
		System.out.println("> ");
		command = scanner.nextLine();
	
		
/*		
		
		// Deal with player input
		if (room == 1) {
			if(command.toLowerCase().equals("where can i go")) {
				slowPrint("You can go West to the Alpha Labs, to go type * Go West *  " + '\n'
						+ "You can go East to the Common Area, to go type * Go East * " + '\n');
			}
		
			else if (command.toLowerCase().equals("go west")) {
				slowPrint('\n' + "You venture deep into the Alpha Labs" + '\n');	
				room = 2;
				
			}
			
			else if (command.toLowerCase().equals("go east")) {
				slowPrint('\n' + "You enter the Common Area" + '\n');
				room = 3;
				
			}
			
			else if (command.toLowerCase().equals("yes")) {
				slowPrint('\n' + "SOMETHING JUMPS AT YOU!" + '\n');
				room = 4;
			}
}
*/		
		// Deal with player input
		switch(command.toLowerCase()) {

			case "where can i go":
				slowPrint("You can go West to the Alpha Labs, to go type * Go West *  " + '\n'
						+ "You can go East to the Common Area, to go type * Go East * " + '\n');
				room = 1;
				break;
		
			case "go west":
				slowPrint('\n' + "You venture deep into the Alpha Labs" + '\n');	
				room = 2;
				break;
		
			case "go east":
				slowPrint('\n' + "You enter the Common Area" + '\n');
				room = 3;
				break;
			
			case "yes":
				slowPrint('\n'+ "SOMETHING JUMPS AT YOU!" + '\n');
				room = 4;
				break;

			case "no":
				slowPrint('\n' + "You can go to he labs" + '\n'
						+ "type *go west*" + '\n');
				room = 6;
				break;
				
			case "inspect":
				slowPrint('\n' + "You inspct the odd message" + '\n');
				room = 5;
				break;
			
			default:
				slowPrint('\n' + "Sorry" + '\n');
				break;
				
			
		
	
		
		}		
		
		
		}	
	} 
		catch (InputMismatchException e) {
			slowPrint("My bad bruv");
			
		}
	
	}

	
	
	
	
	

	
	
	
	

	
		
			
		
		
		
		
		
		
		
		/*
		System.out.println();
		System.out.println('\n' + UltraMarine.toString() + '\n');	 
		System.out.println(UltraMarine.powerSword());
		System.out.println('\n' + UltraMarine.toString());
		
		System.out.println("---------------------------------------------------------------------------------" + '\n');
		
		System.out.println(necronWarrior.toString());
		System.out.println('\n' + necronWarrior.gaussFlayer());
		System.out.println(necronWarrior.toString());
		*/
		
	
	
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
