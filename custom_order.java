// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

 
    public static void main(String[] args) {
        
        
    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
	  
       Scanner key = new Scanner(System.in);
	   System.out.println("Welcome to the cupcake shop, Please enter your name:");
	 
    // Introduce shop and prompt user to input first name
        String firstName; // User's first name
		String itemOrder; // Item ordered
		String frostingType; // Frosting ordered
		String fillingType; // Filling ordered
		String toppings; // Toppings ordered
		String input;  // User input

		double cost = 15.00; // Cost of cake and cupcakes
		final double TAX_RATE = .08;  // Sales tax rate
		double tax; // Amount of tax
	   

	    System.out.println("Welcome to Java's Cake & Cupcake Shop!");
		System.out.println("We make custom cakes with our secret cake batter!");
       
    // TEST CODE
	
	    
		
		
    
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
        System.out.println("What is your first name");
		firstName = key.nextLine();
		System.out.println(firstName + ", please see our Menu below: ");
		System.out.println("\n");
		
    // TEST CODE     
    
    // STEP 4 DISPLAY MENU
       System.out.println("___________________________________");
	   System.out.println("MENU        QUANTITY      BASE CODE");
	   System.out.println("___________________________________");
	   System.out.println("CAKE            1                1$");
	   System.out.println("set of cupcakes   6             15$");
	   System.out.println("Frosting(Vanilla, chocolate,strawberry,coco");
	   System.out.println("Fillings(mocha,mint,lemon,caramel,vannila");
	   System.out.println("Toppings(sprinkles,cinnamon,cocoa,nuts");
	   System.out.println("________________________________________");
      // TEST CODE     
    
    // STEP 5 PROMPT USER TO ORDER

       System.out.println("Do you want CUPCAKES or a CAKE?");
	   itemOrder = key.nextLine();
	  
	  
      
    // TEST CODE
      
    // STEP 6 PROMPT USER TO CHOOSE FROSTING
       System.out.println("What type of frosting do you want");
	   System.out.println("Vanilla, Chocolate, Strawberry");
	   frostingType = key.nextLine();
	 
	 
	 
      
    //TEST CODE
      
    // STEP 7 PROMPT USER TO CHOOSE FILLING
       System.out.println("What type of Filling do you want?");
	   System.out.println("Mocha, Mint, Lemon, caramel or raspberry");
	   fillingType = key.nextLine();

	  
	  
      
    // TEST CODE
      
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS

       System.out.println("What type of TOPPIINGS do you want?");
	   System.out.println("Sprinkles, Cinnamon, Cocoa, Nuts");
	   toppings = key.nextLine();
	
      
      
    // TEST CODE
      
    // STEP 9 DISPLAY ORDER CONFIRMATION
       System.out.println("firstName :"  + firstName); 
       System.out.println("itemOrder:"  + itemOrder); 
	   System.out.println("frostingType :"  + frostingType); 
	   System.out.println("fillingType :"  + fillingType); 
	   System.out.println("toppings :"  + toppings); 
	  
	      //System.out.println("COST IS" + cost);
	   //tax = TAX_RATE * cost ;
	   //System.out.println("The tax is" + tax);
	   
	   
	   
    
	  
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX
       System.out.printf("The cost of your order is: $%.2f\n", cost);
tax = cost * TAX_RATE;
System.out.printf("The tax is: $%.2f\n", tax);
System.out.printf("The total due is: $%.2f\n",(tax + cost));
    }   
}