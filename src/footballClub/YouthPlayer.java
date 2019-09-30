package footballClub;

public class YouthPlayer extends Player implements AcadamyGrad
{
	// data members
	int academyGrad;
	
	// constructor
	public YouthPlayer()
	{
		super();
		academyGrad = getAcademyGrad();
	}

	// methods
	public int getAcademyGrad() {
		System.out.println("When do you graduate from the academy ? ");
		academyGrad = console.nextInt();
		return academyGrad;
	}
	
	//*************************************************************************
	
	public String toPrintFile()
	{
		String str1;
		
		str1 = super.toPrintFile();
		str1 += "Graduation Year: "+ academyGrad +"\t";
			 	
		return str1;
	}
	
	//*************************************************************************
	
	public String toString()
	{
		String str;
		
		str = super.toString();
		str += "Graduation Year: "+ academyGrad +"\n";
			 	
		return str;
	}
}// end of youth player class
