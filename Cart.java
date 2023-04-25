package Objects;

public class cart {
    private String[] items;
    private int[] calories, protein, carbs, fats;
    private double[] price;
    public String[] getItems(){
        return items;
    }
    public double[] getPrice(){
        return price;
    }
    public int[] getCal(){
        return calories;
    }
    public int[] getPro(){
        return protein;
    }
    public int[] getCarbs(){
        return carbs;
    }    
    public int[] getFats(){
        return fats;
    }
    public void setItems(String[] newItems){
        items = newItems;
    }
    public void setPrice(double[] newPrice){
        price = newPrice;
    }
    public void setCal(int[] newCal){
        calories = newCal;
    }
    public void setPro(int[] newPro){
        protein = newPro;
    }
    public void setCarbs(int[] newCarbs){
        carbs = newCarbs;
    }    
    public void setFats(int[] newFat){
        fats = newFat;
    }
    public cart(String[] newItems, double[] newPrice, int[] newCal, int[] newPro, int[] newCarbs, int[] newFat){
        items = newItems;
        price = newPrice;
        calories = newCal;
        protein = newPro;
        carbs = newCarbs;
        fats = newFat;
    }
    public void sortItemsAlpUp(){ //change the name
        int n = items.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (items[j].compareTo(items[j+1]) > 0) {
                    // swap items[j+1] and items[j]
                    String temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;

                    double doubleTemp = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = doubleTemp;

                    int intTemp = calories[j];
                    calories[j] = calories[j + 1];
                    calories[j + 1] = intTemp;

                    intTemp = protein[j];
                    protein[j] = protein[j + 1];
                    protein[j + 1] = intTemp;

                    intTemp = carbs[j];
                    carbs[j] = carbs[j + 1];
                    carbs[j + 1] = intTemp;

                    intTemp = fats[j];
                    fats[j] = fats[j + 1];
                    fats[j + 1] = intTemp;
                }
            }
        }
    }
    public void sortItemsAlpDown(){ //change the name
        int n = items.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (items[j].compareTo(items[j+1]) < 0) {
                    // swap items[j+1] and items[j]
                    String temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;

                    double doubleTemp = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = doubleTemp;

                    int intTemp = calories[j];
                    calories[j] = calories[j + 1];
                    calories[j + 1] = intTemp;

                    intTemp = protein[j];
                    protein[j] = protein[j + 1];
                    protein[j + 1] = intTemp;

                    intTemp = carbs[j];
                    carbs[j] = carbs[j + 1];
                    carbs[j + 1] = intTemp;

                    intTemp = fats[j];
                    fats[j] = fats[j + 1];
                    fats[j + 1] = intTemp;
                }
            }
        }
    }
    public void sortItemsCalories(){ 
        int n = calories.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (calories[j] > calories[j+1]) {
                    // swap items[j+1] and items[j]
                    String temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;

                    double doubleTemp = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = doubleTemp;

                    int intTemp = calories[j];
                    calories[j] = calories[j + 1];
                    calories[j + 1] = intTemp;

                    intTemp = protein[j];
                    protein[j] = protein[j + 1];
                    protein[j + 1] = intTemp;

                    intTemp = carbs[j];
                    carbs[j] = carbs[j + 1];
                    carbs[j + 1] = intTemp;

                    intTemp = fats[j];
                    fats[j] = fats[j + 1];
                    fats[j + 1] = intTemp;
                }
            }
        }
    }
    public void sortItemsReverseCalories(){ 
        int n = calories.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (calories[j] < calories[j + 1]) {
                    // swap items[j+1] and items[j]
                    String temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;

                    double doubleTemp = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = doubleTemp;

                    int intTemp = calories[j];
                    calories[j] = calories[j + 1];
                    calories[j + 1] = intTemp;

                    intTemp = protein[j];
                    protein[j] = protein[j + 1];
                    protein[j + 1] = intTemp;

                    intTemp = carbs[j];
                    carbs[j] = carbs[j + 1];
                    carbs[j + 1] = intTemp;

                    intTemp = fats[j];
                    fats[j] = fats[j + 1];
                    fats[j + 1] = intTemp;
                }
            }
        }
    }
    public void sortItemsReverseProteins(){ 
        int n = protein.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (protein[j] < protein[j + 1]) {
                    // swap items[j+1] and items[j]
                    String temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;

                    double doubleTemp = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = doubleTemp;

                    int intTemp = calories[j];
                    calories[j] = calories[j + 1];
                    calories[j + 1] = intTemp;

                    intTemp = protein[j];
                    protein[j] = protein[j + 1];
                    protein[j + 1] = intTemp;

                    intTemp = carbs[j];
                    carbs[j] = carbs[j + 1];
                    carbs[j + 1] = intTemp;

                    intTemp = fats[j];
                    fats[j] = fats[j + 1];
                    fats[j + 1] = intTemp;
                }
            }
        }
    }
    public void sortItemsProteins(){ 
        int n = protein.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (protein[j] > protein[j + 1]) {
                    // swap items[j+1] and items[j]
                    String temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;

                    double doubleTemp = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = doubleTemp;

                    int intTemp = calories[j];
                    calories[j] = calories[j + 1];
                    calories[j + 1] = intTemp;

                    intTemp = protein[j];
                    protein[j] = protein[j + 1];
                    protein[j + 1] = intTemp;

                    intTemp = carbs[j];
                    carbs[j] = carbs[j + 1];
                    carbs[j + 1] = intTemp;

                    intTemp = fats[j];
                    fats[j] = fats[j + 1];
                    fats[j + 1] = intTemp;
                }
            }
        }
    }
    public void sortItemsReverseCarbs(){ 
        int n = carbs.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (carbs[j] < carbs[j + 1]) {
                    // swap items[j+1] and items[j]
                    String temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;

                    double doubleTemp = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = doubleTemp;

                    int intTemp = calories[j];
                    calories[j] = calories[j + 1];
                    calories[j + 1] = intTemp;

                    intTemp = protein[j];
                    protein[j] = protein[j + 1];
                    protein[j + 1] = intTemp;

                    intTemp = carbs[j];
                    carbs[j] = carbs[j + 1];
                    carbs[j + 1] = intTemp;

                    intTemp = fats[j];
                    fats[j] = fats[j + 1];
                    fats[j + 1] = intTemp;
                }
            }
        }
    }
    public void sortItemsCarbs(){ 
        int n = carbs.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (carbs[j] > carbs[j + 1]) {
                    // swap items[j+1] and items[j]
                    String temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;

                    double doubleTemp = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = doubleTemp;

                    int intTemp = calories[j];
                    calories[j] = calories[j + 1];
                    calories[j + 1] = intTemp;

                    intTemp = protein[j];
                    protein[j] = protein[j + 1];
                    protein[j + 1] = intTemp;

                    intTemp = carbs[j];
                    carbs[j] = carbs[j + 1];
                    carbs[j + 1] = intTemp;

                    intTemp = fats[j];
                    fats[j] = fats[j + 1];
                    fats[j + 1] = intTemp;
                }
            }
        }
    }
    public void sortItemsFats(){ 
        int n = fats.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (fats[j] > fats[j + 1]) {
                    // swap items[j+1] and items[j]
                    String temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;

                    double doubleTemp = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = doubleTemp;

                    int intTemp = calories[j];
                    calories[j] = calories[j + 1];
                    calories[j + 1] = intTemp;

                    intTemp = protein[j];
                    protein[j] = protein[j + 1];
                    protein[j + 1] = intTemp;

                    intTemp = carbs[j];
                    carbs[j] = carbs[j + 1];
                    carbs[j + 1] = intTemp;

                    intTemp = fats[j];
                    fats[j] = fats[j + 1];
                    fats[j + 1] = intTemp;
                }
            }
        }
    }
    public void sortItemsReverseFats(){ 
        int n = fats.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (fats[j] < fats[j + 1]) {
                    // swap items[j+1] and items[j]
                    String temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;

                    double doubleTemp = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = doubleTemp;

                    int intTemp = calories[j];
                    calories[j] = calories[j + 1];
                    calories[j + 1] = intTemp;

                    intTemp = protein[j];
                    protein[j] = protein[j + 1];
                    protein[j + 1] = intTemp;

                    intTemp = carbs[j];
                    carbs[j] = carbs[j + 1];
                    carbs[j + 1] = intTemp;

                    intTemp = fats[j];
                    fats[j] = fats[j + 1];
                    fats[j + 1] = intTemp;
                }
            }
        }
    }
    public void sortItemsPrice(){ 
        int n = price.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (price[j] > price[j + 1]) {
                    // swap items[j+1] and items[j]
                    String temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;

                    double doubleTemp = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = doubleTemp;

                    int intTemp = calories[j];
                    calories[j] = calories[j + 1];
                    calories[j + 1] = intTemp;

                    intTemp = protein[j];
                    protein[j] = protein[j + 1];
                    protein[j + 1] = intTemp;

                    intTemp = carbs[j];
                    carbs[j] = carbs[j + 1];
                    carbs[j + 1] = intTemp;

                    intTemp = fats[j];
                    fats[j] = fats[j + 1];
                    fats[j + 1] = intTemp;
                }
            }
        }
    }
    public void sortItemsReversePrice(){ 
        int n = price.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (price[j] < price[j + 1]) {
                    // swap items[j+1] and items[j]
                    String temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;

                    double doubleTemp = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = doubleTemp;

                    int intTemp = calories[j];
                    calories[j] = calories[j + 1];
                    calories[j + 1] = intTemp;

                    intTemp = protein[j];
                    protein[j] = protein[j + 1];
                    protein[j + 1] = intTemp;

                    intTemp = carbs[j];
                    carbs[j] = carbs[j + 1];
                    carbs[j + 1] = intTemp;

                    intTemp = fats[j];
                    fats[j] = fats[j + 1];
                    fats[j + 1] = intTemp;
                }
            }
        }
    }
    public String toString(){
        System.out.println("______________________________________");   
        String temp = "";         
        for (int i = 0; i<items.length;i++){
            String a = ("|2x Taco"+"|Calories:"+ calories[i]*2 +" |Fats: "+ fats[i]*2 +" |Proteins: "+ protein[i]*2 +" |Carbs: "+ carbs[i]*2 +"|");               
            temp = temp+" \n"+ a;
        }
        return temp;
    }
}
