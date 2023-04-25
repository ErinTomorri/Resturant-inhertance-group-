package Objects;

public class alcoholicDrinksMenu extends menu{
	private int alcoholContent;
	public alcoholicDrinksMenu(int n, int x) {
		if(n == 1) {
			name = "Tequilla";
			price = 4.99;
			cals = 64;
			carb = 0;
			fat = 0;
			protein = 0;
			alcoholContent = 40;
		}else if(n == 2){
			name = "Mojitos";
			price = 4.99;
			cals = 240;
			carb = 30;
			fat = 0;
			protein = 0;
			alcoholContent = 13;
		}
	}
}
