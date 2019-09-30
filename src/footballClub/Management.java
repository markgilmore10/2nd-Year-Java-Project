package footballClub;

import java.util.Scanner;

public class Management extends Staff
{
	// data members
	String role;
	String based;
	int playersOver;
	
	Scanner console = new Scanner(System.in);
	
	// constructor
	public Management()
	{
		super();
		role = getRole();
		based = getBased();
		playersOver = getPlayersOver();
	}

	// methods
	private String getRole() {
		System.out.println("What is your role at the club ? ");
		role = console.nextLine();
		return role;
	}
	
	//*************************************************************************
	
	private String getBased() {
		System.out.println("Where are you based (Home or Abroad) ? ");
		based = console.nextLine();
		return based;
	}
	
	//*************************************************************************

	private int getPlayersOver() {
		System.out.println("How many players are you over ? ");
		playersOver = console.nextInt();
		return playersOver;
	}
	
	//*************************************************************************
	
	public String toPrintFile()
	{
		String str1;
		
		str1 = super.toPrintFile();
		str1 += "Role: "+ role +"\t"+
		"Based: "+ based +"\t"+
		"Players Over: "+ playersOver +"\t";
			 	
		return str1;
	}
	
	//*************************************************************************
	
	public String toString()
	{
		String str;
		
		str = super.toString();
		str += "Role: "+ role +"\n";
		str += "Based: "+ based +"\n";
		str += "Players Over: "+ playersOver +"\n";
			 	
		return str;
		
	}
	
}// end of management class
