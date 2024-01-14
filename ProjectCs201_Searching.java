package CS201Homework;

import java.io.*;
import java.util.*;

public class ProjectCs201_Searching {
	static boolean X=false;//Assigning X=false to enter the while loop initially
	static boolean Y;
	public static void main(String[] args) throws Exception {
	    while (X==false)//Enters the while loop till the value of X is false
		{
	    	int abcd=0;
	    	Y=false;
		    Scanner input=new Scanner(System.in);
		    System.out.println("Enter the product name you want to see the details about:");
		    String str=input.nextLine();//Asks user to input the product name he is looking for
	        
		    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vishn\\OneDrive\\Documents\\Input_File.csv"));//Here we are reading the file where we added/had the categories before

		    String line;
		    String splitBy = ",";
		    Set <String> details=new LinkedHashSet<String>();
		    
		    while((line = br.readLine()) != null)
		    {
		    	String[] b = line.split(splitBy);
		    	if (b[1].equalsIgnoreCase(str)) //If the Product name inputed by is available 
		    	{
		    		details.add(b[2]);
		    		Y=true;
		    		abcd++;
		    		System.out.println("Category-"+b[0]+" ,Brand-"+b[2]+" ,Price-$"+b[3]+" ,Expiration Period-"+b[4]+" ,Status-"+b[5]);
		    	}
		    }   
		    br.close();//Close the buffered Reader
		    if (abcd==0 )
		    {
		    	System.out.println("No product found");
		    }
		    ourWrongCase();
		}
	    
	    ProjectCS201_MainMenu.main(args);//Goes to the mainMenu once the use types No
	}
	public static void ourWrongCase()
	{
		Scanner input=new Scanner(System.in);
		System.out.println();
	    System.out.println("Do you want to search another product:");
	    System.out.println("Yes/No (No will take you back to Mainmenu)");
	    String str3=input.nextLine();//Asks user to input to if he wants to continue
	    int x=0;
	    while(x==0)
	    {
	         if (str3.equalsIgnoreCase("Yes"))
	         {
	    	     X=false;//Repeats the loop
	    	     x=1;
	         }
	         else if(str3.equalsIgnoreCase("No")) 
	         {
	    	     System.out.println("Returning to main menu");
	    	     X=true;//Goes out of the loop and returns to the mainmenu
	    	     x=1;
	         }
	         else 
	         {
	        	 x=0;
	    	     System.out.println("Please input Yes/No");
	    	     str3=input.nextLine();//Makes sure if the user inputs Yes/No 	
	         }     
	    }
	}
}
