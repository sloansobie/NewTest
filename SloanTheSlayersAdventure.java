import java.util.Scanner;
public class SloanTheSlayersAdventure {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name");
		String name = in.nextLine();
		System.out.println("Hello " + name + "," );	
		System.out.println("Are you ready to begin your adventure?");
		Scanner inputChoice = new Scanner(System.in);
		String choice = inputChoice.nextLine();
		String upchoice = choice.toUpperCase();
		if (upchoice.equals("Y")) {
			System.out.println("How noble, your adventure begins in a small town called " + name + "ville, what are the chances!");
		} else {
			System.out.println("Well then why did you approuch me? What a waste of time, good day.");
			return;
		}
		
		System.out.println ("A dirty old man approachs you offering a magic glowing orb in return for the small poach of coins your holding, do you agree?");
		//Scanner inputChoice = new Scanner(System.in);
		choice = inputChoice.nextLine();
		upchoice = choice.toUpperCase();
		
		if (upchoice.equals("Y")) {
			System.out.println("The so called magic glowing ball is just a bouncy ball with a piece of a mirror that has been stabbed into it, which makes it looks like it's glowing. You have wasted the last of your money and soon die on the street due to a lack of water and food.");
		} else {
			System.out.println("Few, that guy looked kinda sketchy.");	
			System.out.println("Wait... it looks like the dirty old man really wanted you to buy his glowing ball. He's charging at you and looks angry");
		}
		
		System.out.println("You have the to when I count to 10 to decide... " + "Click R to run and F to stay and fight");
		
		for (int t = 1; t <= 10; t = t + 1)
				System.out.println("He's coming in " + t);
		//Scanner inputChoice = new Scanner(System.in)
		choice = inputChoice.nextLine();
		upchoice = choice.toUpperCase();
		
		if (upchoice.equals("R")) {
			System.out.println ("Wooooohoooooo.");
		} else {
			
		}
	}	
}
