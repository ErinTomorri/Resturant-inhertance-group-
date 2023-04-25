package main;
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
    public cart(menu menu[]){
        for (int i = 0; i<menu.length; i++){
            items[i] = menu[i].getName();
            price[i] = menu[i].getPrice();
            calories[i] = menu[i].getCals();
            protein[i] = menu[i].getProtien();
            carbs[i] = menu[i].getCarb();
            fats[i] = menu[i].getCarb();
        }
    }
    public void combineItems(){
        for (int i = 0; i < items.length; i++) {
            for (int j = i + 1; j < items.length; j++) {
                if (items[i].equals(items[j])) {
                    items[j] = "";
                    price[i] += price[j];
                    price[j] = -1;
                    calories[i] += calories[j];
                    calories[j] = -1;
                    protein[i] += protein[j];
                    protein[j] = -1;
                    carbs[i] += carbs[j];
                    carbs[j] = -1;
                    fats[i] += fats[j];
                    fats[j] = -1;
                }
            }
        }
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
            if (calories[i]>0){
                temp = temp + "\n" + "";
            }
        }
        return temp;
    }
}
