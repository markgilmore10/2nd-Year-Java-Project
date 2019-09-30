package footballClub;

import java.util.Scanner;

public class SeniorCoach extends Management{
	
	// data members
	String improvement;
	
	Scanner console = new Scanner(System.in);
	
	// constructors
	public SeniorCoach()
	{
		super();
		improvement = getImprovement();
	}

	// methods
	public String getImprovement() {
		System.out.println("What area of the pitch would you like to improve ? ");
		improvement = console.nextLine();
		return improvement;
	}
	
	//*************************************************************************
	
	public String toPrintFile()
	{
		String str1;
		
		str1 = super.toPrintFile();
		str1 += "Area would you like to improve: "+ improvement +"\t";
			 	
		return str1;
	}
	
	//*************************************************************************
	
	public String toString()
	{
		String str;
		
		str = super.toString();
		str += "Area would you like to improve: "+ improvement +"\n";
			 	
		return str;
	}
}// end of senior coach class
