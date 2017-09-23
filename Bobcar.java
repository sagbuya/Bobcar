import java.util.Scanner;

public class Bobcar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int car, days, member, platinum = 0; 
		int basePrice=0, disc=0, oneDayCost=0;
		int econ=35, comp=45, stand=95;
		double plat=0;

		//Intro
		System.out.println("\t\tBobcar Rent-a-Car");

		//Ask User
		System.out.println("Available cars: 1 for Economy, 2 for Company, 3 for Standard");		
		System.out.print("Please choose the rental car: ");
		car = input.nextInt();	
		System.out.print("Please enter the number of rental days: ");
		days = input.nextInt();
		System.out.print("Club member?: 1 for yes, 0 for no: ");
		member = input.nextInt();

		if (member == 1) {
			System.out.print("Platinum Executive Package?: 1 for yes, 0 for no: ");
			platinum = input.nextInt();
		}

		//Base
		System.out.print("\nBase: " + days );

		if (car == 1){		
			oneDayCost=econ;
			basePrice=econ*days;
			System.out.println(" days for a Economy @ $35 per day: $ " + (int) basePrice);
		}
		else if (car == 2){	
			oneDayCost=comp;
			basePrice=comp*days;
			System.out.println(" days for a Company @ $45 per day: $ " + (int) basePrice);
		}
		else if (car == 3){		
			oneDayCost=stand;
			basePrice=stand*days;
			System.out.println(" days for a Standard @ $95 per day: $ " + (int) basePrice);
		}    

		//Club Member
		if (member == 0){
			disc=0;
		}	
		else if (member == 1){
			disc= (days/7) *(oneDayCost);
			if (platinum==1)
				plat= (double) (basePrice*0.15);
		}		
		//Final Prints	
		System.out.println("Club Member Discount:                    - $ "+ (int) disc );

		if (platinum == 1){
			System.out.println("Platinum Executive Package:              + $ " + plat);		
		}	

		System.out.println("\nTotal Estimate for Rental:                $ " + (basePrice-disc+plat));

	}

}
