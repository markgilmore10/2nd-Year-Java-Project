package footballClub;

import java.util.Scanner;

public class SeniorPlayer extends Player implements FullInternational
{
	// data members
	String represent, international;
	
	Scanner console = new Scanner(System.in);
	
	// constructor
	public SeniorPlayer()
	{
		super();
		international = getInternational();
	}

	// method
	public String getInternational() {
		System.out.println("Do you represent your country (Y / N) ? ");
		represent = console.nextLine();
		represent = represent.toUpperCase();
		
		if(represent.equals("Y"))
		{
			international = "Yes";
		}
		else
		{
			international = "No";
		}
		
		return international;
	}
	
	//*************************************************************************
	
	public String toPrintFile()
	{
		String str1;
		
		str1 = super.toPrintFile();
		str1 += "Full International: "+ international +"\t";
			 	
		return str1;
	}
	
	//*************************************************************************
	
	public String toString()
	{
		String str;
		
		str = super.toString();
		str += "Full International: "+ international +"\n";
			 	
		return str;
	}

}// end of senior player class
