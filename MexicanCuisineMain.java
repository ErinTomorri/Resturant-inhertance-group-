import java.util.Scanner;

public class MexicanCuisineMain {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("");
		int menuChoice = -1;
		int foodChoice = -1;
		int numOfItems = -1;
		int cartOption = -1;
		int itemNumber = 0;
		Menu items[] = new Menu[1000]; // all have price (double), num of items (int), name of item (String)
		DisplayMenu dispMenu = new DisplayMenu();
		Cart cart[] = new Cart[1000];
		
		// Get items from menu -> save into cart
		// Menu class is the one who is doing the actual saving
		// Main is the one who is sending information
		
		System.out.println("Welcome to the Giuseppe-Marios Mexican Cuisine app...");
		System.out.println("located in Albania!");
		
		while (menuChoice != 0) {
			while (menuChoice != 0 && menuChoice != 1 && menuChoice != 2) {
				System.out.println("Adults Menu - 1");
				System.out.println("Kids Menu - 2");
				System.out.println("Drinks - 3");
				System.out.println("Alcoholic Drinks - 4");
				System.out.println("Check Out - 0");
				menuChoice = user_input.nextInt();
				if (menuChoice != 0 && menuChoice != 1 && menuChoice != 2 && menuChoice != 3 && menuChoice != 4) {
					System.out.println("Please enter the given options.");
				}
			}
			
			if (menuChoice != 0) {
				if (menuChoice == 1) {
					while (foodChoice != 1 && foodChoice != 2 && foodChoice != 3 && foodChoice != 4 && foodChoice != 5) {
						System.out.println(dispMenu.dispAdultMenu()); // display class method
						foodChoice = user_input.nextInt();
						if (foodChoice != 1 && foodChoice != 2 && foodChoice != 3 && foodChoice != 4 && foodChoice != 5) {
							System.out.println("Please enter the given options.");
						}
					}
					System.out.println("How many do you want to purchase?");
					numOfItems = user_input.nextInt();
					//items[itemNumber] = new adultMenu(foodChoice, numOfItems); // setting values for the adult item
				} else if (menuChoice == 2) {
					while (foodChoice != 1 && foodChoice != 2 && foodChoice != 3) {
						System.out.println(dispMenu.dispChildMenu());
						foodChoice = user_input.nextInt();
						if (foodChoice != 1 && foodChoice != 2 && foodChoice != 3) {
							System.out.println("Please enter the given options.");
						}
					}
					System.out.println("How many do you want to purchase?");
					numOfItems = user_input.nextInt();
					//items[itemNumber] = new childMenu(foodChoice, numOfItems); // setting values for the child item
				} else if (menuChoice == 3) {
					while (foodChoice != 1 && foodChoice != 2 && foodChoice != 3) {
						System.out.println(dispMenu.dispDrinkMenu()); // display class method
						foodChoice = user_input.nextInt();
						if (foodChoice != 1 && foodChoice != 2 && foodChoice != 3) {
							System.out.println("Please enter the given options.");
						}
					}
				} else if (menuChoice == 4) {
					while (foodChoice != 1 && foodChoice != 2 && foodChoice != 3 && foodChoice != 4 && foodChoice != 5) {
						System.out.println(dispMenu.dispAlcoholicDrinkMenu()); // display class method
						foodChoice = user_input.nextInt();
						if (foodChoice != 1 && foodChoice != 2 && foodChoice != 3 && foodChoice != 4 && foodChoice != 5) {
							System.out.println("Please enter the given options.");
						}
					}
				}
				
				menuChoice = -1; // refreshes menuChoice option
				foodChoice = -1;
				itemNumber++; // moves to next item in array
			}
		}
		
		// Cart method // pass in Menu array
		// Display "receipt", ask user to pay, give change... etc
		
		while (cartOption != 0) {
			// Cart method // pass in Menu array
			System.out.println("Enter selection:"); // may be in the class itself
			cartOption = user_input.nextInt();
			if (cartOption == 1) {
				cart[0].sortItemsPrice();
			} else if (cartOption == 2) {
				cart[0].sortItemsReversePrice();
			} else if (cartOption == 3) {
				cart[0].sortItemsCalories();
			} else if (cartOption == 4) {
				cart[0].sortItemsReverseCalories();
			} else if (cartOption == 5) {
				cart[0].sortItemsCarbs();
			} else if (cartOption == 6) {
				cart[0].sortItemsReverseCarbs();
			} else if (cartOption == 7) {
				cart[0].sortItemsFats();
			} else if (cartOption == 8) {
				cart[0].sortItemsReverseFats();
			} else if (cartOption == 9) {
				cart[0].sortItemsAlpUp();
			} else if (cartOption == 10) {
				cart[0].sortItemsAlpDown();
			} else if (cartOption == 11) {
				cart[0].sortItemsProteins();
			} else if (cartOption == 12) {
				cart[0].sortItemsReverseProteins();
			} 
		}
		
		// maybe while loop if user amount is less than amount to pay
		System.out.println("Enter amount:");
		
		// display change
		System.out.println("Come visit again!");
	}
}
