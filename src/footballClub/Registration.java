package footballClub;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Registration {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner console = new Scanner(System.in);
		
		
		// Output files for data
		PrintWriter outFileSP = new PrintWriter("seniorPlayer.txt");
		PrintWriter outFileYP = new PrintWriter("youthPlayer.txt");
		PrintWriter outFileSM = new PrintWriter("seniorManagement.txt");
		PrintWriter outFileYM = new PrintWriter("youthManagement.txt");
		
		String job;
		
		// pre-while loop test
		do
		{
			System.out.println("Are you part of (P)layers or (M)anagement or choose (Q)uit ??");
			job = console.nextLine();
			job = job.toUpperCase();
		
		}while((!(job.equals("P")))&&(!(job.equals("M")))&&(!(job.equals("Q")))); // checking for correct input
		
		if(!(job.equals("Q")))
		{
			
			 if (job.equals("P")) // worker is a player
			 {
				System.out.println("Are you a (S)enior player or a (Y)outh player ??");
				job = console.nextLine();
				job = job.toUpperCase();
				
				if(job.equals("S")) // worker is a senior player
				{
					Staff s1 = new SeniorPlayer();
					System.out.println(s1.toString());
					outFileSP.print ( s1.getClass().getName());
					outFileSP.println (s1.toPrintFile());
				}
				else if(job.equals("Y")) // worker is a youth player
				{
					Staff y1 = new YouthPlayer();
					System.out.println(y1.toString());
					outFileYP.print ( y1.getClass().getName());
					outFileYP.println (y1.toPrintFile());
				}
				else
				{
					System.out.println("Invalid Option");
				}
			 } // if
			 
					
				 if (job.equals("M")) // worker is a coach or manager
				 {
					System.out.println("Are you a (S)enior coach or a (Y)outh coach ??");
					job = console.nextLine();
					job = job.toUpperCase();
					
					if(job.equals("S")) // worker is a senior coach
					{
						Staff s1 = new SeniorCoach();
						System.out.println(s1.toString());
						outFileSM.print ( s1.getClass().getName());
						outFileSM.println (s1.toPrintFile());
					}
					else if(job.equals("Y")) // worker is a youth coach
					{
						Staff y1 = new YouthCoach();
						System.out.println(y1.toString());
						outFileYM.print ( y1.getClass().getName());
						outFileYM.println (y1.toPrintFile());
					}
					else
					{
						System.out.println("Invalid Option");
					}
				 } // if
			 
		}// Main if
		
		// Close Files
		outFileSP.close();
		outFileYP.close();
		outFileSM.close();
		outFileYM.close();
		console.close();
		
	}// main

}// class
