package Objects;
public class cart {
    menu itemMenu[];
    public cart(menu tempMenu[]){
        menu itemMenu[] = tempMenu;
    }

    public void sortAlphebtical(){
        int n = itemMenu.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (itemMenu[j].getName().compareTo(itemMenu[j+1].getName()) > 0) {
                    menu temp = itemMenu[j];
                    itemMenu[j] = itemMenu[j + 1];
                    itemMenu[j + 1] = temp;
                }
            }
        }
    }
    public void sortReverseAlphebtical(){
        int n = itemMenu.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (itemMenu[j].getName().compareTo(itemMenu[j+1].getName()) < 0) {
                    menu temp = itemMenu[j];
                    itemMenu[j] = itemMenu[j + 1];
                    itemMenu[j + 1] = temp;
                }
            }
        }
    }
    public void sortCalories(){
        int n = itemMenu.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (itemMenu[i].getCals() > itemMenu[j].getCals()) {
                    menu temp = itemMenu[j];
                    itemMenu[j] = itemMenu[j + 1];
                    itemMenu[j + 1] = temp;
                }
            }
        }
    }
    public void sortReverseCalories(){
        int n = itemMenu.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (itemMenu[i].getCals() < itemMenu[j].getCals()) {
                    menu temp = itemMenu[j];
                    itemMenu[j] = itemMenu[j + 1];
                    itemMenu[j + 1] = temp;
                }
            }
        }
    }
    public void sortCarbs(){
        int n = itemMenu.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (itemMenu[i].getCarb() > itemMenu[j].getCarb()) {
                    menu temp = itemMenu[j];
                    itemMenu[j] = itemMenu[j + 1];
                    itemMenu[j + 1] = temp;
                }
            }
        }
    }
    public void sortReverseCarbs(){
        int n = itemMenu.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (itemMenu[i].getCarb() < itemMenu[j].getCarb()) {
                    menu temp = itemMenu[j];
                    itemMenu[j] = itemMenu[j + 1];
                    itemMenu[j + 1] = temp;
                }
            }
        }
    }
    public void sortFat(){
        int n = itemMenu.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (itemMenu[i].getFat() > itemMenu[j].getFat()) {
                    menu temp = itemMenu[j];
                    itemMenu[j] = itemMenu[j + 1];
                    itemMenu[j + 1] = temp;
                }
            }
        }
    }
    public void sortReverseFat(){
        int n = itemMenu.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (itemMenu[i].getFat() < itemMenu[j].getFat()) {
                    menu temp = itemMenu[j];
                    itemMenu[j] = itemMenu[j + 1];
                    itemMenu[j + 1] = temp;
                }
            }
        }
    }
    public void sortReverseProtein(){
        int n = itemMenu.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (itemMenu[i].getProtien() < itemMenu[j].getProtien()) {
                    menu temp = itemMenu[j];
                    itemMenu[j] = itemMenu[j + 1];
                    itemMenu[j + 1] = temp;
                }
            }
        }
    }

    public void sortProtein(){
        int n = itemMenu.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (itemMenu[i].getProtien() > itemMenu[j].getProtien()) {
                    menu temp = itemMenu[j];
                    itemMenu[j] = itemMenu[j + 1];
                    itemMenu[j + 1] = temp;
                }
            }
        }
    }
    public void sortPrice(){
        int n = itemMenu.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (itemMenu[i].getPrice() > itemMenu[j].getPrice()) {
                    menu temp = itemMenu[j];
                    itemMenu[j] = itemMenu[j + 1];
                    itemMenu[j + 1] = temp;
                }
            }
        }
    }

    public void combineItems(){
        
    }
    
    public String toString(){
        System.out.println("______________________________________");   
        String temp = "";         
        for (int i = 0; i<items.length;i++){
            if (calories[i]>0){
                temp = temp + "\n" + quality"X";
            }
        }
        return temp;
    }
}
