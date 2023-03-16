package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<>();

    public void loadMenuData(){
        File file = new File("src/Task2/coffee.txt");
        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                coffeeMenu.add(scanner.nextLine());
            }

        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
    public ArrayList<String> getCoffeeMenu(){
        return this.coffeeMenu;
    }
}
