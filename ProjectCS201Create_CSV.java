package CS201Homework;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProjectCS201Create_CSV {
	static int i=1;//static because we want to access it in the main method

	public static void main(String[] args) throws Exception {
		Scanner input=new Scanner(System.in);
		try 
		{//Giving the file path and using FileWriter to store Data appended in the master list.
			FileWriter pw = new FileWriter("C:\\Users\\vishn\\OneDrive\\Documents\\Input_File.csv",true);
	        StringBuilder sb=new StringBuilder();//Better version of string,
	        
		    while(i==1)
		    {//Inputing values
		         System.out.print("Input the category:");
	             String category=input.nextLine();
		         System.out.print("Input the name:");
		         String name=input.nextLine();
		         System.out.print("Input the brand:");
		         String brand=input.nextLine();
		         System.out.print("Input the price:");
		         String price=input.nextLine();
		         System.out.print("Input the Expiration Period(between 0-365 days) :");
		         String expirationPeriod=input.nextLine();
		         System.out.print("Input the status of the product(In-store/sold-out):");
		         String status=input.nextLine();
		         System.out.println("The product is added successfully!!!");
			
	    		sb.append(category);//Adding it in the mainmenu using the .append(String)
		        sb.append(",");//, because it is a CSV File
		        sb.append(name);
		        sb.append(",");
		        sb.append(brand);
		        sb.append(",");
		        sb.append(price);
		        sb.append(",");
		        sb.append(expirationPeriod);
		        sb.append(",");
		        sb.append(status);
		        sb.append("\r\n");
		        ourSwitchCase();//Here we are calling the switch case method
	    	}
		
		    pw.write(sb.toString());
	        pw.close();//Close the FileWriter object
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}	
		System.out.println("Finished,returning to main method");
		ProjectCS201_MainMenu.main(args);//This step takes you to the main menu
	}
	public static int ourSwitchCase()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Add another product(1) or Return to main menu(2):");
		int condition=input.nextInt();
		int YesNo;
		switch (condition)
		{
		   case 1:
		   {
			   System.out.println("Do you want to continue,Yes(1)/No(2)");
			   int YN=input.nextInt();   
			   do{
			   if (YN==1)
			   {
				   YesNo=1;//If user inputs Non-(Yes/No values)
				   i=1;
				   return 1;//If user wants to continue it will re enter the while loop
			   }
			   else if (YN==2)
			   {
				   YesNo=1;
				   i=0;
				   return 0;
			   }
	
			   else 
			   {
				   System.out.println("Yes / No");
				   YesNo=0; 
			   }
			   }while (YesNo==0);
		   }
		   case 2:
		   {
			   //System.out.println("Returning to main method");
			   i=0;
			   break;
		   }
		   default:
		   return 0;
		}
	return 0;
	}
}
