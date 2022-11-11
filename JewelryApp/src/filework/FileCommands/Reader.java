package filework.FileCommands;

import StonesContent.Necklace;
import filework.*;
import menu.Command;

import java.util.Scanner;

public class Reader implements Command {
    @Override
    public void execute(Necklace content) throws Exception {
        WorkFile fileRead = new WorkFile();
        Scanner reader = new Scanner(System.in);
        System.out.print("\nВведіть назву файлу-: ");
        String destination = reader.nextLine();

        try {
            content = fileRead.FileReader(destination);
        } catch (Exception e) {
            System.err.println("Знайдено критичну помилку: " + e);
            e.printStackTrace();
        }
    }
}
