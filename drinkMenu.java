package Objects;
public class drinkMenu extends menu{
	public drinkMenu(int n, int x) {
		if(n == 1) {
			name = "Diet Coke";
			price = 1.99;
			cals = 0;
			carb = 0;
			fat = 0;
			protein = 0;
		}else if(n == 2){
			name = "Coke";
			price = 1.99;
			cals = 120;
			carb = 30;
			fat = 0;
			protein = 0;
		}else if(n == 3){
			name = "Iced Tea";
			price = 1.99;
			cals = 100;
			carb = 25;
			fat = 0;
			protein = 0;
		}
	}
}
