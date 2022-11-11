package menu.methods.AddingMethods;

import StonesContent.Necklace;
import StonesContent.Stonetypes.Stone;
import menu.Command;

import java.util.Scanner;

public class Del implements Command {
    @Override
    public void execute(Necklace content) {

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("\n *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* ");
            System.out.println("  |            ВВЕДІТЬ ІНДЕКС КАМЕНЯ ДЛЯ ВИДАЛЕННЯ              |");
            System.out.println(" *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* ");
            System.out.print("Ваш вибір-: ");
            int choice = Integer.parseInt(scanner.nextLine());
            content.getNeckStones().delStone(choice);
            System.out.println("Видалити ще один камінь? \n1 - Так \n2 - Ні");
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 2) { break; }
        }
    }
}