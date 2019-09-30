package footballClub;

import java.util.Scanner;

public class YouthCoach extends Management{

	// data members
	String optimism, optimistic;
	
	Scanner console = new Scanner(System.in);
	
	// constructor
	public YouthCoach()
	{
		super();
		optimism = getOptimism();
	}

	// method
	public String getOptimism() {
		System.out.println("Are you optimistic about the current group of young players ? ");
		optimism = console.nextLine();
		optimism = optimism.toUpperCase();
		
		if(optimism.equals("Y"))
		{
			optimistic = "Yes";
		}
		else
		{
			optimistic = "No";
		}
		return optimistic;
	}
	
	//*************************************************************************
	
	public String toPrintFile()
	{
		String str1;
		
		str1 = super.toPrintFile();
		str1 += "Optimistic: "+ optimism +"\t";
			 	
		return str1;
	}
	
	//*************************************************************************
	
	public String toString()
	{
		String str;
		
		str = super.toString();
		str += "Optimistic: "+ optimism +"\n";
			 	
		return str;
	}
}// end of youth coach class


