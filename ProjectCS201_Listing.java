package CS201Homework;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ProjectCS201_Listing {
	static boolean X=false;//Assigning X=false to enter the while loop initially
	public static void main(String[] args) throws Exception {
		
		while (X==false)
		{
			int abcd=0;
			Scanner input= new Scanner(System.in);
		    System.out.println("Choose one of these catogories:");//Asks user to choose one of the available categories
	        String splitBy = ",";//Helps in splitting the CSV file by ,
	        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vishn\\OneDrive\\Documents\\Input_File.csv"));//Here we are reading the file where we added/had the categories before
	        
	        String line;
	        int j=0;//We use this to skip the first heading line
	        Set <String> category=new LinkedHashSet<String>();
	        while((line = br.readLine()) != null) //Goes to the loop till theere are no values available
	        {
	        	if (j==0)
	    	    {
	    	    	j++;//If j=0 (heading line) skip the line
	    	    }
	    	    else
	    	    {
	                 String[] b = line.split(splitBy);//Splits the line2 by , and adds to array b[] 
	                 category.add(b[0]);
	    	    }
	    	
	        }
	        System.out.println(category);//Gives the category options to the users
	        System.out.println("Select the category you want (Empty box means that the category has not been added yet):");
	        String str=input.nextLine();//Asks user to input the category which he wants to select
	    
	        BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\vishn\\OneDrive\\Documents\\Input_File.csv"));//Similar to br
	        j=0;
	        String line1;//Similar to line
	        
	        Set <String> name=new LinkedHashSet<String>();  
     	    while((line1 = br1.readLine()) != null)//Goes to the loop till theere are no values available
	        {
	         	String[] b = line1.split(splitBy);//Splits the line2 by , and adds to array b[] 
	  
	        	if (b[0].equalsIgnoreCase(str)) //Check if the input category is available 
	    	    {  
	        		name.add(b[1]);
	    	    }
	        }
	        System.out.println(name);//Gives the product options to the users
	
	        System.out.println("Select the product you want to see the details about from above:");
	        String str1=input.nextLine();//Asks the user to input the Product Name which he the details about 
        
	        BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\vishn\\OneDrive\\Documents\\Input_File.csv"));//Similar to br
	        j=0;//Reassign 0 to j
	        String line2;//Similar to line
	    
	        Set <String> details=new LinkedHashSet<String>(); 
	        while((line2 = br2.readLine()) != null)//Goes to the loop till there are no values available
	        {
	    	     String[] b = line2.split(splitBy);//Splits the line2 by , 
	    	     if (b[1].equalsIgnoreCase(str1)) //Check if the name of the product is equal to any of the available products
	    	     {//Prints the details of the Selected product
	    		      details.add(b[2]);
	    		      System.out.println("Brand-"+b[2]+" ,Price-$"+b[3]+" ,Expiration Period-"+b[4]+" ,Status-"+b[5]);	
	    		      abcd=10; //assingning some random value
	    	     }  
	        }     
	        if (abcd==0)
		    {//Prints when ever the product is not available in the category
			     System.out.println("Product not found in this catogory");
			     abcd++;//To make the sysout value print only once
		    }
	        br.close();//Close the buffered reader object
	        ourWrongCase();
		}
		ProjectCS201_MainMenu.main(args);//Takes you back to the mainmenu whenever the user asks
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
