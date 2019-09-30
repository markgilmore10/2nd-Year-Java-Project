package footballClub;

import java.util.*;

public abstract class Staff {
	
	//data members
	String name;
	String nationality;
	int age;
	int staffNo;
	int seasonsAtClub;
	int contractExpiry;
	double weeklyHoursWorked;
	double weeklyWage;
	double hourlyPay;
	
	Scanner console = new Scanner(System.in);
	
	// constructor
	Staff()
	{
		super();
		name = getWorkerName();
		nationality = getNationality();
		age = getAge();
		staffNo = getStaffNo();
		seasonsAtClub = getSeasons();
		contractExpiry = getContractExpiry();
		weeklyHoursWorked = getHoursWorked();
		weeklyWage = getWeeklyWage();
		hourlyPay = setHourlyPay(weeklyHoursWorked, weeklyWage);
	}

	// methods
	private String getWorkerName() 
	{
		System.out.println("What is your name ? ");
		name = console.nextLine();
		return name;
	}
	
	//*************************************************************************
	
	private String getNationality() 
	{
		System.out.println("What is your nationality ? ");
		nationality = console.nextLine();
		return nationality;
	}
	
	//*************************************************************************
	
	private int getAge()
	{
		System.out.println("What age are you ? ");
		age = console.nextInt();
		return age;
	}
	
	//*************************************************************************

	private int getStaffNo() 
	{
		System.out.println("What is your staff number ? ");
		staffNo = console.nextInt();
		return staffNo;
	}
	
	//*************************************************************************
	
	private int getSeasons() 
	{
		System.out.println("How many seasons are you at the club ? ");
		seasonsAtClub = console.nextInt();
		return seasonsAtClub;
	}
	
	//*************************************************************************
	
	private int getContractExpiry() 
	{
		System.out.println("When does your contract expire ? ");
		contractExpiry = console.nextInt();
		return contractExpiry;
	}
	
	//*************************************************************************

	private double getHoursWorked() 
	{
		System.out.println("How many hours do you work per week ? ");
		weeklyHoursWorked = console.nextDouble();
		return weeklyHoursWorked;
	}
	
	//*************************************************************************

	private double getWeeklyWage() 
	{
		System.out.println("What is your weekly wage ? ");
		weeklyWage = console.nextDouble();
		return weeklyWage;
	}
	
	//*************************************************************************
	
	private double setHourlyPay(double weeklyHoursWorked, double weeklyWage) 
	{
		hourlyPay = weeklyWage / weeklyHoursWorked;
		return hourlyPay;
	}
	
	//*************************************************************************

	public String toPrintFile()
	{
		String str1;
		str1 = "\tName: "+ name +"\t"+
		"Nationality: "+ nationality +"\t"+
		"Age: "+ age +"\t"+
		"Staff ID: "+ staffNo + "\t"+
		"Seasons at Club: "+ seasonsAtClub +"\t"+
		"Contract Expiry: "+ contractExpiry +"\t"+
		"Hours worked per week: "+ weeklyHoursWorked + "\t"+
		"Weekly wage: "+ weeklyWage + "\t"+
		"Hourly Pay: "+ hourlyPay +"\t";
			 	
		return str1;
	}
	
	//*************************************************************************

	public String toString()
	{
		String str;
		str = "Name: "+ name +"\n";
		str += "Nationality: "+ nationality +"\n";
		str += "Age: "+ age +"\n";
		str +="Staff ID: "+ staffNo + "\n";
		str += "Seasons at Club: "+ seasonsAtClub +"\n";
		str += "Contract Expiry: "+ contractExpiry +"\n";
		str +="Hours worked per week: "+ weeklyHoursWorked + "\n";
		str +="Weekly wage: "+ weeklyWage + "\n";
		str += "Hourly Pay: "+ hourlyPay +"\n";
			 	
		return str;
	}

} // end of staff class
