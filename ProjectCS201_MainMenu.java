package CS201Homework;

import java.util.Scanner;

public class ProjectCS201_MainMenu {
	
	public static void main(String[] args) throws Exception {
		Scanner input=new Scanner(System.in);
		System.out.println("Select the option number:\n(1) Add products \n(2) Search products \n(3) Categorized list ");
		String opt=input.nextLine();//Gives the option of selecting the function to the user
		switch (opt) 
		{
		     case("1")://It will take user to the adding products function if user inputs 1
		    	 ProjectCS201_Create_CSV.main(args);
		         break;
		     case ("2")://It will take user to the searching for products function if user inputs 2
		    	 ProjectCs201_Searching.main(args);
		    	 break;
		     case("3")://It will take user to the listing categories function if user inputs 3
		    	 ProjectCS201_Listing.main(args);
		         break;
		}
	}	
}

