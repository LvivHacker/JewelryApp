import StonesContent.Necklace;
import menu.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Necklace jewelery = new Necklace();
            Menu mainMenu = new Menu();

            while (true) {
                System.out.println("\nДоступні команди: " + mainMenu.getAllCommands());
                System.out.print(" Введіть команду-: ");
                String command = scanner.next();

                mainMenu.execute(command, jewelery);
            }
        }catch (Exception e) {
            System.err.println("Знайдено критичну помилку: " + e);
            e.printStackTrace();
        }
    }
}
