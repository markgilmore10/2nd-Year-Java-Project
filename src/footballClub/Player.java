package footballClub;

import java.util.Scanner;

public class Player extends Staff 
{
	// data members
	String position;
	String preferredFoot;
	int squadNumber;
	
	Scanner console = new Scanner(System.in);
	
	// constructor
	public Player()
	{
		super();
		position = getPosition();
		preferredFoot = getPreferredFoot();
		squadNumber = getSquadNumber();
	}
	
	//methods
	private String getPosition() 
	{
		System.out.println("What position do you play ? ");
		position = console.nextLine();
		return position;
	}

	//*************************************************************************
	
	private String getPreferredFoot() 
	{
		System.out.println("What is your preferred foot ? ");
		preferredFoot = console.nextLine();
		return preferredFoot;
	}

	//*************************************************************************
	
	private int getSquadNumber() 
	{
		System.out.println("What is your squad number ? ");
		squadNumber = console.nextInt();
		return squadNumber;
	}
	
	//*************************************************************************
	
	public String toPrintFile()
	{
		String str1;
		
		str1 = super.toPrintFile();
		str1 += "Position: "+ position +"\t"+
		 "Preferred Foot: "+ preferredFoot +"\t"+
		 "Squad Number: "+ squadNumber +"\t";
			 	
		return str1;
	}
	
	//*************************************************************************
	
	public String toString()
	{
		String str;
		
		str = super.toString();
		str += "Position: "+ position +"\n";
		str += "Preferred Foot: "+ preferredFoot +"\n";
		str += "Squad Number: "+ squadNumber +"\n";
			 	
		return str;

	}
	
}// end of player class
