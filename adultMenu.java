public class adultMenu extends menu{
	public adultMenu(int n, int x) {
		if(n == 1) {
			name = "Chicken Burrito";
			price = 10.99;
			cals = 600;
			carb = 80;
			fat = 10;
			protein = 48;
		} else if(n == 2){
			name = "Chicken Taco";
			price = 10.99;
			cals = 500;
			carb = 60;
			fat = 10;
			protein = 48;
		}else if(n == 3){
			name = "Fish Burrito";
			price = 12.99;
			cals = 720;
			carb = 82;
			fat = 24;
			protein = 39;
		}else if(n == 4){
			name = "Fish Taco";
			price = 12.99;
			cals = 620;
			carb = 62;
			fat = 24;
			protein = 39;
		}else if(n == 5){
			name = "Cheese Quesadilla";
			price = 6.99;
			cals = 400;
			carb = 50;
			fat = 20;
			protein = 5;
		}
		
		numOfItem = x;
		price = price*x;
	}
}
