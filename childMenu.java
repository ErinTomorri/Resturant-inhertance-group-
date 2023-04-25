package Objects;

public class childMenu extends menu{
	public childMenu(int n, int x) {
		if(n == 1) {
			name = "Small Chicken Burrito";
			price = 7.99;
			cals = 400;
			carb = 50;
			fat = 10;
			protein = 28;
		}else if(n == 2){
			name = "Small Fish Taco";
			price = 8.99;
			cals = 450;
			carb = 52;
			fat = 14;
			protein = 29;
		}else if(n == 3){
			name = "Fried Chicken and Fries ";
			price = 6.99;
			cals = 400;
			carb = 50;
			fat = 12;
			protein = 23;
		}
		
		numOfItem = x;
		price = price*x;
	}
}
