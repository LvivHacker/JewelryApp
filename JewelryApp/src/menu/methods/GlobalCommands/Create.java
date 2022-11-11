package menu.methods.GlobalCommands;

import StonesContent.Necklace;
import menu.Command;

import java.util.Objects;
import java.util.Scanner;

public class Create implements Command{
    @Override
    public void execute(Necklace content) {

        if(Objects.equals(content.getNecklaceName(), "")) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("\nВведіть назву намиста-:");
            content.setNecklaceName(scanner.nextLine());
        }else {
            System.out.println("Намисто вже існує");
        }
    }
}
